package Jobsheet_1;

public class function {
    
    // Deklarasi di awal
    static int[][] stock = {
        {10, 5, 15, 7}, // Branch 1
        {6, 11, 9, 12}, // Branch 2
        {2, 10, 10, 5}, // Branch 3
        {5, 7, 12, 9}   // Branch 4
    };
    
    // Harga: Aglonema, Keladi, Alocasia, Mawar
    static int[] prices = {75000, 50000, 60000, 10000}; 

    public static void main(String[] args) {
        System.out.println("==============================================================");
        System.out.println("BRANCH\t\t\tINCOME\t\t\tSTATUS");
        System.out.println("==============================================================");

        // call function untuk proses hitung dan tampil
        showreport();
    }

    // logic function
    static void showreport() {
        for (int i = 0; i < stock.length; i++) {
            int totalIncome = 0;
            
            for (int j = 0; j < stock[i].length; j++) {
                totalIncome += stock[i][j] * prices[j];
            }

            // set the status
            String status;
            if (totalIncome > 1500000) {
                status = "Very Good";
            } else {
                status = "Need Evaluation";
            }

            // Output
            System.out.println("Royal Garden " + (i + 1) + "\t\tIDR " + totalIncome + "\t\t" + status);
        }
    }
}