package Jobsheet10_Stack;

public class Student04 {
    String nim;
    String name;
    String className;
    int grade;

    Student04(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }

    public void grading(int grade) {
        this.grade = grade;
    }
}
