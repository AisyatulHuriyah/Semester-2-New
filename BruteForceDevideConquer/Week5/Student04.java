package BruteForceDevideConquer.Week5;

public class Student04 {
    String name;
    String nim;
    int admissionYear;
    int uts;
    int uas;

    Student04(String name, String nim, int year, int uts, int uas) {
        this.name = name;
        this.nim = nim;
        this.admissionYear = year;
        this.uts = uts;
        this.uas = uas;
    }

    int maxUTS(Student04[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int lmax = maxUTS(arr, l, mid);
        int rmax = maxUTS(arr, mid + 1, r);
        return Math.max(lmax, rmax);
    }

    int minUTS(Student04[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int lmin = minUTS(arr, l, mid);
        int rmin = minUTS(arr, mid + 1, r);
        return Math.min(lmin, rmin);
    }

    double avgUAS(Student04[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }
        return (double) total / arr.length;
    }
}