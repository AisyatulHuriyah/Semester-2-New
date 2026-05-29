package Jobsheet_2;

public class Course04 {
    String courseCode;
    String nameCourse;
    int credits;
    int numberHours;

    public Course04() {
    }

    public Course04(String courseCode, String name, int sks, int totalHours) {
        this.courseCode = courseCode;
        this.nameCourse = nameCourse;
        this.credits = credits;
        this.numberHours = numberHours;
    }

    void showInformation() {
        System.out.println("Course Code : " + courseCode);
        System.out.println("Name Course : " + nameCourse);
        System.out.println("Credit : " + credits);
        System.out.println("Number Hours : " + numberHours);
    }

    void changeCredits(int newCredits) {
        this.credits = newCredits;
        System.out.println("Succes to change SKS to : " + credits);
    }

    void addHours(int newHours) {
        this.numberHours += newHours;
        System.out.println("Succes to change hours. Total Hours now : " + numberHours);
    }

    void decreaseHours(int newHours) {
        if (this.numberHours >= newHours) {
            this.numberHours -= newHours;
            System.out.println("The time has been successfully reduced. Remaining hours : " + numberHours);
        } else {
            System.out.println("Can't reduce hours. Hours are insufficient");
        }
    }
}
