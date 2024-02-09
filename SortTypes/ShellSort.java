package SortTypes;

public class ShellSort {

    // SHELL SORT
    public static <T extends Comparable<? super T>>
    void shellSort(T[] a, int n) {
        shellSort(a, 0, n - 1); // Adjust to call the method with first and last index
    } // end shellSort

    // Overloaded shellSort method to sort the entire array
    private static <T extends Comparable<? super T>>
    void shellSort(T[] a, int first, int last) {
        int n = last - first + 1; // Calculate the number of elements to sort
        for (int space = n / 2; space > 0; space = space / 2) {
            for (int begin = first; begin < first + space; begin++) {
                incrementalInsertionSort(a, begin, last, space);
            } // end for
        } // end for
    } // end shellSort

    // Incremental insertion sort for sorting elements that are 'space' distance apart
    private static <T extends Comparable<? super T>>
    void incrementalInsertionSort(T[] a, int first, int last, int space) {
        for (int unsorted = first + space; unsorted <= last; unsorted += space) {
            T firstUnsorted = a[unsorted];
            int index;
            for (index = unsorted - space; index >= first && firstUnsorted.compareTo(a[index]) < 0; index -= space) {
                a[index + space] = a[index];
            } // end for
            a[index + space] = firstUnsorted;
        } // end for
    } // end incrementalInsertionSort
}
