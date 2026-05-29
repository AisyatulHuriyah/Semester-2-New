package Jobsheet_1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] dataMatkul = {
            {"Civic", "2", "", "", ""},
            {"KTI", "2", "", "", ""},
            {"CTPS", "2", "", "", ""},
            {"Basic Math", "2", "", "", ""},
            {"Basic English", "2", "", "", ""},
            {"Basic Programming", "2", "", "", ""},
            {"Practicum Programming", "3", "", "", ""}, 
            {"K3", "2", "", "", ""}
        };

        double totalNilaiSKS = 0;
        int totalSKS = 0;

        System.out.println("===============================================");
        System.out.println("\tSEMESTER GPA CALCULATION PROGRAM");
        System.out.println("===============================================");

        // Input score
        for (int i = 0; i < dataMatkul.length; i++) {
            System.out.print("Input Score for " + dataMatkul[i][0] + " : ");
            double score = input.nextDouble();
            dataMatkul[i][2] = String.format("%.2f", score);

            // Konversi Grade
            if (score > 80 && score <= 100) {
                dataMatkul[i][3] = "A";  dataMatkul[i][4] = "4.00";
            } else if (score > 73) {
                dataMatkul[i][3] = "B+"; dataMatkul[i][4] = "3.50";
            } else if (score > 65) {
                dataMatkul[i][3] = "B";  dataMatkul[i][4] = "3.00";
            } else if (score > 60) {
                dataMatkul[i][3] = "C+"; dataMatkul[i][4] = "2.50";
            } else if (score > 50) {
                dataMatkul[i][3] = "C";  dataMatkul[i][4] = "2.00";
            } else if (score > 39) {
                dataMatkul[i][3] = "D";  dataMatkul[i][4] = "1.00";
            } else {
                dataMatkul[i][3] = "E";  dataMatkul[i][4] = "0.00";
            }

            // calculate
            int sks = Integer.parseInt(dataMatkul[i][1]);
            double bobot = Double.parseDouble(dataMatkul[i][4]);
            
            totalNilaiSKS += (bobot * sks);
            totalSKS += sks;
        }

        // Output Table
        System.out.println("\n=============================================================================");
        System.out.println("\t\t\tConversion Result");
        System.out.println("=============================================================================");
        System.out.printf("%-25s %-10s %-15s %-12s %-10s\n", "MK", "SKS", "Score", "Grade", "GPA");
        
        for (int i = 0; i < dataMatkul.length; i++) {
            System.out.printf("%-25s %-10s %-15s %-12s %-10s\n", 
                dataMatkul[i][0], dataMatkul[i][1], dataMatkul[i][2], dataMatkul[i][3], dataMatkul[i][4]);
        }

        // Calculate Final IP Semester
        double gpa = totalNilaiSKS / totalSKS;

        System.out.println("=============================================================================");
        System.out.printf("GPA Semester : %.2f\n", gpa);
        System.out.println("=============================================================================");
    }
}