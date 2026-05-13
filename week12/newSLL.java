package week12;

public class newSLL {
    node head;
    node tail;

    boolean isEmpty() {
        return (head == null);
    }

    void print() {
        if (!isEmpty()) {
            node tmp = head;
            System.out.println("LinkedList Data:");
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("LinkedList is empty!");
        }
    }

    void addFirst(student std) {
        node newNode = new node(std, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(student std) {
        node newNode = new node(std, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter(student std, String key) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa insertAfter.");
            return;
        }

        node newNode = new node(std, null);
        node temp = head;
        boolean found = false;

        do {
            if (temp.data.name != null && temp.data.name.equalsIgnoreCase(key)) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                found = true;
                break;
            }
            temp = temp.next;
        } while (temp != null);

        if (!found) {
            System.out.println("Student " + key + " not found.");
        }
    }

    public void insertAt(int index, student std) {
        if (index < 0) {
            System.out.println("Wrong index!");
        } else if (index == 0) {
            addFirst(std);
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new node(std, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    student getData(int idx) {
        if (isEmpty()) {
            System.out.println("linkedList is empty!");
            return null;
        }
        node tmp = head;
        for (int i = 0; i < idx; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty");
            return -1;
        }
        node tmp = head;
        int idx = 0;
        while (tmp != null && !tmp.data.name.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            idx++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return idx;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            node tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!");
            return;
        }

        if (head.data.name.equalsIgnoreCase(key)) {
            removeFirst();
            return;
        }

        node temp = head;
        while (temp.next != null) {
            if (temp.next.data.name.equalsIgnoreCase(key)) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
                return; // selesai
            }
            temp = temp.next;
        }

        System.out.println("Student " + key + " not found.");
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}