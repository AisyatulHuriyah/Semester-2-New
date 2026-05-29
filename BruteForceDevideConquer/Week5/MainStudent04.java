package BruteForceDevideConquer.Week5;

import java.util.Scanner;

public class MainStudent04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of Students: ");
        int n = inp.nextInt();

        Student04[] std = new Student04[n];

        for (int i = 0; i < n; i++) {
            System.out.println("---- Student #" + (i + 1) + " ----");
            inp.nextLine();
            System.out.print("Name           : ");
            String name = inp.nextLine();
            System.out.print("NIM            : ");
            String nim = inp.nextLine();
            System.out.print("Admission Year : ");
            int year = inp.nextInt();
            System.out.print("Midterm Score  : ");
            int uts = inp.nextInt();
            System.out.print("Final Score    : ");
            int uas = inp.nextInt();
            
            std[i] = new Student04(name, nim, year, uts, uas);
        }

        int max = std[0].maxUTS(std, 0, n - 1);
        int min = std[0].minUTS(std, 0, n - 1);
        double avg = std[0].avgUAS(std);

        System.out.println("\n=== RESULT ===");
        System.out.println("Highest Midterm Score (DC) : " + max);
        System.out.println("Lowest Midterm Score (DC)  : " + min);
        System.out.println("Final Score average (BF)   : " + avg);

        inp.close();
    }
}