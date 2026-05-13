package week12;

public class node {
    student data;
    node next;

    public node() {
    }

    public node(student data, node next) {
        this.data = data;
        this.next = next;
    }
}