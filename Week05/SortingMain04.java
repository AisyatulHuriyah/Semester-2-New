package Week05;

public class SortingMain04 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        int[] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 4, 9, 3};

        Sorting04 sorting = new Sorting04(a);
        Sorting04 sorting2 = new Sorting04(b);
        Sorting04 sorting3 = new Sorting04(c);

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

        System.out.println("Original Array : ");
        sorting3.print();
        sorting3.bubbleSort();
        System.out.println("Sorted array (insertion Sort) : ");
        sorting3.print();
        }
}
