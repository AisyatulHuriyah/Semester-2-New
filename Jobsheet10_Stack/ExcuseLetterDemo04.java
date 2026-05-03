package Jobsheet10_Stack;
import java.util.Scanner;

public class ExcuseLetterDemo04 {
    public static void main(String[] args) {
        ExcuseLetterStack04 stack = new ExcuseLetterStack04(10);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n===== Excuse Letter Menu =====");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter (Validate)");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter by Name");
            System.out.print("Choose: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String nama = scan.nextLine();
                    System.out.print("Class: ");
                    String kelas = scan.nextLine();
                    System.out.print("Type (S=Sick, I=Other): ");
                    char tipe = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Duration (days): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    ExcuseLetter04 letter = new ExcuseLetter04(id, nama, kelas, tipe, durasi);
                    stack.push(letter);
                    System.out.println("Letter from " + nama + " has been submitted.\n");
                    break;

                case 2:
                    ExcuseLetter04 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing letter from: " + processed.name);
                        System.out.println("ID: " + processed.id);
                        System.out.println("Type: " + (processed.typeOfExcuse == 'S' ? "Sick" : "Other"));
                        System.out.println("Duration: " + processed.duration + " days");
                    }
                    break;

                case 3:
                    ExcuseLetter04 latest = stack.peek();
                    if (latest != null) {
                        System.out.println("Latest excuse letter:");
                        System.out.println("ID: " + latest.id + ", Name: " + latest.name + ", Class: " + latest.className);
                    }
                    break;

                case 4:
                    System.out.print("Enter student name to search: ");
                    String cari = scan.nextLine();
                    ExcuseLetter04 found = stack.searchByName(cari);
                    if (found != null) {
                        System.out.println("Letter found:");
                        System.out.println("ID: " + found.id + ", Name: " + found.name + ", Type: " + found.typeOfExcuse + ", Duration: " + found.duration + " days");
                    } else {
                        System.out.println("No letter found for student: " + cari);
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        } while (pilih >= 1 && pilih <= 4);

        scan.close();
    }
}