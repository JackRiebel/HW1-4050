package SortTypes;

public class BubbleSort {

    // BUBBLE SORT
    public static <T extends Comparable<? super T>>
    void recursiveBubbleSort(T[] a, int n)
    {
        if (n > 1)
        {
            for (int index = 0; index < n - 1; index++)
                order(a, index, index + 1);

            recursiveBubbleSort(a, n - 1);
        }  // end if
    }  // end recursiveBubbleSort
// -------------------------------------------------------------------------------

    // Orders two given array elements into ascending order
    // so that a[i] <= a[j].
    private static <T extends Comparable<? super T>>
    void order(T[] a, int i, int j)
    {
        if (a[i].compareTo(a[j]) > 0)
            swap(a, i, j);
    } // end order

    // Swaps the array entries array[i] and array[j].
    private static void swap(Object[] array, int i, int j)
    {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    } // end swap
}
