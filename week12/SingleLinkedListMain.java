package week12;

import P1Jobsheet11.Student;

public class SingleLinkedListMain {
   public static void main(String[] args) { 
        SingleLinkedList sll = new SingleLinkedList(); 
         
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
    } 
}
