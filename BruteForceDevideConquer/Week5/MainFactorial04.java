package BruteForceDevideConquer.Week5;

import java.util.Scanner;

public class MainFactorial04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input a Number : ");
        int num = input.nextInt();

        Factorial04 fk = new Factorial04();
        System.out.println("The factorial of " + num + "using BF : " + fk.factorialBF(num));
        System.out.println("The factorial of " + num + "using DC : " + fk.factorialDC(num));
    }
}
