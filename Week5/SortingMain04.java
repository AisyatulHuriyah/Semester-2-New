package Week5;

public class SortingMain04 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};

        Sorting04 sorting = new Sorting04(a);

        System.out.println("Original Array : ");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble Sort) : ");
        sorting.print();
    }
}