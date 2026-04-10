package Week5;

import java.util.Scanner;

public class StudentDemo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        TopStudents04 topStudents = new TopStudents04(n);

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter data for student " + (i + 1) + " ---");
            
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Class: ");
            String studentClass = scanner.nextLine();
            
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            
            topStudents.add(new Student04(nim, name, studentClass, gpa));
        }

        System.out.println("\nOriginal student list: ");
        topStudents.print();

        topStudents.bubbleSort();
        System.out.println("\nSorted student list (by GPA, descending): ");
        topStudents.print();
        System.out.println();

        topStudents.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Selection sort: ");
        topStudents.print();
        System.out.println();

        scanner.close();
    }
}