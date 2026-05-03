package Jobsheet10_Stack;

import java.util.Scanner;

public class StudentDemo04 {
    public static void main(String[] args) {
        StudentAssignmentStack04 stack = new StudentAssignmentStack04(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Collect the Assignment");
            System.out.println("2. Grade the Assignment");
            System.out.println("3. View top Assignment");
            System.out.println("4. View all Assignment");
            System.out.println("5. View First Submitted Assignment");
            System.out.print("Choose : ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Name : ");
                    String nama = scan.nextLine();
                    System.out.print("NIM : ");
                    String nim = scan.nextLine();
                    System.out.print("Class : ");
                    String kelas = scan.nextLine();
                    Student04 mhs = new Student04(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("The assignment %s has been successfully submitted\n\n", mhs.name);
                break;

                case 2:
                    Student04 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Grading assignment from " + dinilai.name);
                        System.out.print("Input grade (0-100) : ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.grading(nilai);
                        System.out.printf("Assignment grade of %s is %d\n\n", dinilai.name, nilai);
                    }
                break;

                case 3:
                    Student04 lihat = stack.peek();
                    if (lihat !=null) {
                        System.out.println("The last assignment comes from : " + lihat.name + "\n");
                    }
                break;

                case 4:
                    System.out.println("The Assignment list : ");
                    stack.print();
                break;

                case 5:
                    Student04 pertama = stack.firstSubmitted();
                    if (pertama != null) {
                        System.out.println("The first submitted assignment comes from : " + pertama.name + "\n");
                    }
                break;

                default:
                    System.out.println("Invalid Choice.\n");
            }
        } while (pilih >=1 && pilih <= 5);

        scan.close();
    }
}
