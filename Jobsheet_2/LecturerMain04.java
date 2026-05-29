package Jobsheet_2;

public class LecturerMain04 {
    public static void main(String[] args) {
        Lecturer04 l1 = new Lecturer04();
        l1.idLecturer = "LTR01";
        l1.name = "Mr. Bagus budi, M.T. ";
        l1.activeStatus = true;
        l1.yearOfEntry = 2021;
        l1.expertiseCompetency = "Database";

        Lecturer04 l2 = new Lecturer04("LTR02", "Mr. Firman Hadi, S, Kom. ", true, 2016, "Networking");

        Lecturer04 l3 = new Lecturer04();
        l3.idLecturer = "LTR03";
        l3.name = "Mrs. Riya Aminah, S.Kom";
        l3.activeStatus = false;
        l3.yearOfEntry = 2023;
        l3.expertiseCompetency = "Mathematic Advanced";

        System.out.println("=== data Lecturer 1 ===");
        l1.showInformation();
        System.out.println("Working Period : " + l1.calculateTimeWork(2026) +" Year");

        System.out.println("Data Lecturer 2 ===");
        l2.showInformation();
        l2.setActiveStatus(false);
        l2.changeSkill("Cloud Computing");
        l2.showInformation();
        System.out.println("Working Period : " + l2.calculateTimeWork(2026) + " + years");
    }
}
