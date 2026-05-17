package week12.Assignment;

public class StudentQueue {
    Node front, rear;
    int size;

    public StudentQueue() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; 
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue has been cleared.");
    }

    public void enqueue(Student std) {
        Node newNode = new Node(std, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(std.name + " added to the queue.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No student to call.");
            return;
        }
        System.out.println("Calling student: " + front.data.name);
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public void peekFrontRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Front : "); front.data.print();
        System.out.print("Rear  : "); rear.data.print();
    }

    public int getSize() {
        return size;
    }
}