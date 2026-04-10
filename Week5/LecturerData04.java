package Week5;

public class LecturerData04 {
    Lecturer04[] lecturerData = new Lecturer04[10];
    int idx = 0;

    public void add(Lecturer04 dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data is full! Cannot add more lecturers.");
        }
    }

    public void print() {
        if (idx == 0) {
            System.out.println("No lecturer data available.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    public void bubbleSortAsc() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer04 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
        System.out.println("Data sorted by age (ASC - youngest to oldest) using Bubble Sort");
    }

    public void selectionSortDesc() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIndex].age) {
                    maxIndex = j;
                }
            }
            Lecturer04 temp = lecturerData[maxIndex];
            lecturerData[maxIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
        System.out.println("Data sorted by age using Selection Sort");
    }

    public void insertionSortDesc() {
        for (int i = 1; i < idx; i++) {
            Lecturer04 temp = lecturerData[i];
            int j = i;
            while (j > 0 && lecturerData[j - 1].age < temp.age) {
                lecturerData[j] = lecturerData[j - 1];
                j--;
            }
            lecturerData[j] = temp;
        }
        System.out.println("Data sorted by age using Insertion Sort");
    }
}