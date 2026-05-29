package Jobsheet_2;

public class CourseMain04 {
    public static void main(String[] args) {
        Course04 crs1 = new Course04();
        crs1.courseCode = "ALSD_2026";
        crs1.nameCourse = "Algorithm and Data Structure";
        crs1.credits = 3;
        crs1.numberHours = 6;

        Course04 crs2 = new Course04("DB_2026", "Data Base", 2, 4);

        Course04 crs3 = new Course04();
        crs3.courseCode = "MAD";
        crs3.nameCourse = "Math Advanced";
        crs3.credits = 2;
        crs3.numberHours = 3;
        
        System.out.println("=== Information Course 1 ===");
        crs1.showInformation();
        crs1.changeCredits(4);
        crs1.addHours(2);
        crs1.showInformation();

        System.out.println("-----------------------------------");
        
        System.out.println("=== Information Coures 2 ===");
        crs2.showInformation();
        crs2.decreaseHours(5);
        crs2.decreaseHours(2);
        crs2.showInformation();

        System.out.println("-----------------------------------");
        
        System.out.println("=== Information Coures 3 ===");
        crs3.showInformation();
        crs3.changeCredits(4);
        crs3.addHours(2);
        crs3.showInformation();
    }
}
