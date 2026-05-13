package week12;

public class newSLLMain {
    public static void main(String[] args) {
        newSLL sll = new newSLL();

        student std1 = new student("001", "Student 1", "TI-1I", 3.89);
        student std2 = new student("002", "Student 2", "TI-1I", 3.45);
        student std3 = new student("003", "Student 3", "TI-1I", 3.20);
        student std4 = new student("004", "Student 4", "TI-1I", 3.00);

        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();

        System.out.println("\nData at index 1 is:");
        student data = sll.getData(1);
        data.print();
        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}