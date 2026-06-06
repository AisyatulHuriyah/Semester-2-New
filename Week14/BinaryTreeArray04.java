package Week14;

public class BinaryTreeArray04 {
    Student04[] data;
    int idxLast;

    public BinaryTreeArray04() {
        data = new Student04[10];
        idxLast = -1;
    }

    void populateData(Student04[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Menambah data ke array
    public void add(Student04 data) {
        if (idxLast + 1 >= this.data.length) {
            System.out.println("Tree array is full!");
            return;
        }
        this.data[++idxLast] = data;
    }

    // Traversal pre-order
    public void traversePreOrder() {
        traversePreOrder(0);
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != null) {
            data[idxStart].print();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}