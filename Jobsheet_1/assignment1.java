package Jobsheet_1;

import java.util.Scanner;

public class assignment1 {
    // Data Declaration
    static char[] CODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'}; // 1 dimensi untuk kode platnya
    
    static char[][] CITY = { // 2 dimensi untuk nama kota dari kode platnya
        {'B', 'A', 'N', 'T', 'E', 'N'},
        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
        {'B', 'O', 'G', 'O', 'R'},
        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
        {'M', 'A', 'L', 'A', 'N', 'G'},
        {'T', 'E', 'G', 'A', 'L'}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("   CITY LICENSE PLATE SEARCH PROGRAM   ");
        System.out.println("=======================================");
        
        System.out.print("Input License Plate Code : ");
        
        String input = sc.next();
        char search = input.toUpperCase().charAt(0);

        // cari index nya
        int foundIndex = -1;
        for (int i = 0; i < CODE.length; i++) {
            if (CODE[i] == search) {
                foundIndex = i;
                break;
            }
        }

        // Display result
        if (foundIndex != -1) {
            // pake string untuk ubah dari char ke string
            String cityName = String.valueOf(CITY[foundIndex]);
            System.out.println("City Name\t\t : " + cityName);
        } else {
            System.out.println("Error\t\t : Code Not Found!");
        }
    }
}