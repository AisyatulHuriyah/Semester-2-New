package Jobsheet_2;

public class StudentMain04 {
    public static void main(String[] args) {
        Student04 mhs1 = new Student04();
        mhs1.name = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.Class = "SI 2J";
        mhs1.gpa = 3.55;

        mhs1.showInformation();
        mhs1.changeClass("SI 2J");
        mhs1.updateGpa(3.60);
        mhs1.showInformation();

        Student04 mhs2 = new Student04("Annisa nabila", "2141720160", "TI 2L", 3.25);
        mhs2.updateGpa(3.30);
        mhs2.showInformation();

        Student04 mhs3 = new Student04("Aisyatul Huriyah", "254107060088", "SIB 1G", 3.99);
        mhs3.showInformation();
    }
}
