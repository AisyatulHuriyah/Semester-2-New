package Jobsheet_3.Practicum04;

import java.util.Scanner;

public class LecturerDemo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many lecturers will you input? ");
        int amount = Integer.parseInt(scanner.nextLine());
        Lecturer04[] arrayOfLecturer = new Lecturer04[amount];

        // loop
        for (int i = 0; i < amount; i++) {
            System.out.println("\nInput Lecturer Data No-" + (i + 1));
            
            System.out.print("Code          : ");
            String code = scanner.nextLine();
            
            System.out.print("Name          : ");
            String name = scanner.nextLine();
            
            System.out.print("Gender (M/F)  : ");
            String genderInput = scanner.nextLine();
            boolean gender = genderInput.equalsIgnoreCase("M");
            
            System.out.print("Age           : ");
            int age = Integer.parseInt(scanner.nextLine());
            
            System.out.println("----------------------------------------");
            arrayOfLecturer[i] = new Lecturer04(code, name, gender, age);
        }

        LecturerData04 dataHelper = new LecturerData04();
        
        // Menu System
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n========= MENU ANALYSIS =========");
            System.out.println("1. Show All Lecturers Data");
            System.out.println("2. Total Lecturers per Gender");
            System.out.println("3. Average Age per Gender");
            System.out.println("4. Oldest Lecturer Information");
            System.out.println("5. Youngest Lecturer Information");
            System.out.println("0. Exit Program");
            System.out.print("Choose Menu (0-5): ");
            
            int choice = Integer.parseInt(scanner.nextLine());
            System.out.println("---------------------------------");

            switch (choice) {
                case 1:
                    dataHelper.dataAllDosen(arrayOfLecturer);
                    break;
                case 2:
                    dataHelper.numberOfLecturersPerGender(arrayOfLecturer);
                    break;
                case 3:
                    dataHelper.AverageAgeOfLecturersPerGender(arrayOfLecturer);
                    break;
                case 4:
                    dataHelper.infoDosenPalingTua(arrayOfLecturer);
                    break;
                case 5:
                    dataHelper.infoDosenMostYoungest(arrayOfLecturer);
                    break;
                case 0:
                    isRunning = false;
                    System.out.println("Exiting Program... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}