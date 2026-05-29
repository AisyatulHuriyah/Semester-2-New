package Jobsheet_2;

public class Student04 {
    String name;
    String nim;
    String Class;
    double gpa;

    public Student04(){

    }

    public Student04(String name, String nim, String Class, double gpa) {
        this.name = name;
        this.nim = nim;
        this.Class = Class;
        this.gpa = gpa;
    }

    void showInformation() {
        System.out.println("Name : " + name);
        System.out.println("NIM : " + nim);
        System.out.println("GPA : " + gpa);
        System.out.println("Class : " + Class);
    }

    void changeClass(String newClass) {
        Class = newClass;
    }

    void updateGpa(double newGpa) {
        if (newGpa >= 0.0 && newGpa <= 4.0) {
            gpa = newGpa;
        } else {
            System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
        }
    }

    String performance() {
        if (gpa >=3.5) {
            return "Excellent Performance";
        } else if (gpa >=3.0) {
            return "Good Performance";
        } else if (gpa >= 2.0) {
            return "Fair Performance";
        } else {
            return "Poor Performance";
        }
    }
}
