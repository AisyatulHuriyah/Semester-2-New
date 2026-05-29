package Jobsheet_3.Practicum04;
import java.util.Scanner;

public class StudentDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student04 [] arrayOfStudent04 = new Student04[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfStudent04[i] = new Student04();

            System.out.println("Input Student Data For- " + (i + 1));
            System.out.print("NIM       : ");
            arrayOfStudent04[i].nim = sc.nextLine();
            System.out.print("NAME      : ");
            arrayOfStudent04[i].name = sc.nextLine();
            System.out.print("CLASS     : ");
            arrayOfStudent04[i].Class = sc.nextLine();
            System.out.print("GPA       : ");
            dummy = sc.nextLine();
            arrayOfStudent04[i].gpa = Float.parseFloat(dummy);
            System.out.println("------------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Student Data For-" + (i + 1));
            System.out.println("NIM      : " + arrayOfStudent04[i].nim);
            System.out.println("NAME     : " + arrayOfStudent04[i].name);
            System.out.println("CLASS    : " + arrayOfStudent04[i].Class);
            System.out.println("GPA      : " + arrayOfStudent04[i].gpa);
            System.out.println("------------------------------------------");
        }
       
    }
}