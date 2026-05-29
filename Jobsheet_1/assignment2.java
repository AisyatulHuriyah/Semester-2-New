package Jobsheet_1;

import java.util.Scanner;

public class assignment2 {
    // deklarasi
    static String[][] schedule;
    static int n;
    static Scanner sc = new Scanner(System.in);

    // Functions
    static void inputSchedule() {
        for (int i = 0; i < n; i++) { //masukkan banyak nya matkul
            System.out.println("\nCourse Data #" + (i + 1));
            System.out.print("Course Name\t: ");
            schedule[i][0] = sc.nextLine();
            System.out.print("Room\t\t: ");
            schedule[i][1] = sc.nextLine();
            System.out.print("Day\t\t: ");
            schedule[i][2] = sc.nextLine();
            System.out.print("Time\t\t: ");
            schedule[i][3] = sc.nextLine();
        }
    }

    static void showAll() {
        System.out.println("\n====================================================================");
        System.out.println("Course\t\tRoom\t\tDay\t\tTime");
        System.out.println("====================================================================");
        for (int i = 0; i < n; i++) {
            System.out.println(schedule[i][0] + "\t\t" + schedule[i][1] + "\t\t" + schedule[i][2] + "\t\t" + schedule[i][3]);
        }
    }

    static void searchByDay() { //cari berdasarkan hari
        System.out.print("Input Day to Search: ");
        String search = sc.nextLine();
        boolean found = false;

        System.out.println("\nSchedule for " + search + ":");
        for (int i = 0; i < n; i++) {
            if (schedule[i][2].equalsIgnoreCase(search)) {
                System.out.println(schedule[i][0] + "\t\t" + schedule[i][1] + "\t\t" + schedule[i][3]);
                found = true;//untuk ngecek ada atau ga
            }
        }

        if (!found) {// ni kalau ga ada data yang sesuai
            System.out.println("No data exist for " + search + ".");
        }
    }

    static void searchByName() {//cari berdasarkan nama matkul
        System.out.print("Input Course Name to Search: ");
        String search = sc.nextLine();
        boolean found = false;

        System.out.println("\nSearch Result for '" + search + "':");
        for (int i = 0; i < n; i++) {
            if (schedule[i][0].equalsIgnoreCase(search)) {
                System.out.println("Course: " + schedule[i][0] + "\nRoom: " + schedule[i][1] + "\nDay: " + schedule[i][2] + "\nTime: " + schedule[i][3]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No data exist for course: " + search);
        }
    }

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("  STUDENT'S LECTURE SCHEDULE ");
        System.out.println("================================");
        
        System.out.print("Input number of courses: ");
        n = sc.nextInt();
        sc.nextLine();

        schedule = new String[n][4];

        inputSchedule();

        int choice;
        do {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Display All Schedules");
            System.out.println("2. Search by Day");
            System.out.println("3. Search by Course Name");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                showAll();
            } else if (choice == 2) {
                searchByDay();
            } else if (choice == 3) {
                searchByName();
            } else if (choice == 4) {
                System.out.println("Thank you for using the program!");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
            
        } while (choice != 4);
        
        sc.close();
    }
}