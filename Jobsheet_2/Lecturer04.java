package Jobsheet_2;

public class Lecturer04 {
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    public Lecturer04() {
    }

    public Lecturer04(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String experiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = experiseCompetency;
    }

    void showInformation() {
        System.out.println("ID Lecturer : " + idLecturer);
        System.out.println("Name : " + name);
        System.out.println("Active Status : " + (activeStatus ? "Active" : "Non Active"));
        System.out.println("Year Of Entry : " + yearOfEntry);
        System.out.println("Expertise Competency : " + expertiseCompetency);
    }

    void setActiveStatus(boolean status) {
        this.activeStatus = status;
        System.out.println("Active Lecturer Ststus : " + name + " has been change");
    }

    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    void changeSkill(String newSkill) {
        this.expertiseCompetency = newSkill;
    }
}
