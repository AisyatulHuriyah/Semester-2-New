package Week5;

import java.util.Scanner;

public class LecturerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LecturerData04 data = new LecturerData04();

        while (true) {
            System.out.println("\n=== TEACHING TEAM OF ALGORITHM AND DATA STRUCTURE ===");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Bubble Sort - youngest to oldest)");
            System.out.println("4. Sort DSC (Selection Sort - oldest to youngest)");
            System.out.println("5. Exit");
            System.out.print("Choose menu: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Add Lecturer Data ---");
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Gender (true = Male, false = Female): ");
                    boolean gender = scanner.nextBoolean();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    
                    data.add(new Lecturer04(id, name, gender, age));
                    System.out.println("Lecturer added successfully!");
                    break;
                    
                case 2:
                    System.out.println("\n--- Lecturer Data ---");
                    data.print();
                    break;
                    
                case 3:
                    data.bubbleSortAsc();
                    System.out.println("\n--- Sorted Data (ASC) ---");
                    data.print();
                    break;
                    
                case 4:
                    data.selectionSortDesc();
                    System.out.println("\n--- Sorted Data (DESC) ---");
                    data.print();
                    break;
                    
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}