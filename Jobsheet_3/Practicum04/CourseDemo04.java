package Jobsheet_3.Practicum04;

import java.util.Scanner;

public class CourseDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course04[] arrayOfCourse04 = new Course04[3];
        String code, name, dummy;
        int credit, totalHours;

        for(int i = 0; i < 3; i++) {
            System.out.println("Input Course Data No - " + (i + 1));
            arrayOfCourse04[i] = new Course04(); 
            arrayOfCourse04[i].addData(sc);
            System.out.println("---------------------------");
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Course Data No - " + (i + 1));
            arrayOfCourse04[i].printInfo();
        }
    }
}