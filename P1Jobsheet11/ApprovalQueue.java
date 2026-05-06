package P1Jobsheet11;

public class ApprovalQueue {
    Student[] data;
    int front, rear, size, max;
    int processed;
    int totalEnqueued;
    final int MAX_DPA = 30;

    public ApprovalQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
        processed = 0;
        totalEnqueued = 0;
    }

    boolean isFull() {
        return size == max;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Front data: ");
            data[front].print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void peek2() {
        if (size >= 2) {
            System.out.println("First two students:");
            data[front].print();
            data[(front + 1) % max].print();
        } else if (size == 1) {
            System.out.println("Only one student in queue:");
            data[front].print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void rear() {
        if (!isEmpty()) {
            System.out.println("Rear data: ");
            data[rear].print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
        System.out.println("Number of element: " + size);
    }

    void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("All data has been successfully removed!");
        } else {
            System.out.println("Queue is already empty!");
        }
    }

    void enqueue(Student dt) {
        if (totalEnqueued >= MAX_DPA) {
            System.out.println("DPA has reached max capacity (30 students). Cannot add more.");
            return;
        }
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
        }
        data[rear] = dt;
        size++;
        totalEnqueued++;
        System.out.printf("%s is successfully added at index %d\n", dt.name, rear);
    }

    Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        Student dt = data[front];
        size--;
        if (isEmpty()) {
            front = 0;
            rear = -1;
        } else {
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
        return dt;
    }

    void process() {
        if (size < 2) {
            System.out.println("Not enough students to process (need at least 2).");
            return;
        }
        System.out.println("Processing 2 students:");
        for (int i = 0; i < 2; i++) {
            Student std = dequeue();
            if (std != null) {
                std.print();
                processed++;
            }
        }
        System.out.println("Session completed. Total processed: " + processed);
    }

    int currentQueueSize() {
        return size;
    }

    int processedCount() {
        return processed;
    }

    int notYetApproved() {
        return totalEnqueued - processed;
    }
}