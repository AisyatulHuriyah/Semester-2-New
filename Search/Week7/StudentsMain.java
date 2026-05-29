package Search.Week7;
import java.util.Scanner;

public class StudentsMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int amountStudent = 5;
        SearchStudent data = new SearchStudent(amountStudent);

        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("---------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            s.nextLine();
            System.out.print("Name\t: ");
            String name = s.nextLine();  
            System.out.print("Age\t: ");
            int age = s.nextInt();
            s.nextLine();
            System.out.print("GPA\t: ");
            double gpa = s.nextDouble();
            s.nextLine();

            Students std = new Students(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("---------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("___________________________");
        System.out.println("___________________________");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Sequentaial Search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);

        data.showData(search, position);
    }

}