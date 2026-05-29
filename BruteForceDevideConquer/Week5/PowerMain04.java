package BruteForceDevideConquer.Week5;

import java.util.Scanner;

public class PowerMain04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input element number : ");
        int elemen = input.nextInt();
        
        Power04[] png = new Power04[elemen];
        for(int i = 0; i < elemen; i++){
            System.out.print("Input base number for " + ( i + 1 ) + "th element : ");
            int basis = input.nextInt();
            System.out.print("Input exponent for " + ( i + 1 ) + "th element : ");
            int exp = input.nextInt();
            png[i] = new Power04(basis, exp);
        }
        
        System.out.println("POWER RESULT USING BRUTEFORCE:");
        for (Power04 p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerBF(p.baseNumber, p.exponent));
        }
        
        System.out.println("POWER RESULT USING DIVIDE AND CONQUER:");
        for (Power04 p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerDC(p.baseNumber, p.exponent));
        }
    }
}
