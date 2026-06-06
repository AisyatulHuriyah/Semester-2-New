package Week14;

public class BinaryTree04 {
    Node04 root;

    public BinaryTree04() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Student04 data) {
        if (isEmpty()) {
            root = new Node04(data);
        } else {
            Node04 current = root;
            while (true) {
                if (data.ipk < current.data.ipk) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node04(data);
                        break;
                    }
                } else if (data.ipk > current.data.ipk) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node04(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node04 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.data.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node04 node) {
        if (node != null) {
            node.data.print();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node04 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.print();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node04 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.print();
        }
    }

    Node04 getSuccessor(Node04 del) {
        Node04 successor = del.right;
        Node04 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node04 parent = root;
        Node04 current = root;
        boolean isLeftChild = false;
        while (current.data.ipk != ipk) {
            parent = current;
            if (ipk < current.data.ipk) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Couldn't fiind data!");
                return;
            }
        }

        // delete node with no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) { // delete node with a left child
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.right;
            }
        } else { // delete node with 2 children
            Node04 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

    // Method untuk memulai penambahan rekursif
    void addRekursif(Student04 data) {
        root = addRekursif(root, data);
    }

    // Method helper rekursif
    Node04 addRekursif(Node04 current, Student04 data) {
        if (current == null) {
            return new Node04(data);
        }
        if (data.ipk < current.data.ipk) {
            current.left = addRekursif(current.left, data);
        } else if (data.ipk > current.data.ipk) {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    // Mendapatkan IPK terkecil (node paling kiri)
    public Student04 getMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return null;
        }
        Node04 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // Mendapatkan IPK terbesar (node paling kanan)
    public Student04 getMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return null;
        }
        Node04 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public void displayStudentsWithIPKAbove(double threshold) {
        System.out.println("Students with IPK above " + threshold + ":");
        displayStudentsWithIPKAbove(root, threshold);
    }

    void displayStudentsWithIPKAbove(Node04 node, double threshold) {
        if (node == null)
            return;
        displayStudentsWithIPKAbove(node.left, threshold);
        if (node.data.ipk > threshold) {
            node.data.print();
        }
        displayStudentsWithIPKAbove(node.right, threshold);
    }
}