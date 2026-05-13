package week12;

public class student {
    String nim, name, className;
    double gpa;

    public student() {
    }

    public student(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}