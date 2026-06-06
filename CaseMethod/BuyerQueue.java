package CaseMethod;

public class BuyerQueue {
    Node head;
    Node tail;

    BuyerQueue() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addLast(Buyer data, int queueNumber) {
        Node newNode = new Node(data, queueNumber);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!!!");
            return;
        }
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.println("No Antrian\tNama\t\tNo HP");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.queueNumber + "\t");
            temp.data.print();
            System.out.println();
            temp = temp.next;
        }
        System.out.println();
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeByQueueNumber(int targetNumber) {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
        return;
    }
    Node current = head;
    while (current != null) {
        if (current.queueNumber == targetNumber) {

            if (current == head && current == tail) {
                head = tail = null;
            } else if (current == head) {
                head = head.next;
                head.prev = null;
            } else if (current == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                current.prev.next = current.next;
               current.next.prev = current.prev;
            }
            System.out.println("Antrian nomor " + targetNumber + " (" + current.data.Name + ") telah dihapus.");
            return;
        }
        current = current.next;
    }
    }

    Buyer getFirstBuyer() {
        if (isEmpty()) return null;
        return head.data;
    }

    int getFirstQueueNumber() {
        if (isEmpty()) return -1;
        return head.queueNumber;
    }

    int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}