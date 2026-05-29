package Jobsheet_1;

import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Programm to Calculate Final Grade ===");

        // Input score
        System.out.println("\n--- Input Grade ---");
        System.out.print("Score Assignment   : ");
        double scoreAssignment = input.nextDouble();
        System.out.print("Score Quiz  \t.  : ");
        double scoreQuiz = input.nextDouble();
        System.out.print("Score Midterm Exam : ");
        double scoreMidterm = input.nextDouble();
        System.out.print("Score Final Exam   : ");
        double scoreFinalexam = input.nextDouble();

        // calculate final score
        if (scoreAssignment > 100 || scoreQuiz > 100 ||scoreMidterm > 100 ||scoreFinalexam > 100) {
            System.out.println("\nScore doesn't valid. Please enter the correct score.");
            return;
        }

        double finalScore = (scoreAssignment * 0.2) + (scoreQuiz * 0.2) + (scoreMidterm * 0.3) + (scoreFinalexam * 0.3);

        // Konversi nilai huruf
        String grade;
        if (finalScore > 80 && finalScore <= 100) {
            grade = "A";
        } else if (finalScore > 73 && finalScore <= 80) {
            grade = "B+";
        } else if (finalScore > 65 && finalScore <= 73) {
            grade = "B";
        } else if (finalScore > 60 && finalScore <= 65) {
            grade = "C+";
        } else if (finalScore > 50 && finalScore <= 60) {
            grade = "C";
        } else if (finalScore > 39 && finalScore <= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Semester status
        String statusSemester;
        if (finalScore >= 50) {
            statusSemester = "YOU PASS";
        } else {
            statusSemester = "YOU NOT PASS";
        }

        System.out.println("\n=== FINAL RESULT ===");
        System.out.printf("Total Score \t: %s", finalScore);
        System.out.println("\nSemester Status : " + statusSemester);
        System.out.println("Grade \t\t: " + grade);

    }
}
