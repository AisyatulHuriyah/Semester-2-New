package CaseMethod;

public class Node {
    Buyer data;
    int queueNumber;
    Node prev;
    Node next;

    Node() {
    }

    Node(Buyer data, int queueNumber) {
        this.data = data;
        this.queueNumber = queueNumber;
        prev = null;
        next = null;
    }

    Node(Node prev, Buyer data, int queueNumber, Node next) {
        this.data = data;
        this.queueNumber = queueNumber;
        this.prev = prev;
        this.next = next;
    }
}