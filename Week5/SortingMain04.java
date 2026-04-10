package Week5;

public class SortingMain04 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        int[] b = {30, 20, 2, 8, 14};

        Sorting04 sorting = new Sorting04(a);
        Sorting04 sorting2 = new Sorting04(b);

        System.out.println("Original Array : ");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble Sort) : ");
        sorting.print();

        System.out.println("Original Array : ");
        sorting2.print();
        sorting2.bubbleSort();
        System.out.println("Sorted array (Selection Sort) : ");
        sorting2.print();
    }
}