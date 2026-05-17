package week12.Assignment;

import java.util.Scanner;

public class MainStudentQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentQueue queue = new StudentQueue();
        int choice;

        do {
            System.out.println("\n=== STUDENT SERVICE QUEUE ===");
            System.out.println("1. Add Student (Enqueue)");
            System.out.println("2. Call Next Student (Dequeue)");
            System.out.println("3. Show Front & Rear");
            System.out.println("4. Total Students");
            System.out.println("5. Check Empty/Full");
            System.out.println("6. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM   : "); String nim = sc.nextLine();
                    System.out.print("Name  : "); String name = sc.nextLine();
                    System.out.print("Class : "); String cls = sc.nextLine();
                    System.out.print("GPA   : "); double gpa = sc.nextDouble();
                    sc.nextLine();
                    queue.enqueue(new Student(nim, name, cls, gpa));
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peekFrontRear();
                    break;

                case 4:
                    System.out.println("Total students waiting: " + queue.getSize());
                    break;

                case 5:
                    System.out.println("Empty? " + queue.isEmpty());
                    System.out.println("Full?  " + queue.isFull());
                    break;

                case 6:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}