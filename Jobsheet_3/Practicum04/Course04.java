package Jobsheet_3.Practicum04;

import java.util.Scanner;

public class Course04 {
    public String code;
    public String name;
    public int credit;
    public int totalHours;

    public Course04() {

    }

    public Course04(String code, String name, int credit, int totalHours) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.totalHours = totalHours;
    }

    public void addData(Scanner sc) {
        System.out.print("Code        : ");
        this.code = sc.nextLine();
        System.out.print("Name        : ");
        this.name = sc.nextLine();
        System.out.print("Credit      : ");
        String dummy = sc.nextLine();
        this.credit = Integer.parseInt(dummy);
        System.out.print("Total Hours : ");
        dummy = sc.nextLine();
        this.totalHours = Integer.parseInt(dummy);
    }

    public void printInfo() {
        System.out.println("Code        : " + code);
        System.out.println("Name        : " + name);
        System.out.println("Credit      : " + credit);
        System.out.println("Total Hours : " + totalHours);
        System.out.println("---------------------------");
    }
}
