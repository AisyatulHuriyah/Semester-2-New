package Jobsheet_3.Practicum04;

public class LecturerData04 {

    //Display all lecturers data
    public void dataAllDosen(Lecturer04[] arrayOfDosen) {
        System.out.println("\n----------------------------------------");
        System.out.println("          ALL LECTURERS DATA            ");
        System.out.println("----------------------------------------");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.print("Lecturer No : ");
            System.out.println(i + 1);
            System.out.print("Code        : ");
            System.out.println(arrayOfDosen[i].code);
            System.out.print("Name        : ");
            System.out.println(arrayOfDosen[i].name);
            
            String genderLabel;
            if (arrayOfDosen[i].gender == true) {
                genderLabel = "Male";
            } else {
                genderLabel = "Female";
            }
            System.out.print("Gender      : ");
            System.out.println(genderLabel);
            
            System.out.print("Age         : ");
            System.out.println(arrayOfDosen[i].age);
            System.out.println("----------------------------------------");
        }
    }

    //Hitung dosen berdasarkan gender
    public void numberOfLecturersPerGender(Lecturer04[] arrayOfLecturers) {
        int mCount = 0;
        int fCount = 0;
        for (int i = 0; i < arrayOfLecturers.length; i++) {
            if (arrayOfLecturers[i].gender == true) {
                mCount = mCount + 1;
            } else {
                fCount = fCount + 1;
            }
        }
        System.out.println("\n--- LECTURER GENDER COUNT ---");
        System.out.print("Total Male   : ");
        System.out.println(mCount);
        System.out.print("Total Female : ");
        System.out.println(fCount);
    }

    //rata rata usia per gender
    public void AverageAgeOfLecturersPerGender(Lecturer04[] arrayOfLecturers) {
        int sumM = 0, countM = 0;
        int sumF = 0, countF = 0;
        for (int i = 0; i < arrayOfLecturers.length; i++) {
            if (arrayOfLecturers[i].gender == true) {
                sumM = sumM + arrayOfLecturers[i].age;
                countM = countM + 1;
            } else {
                sumF = sumF + arrayOfLecturers[i].age;
                countF = countF + 1;
            }
        }
        System.out.println("\n--- AVERAGE AGE BY GENDER ---");
        System.out.print("Avg Male   : ");
        System.out.println(countM > 0 ? (double) sumM / countM : 0);
        System.out.print("Avg Female : ");
        System.out.println(countF > 0 ? (double) sumF / countF : 0);
    }

    //dosen ter tua
    public void infoDosenPalingTua(Lecturer04[] arrayOfDosen) {
        Lecturer04 oldest = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].age > oldest.age) {
                oldest = arrayOfDosen[i];
            }
        }
        System.out.println("\n--- OLDEST LECTURER ---");
        System.out.print("Name : ");
        System.out.println(oldest.name);
        System.out.print("Age  : ");
        System.out.println(oldest.age);
    }

    //dosen termuda
    public void infoDosenMostYoungest(Lecturer04[] arrayOfDosen) {
        Lecturer04 youngest = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].age < youngest.age) {
                youngest = arrayOfDosen[i];
            }
        }
        System.out.println("\n--- YOUNGEST LECTURER ---");
        System.out.print("Name : ");
        System.out.println(youngest.name);
        System.out.print("Age  : ");
        System.out.println(youngest.age);
    }
}
