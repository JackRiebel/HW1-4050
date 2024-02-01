package SortTypes;

public class SelectionSort {

    // SELECTION SORT

    /** Sorts the first n objects in an array into ascending order.
     @param a  An array of Comparable objects.
     @param n  An integer > 0. */
    public static <T extends Comparable<? super T>>
    void selectionSort(T[] a, int n)
    {
        selectionSort(a, 0, n - 1); // invoke recursive method
    } // end selectionSort

    public static <T extends Comparable<? super T>>
    void selectionSort(T[] a, int first, int last)
    {
        if (first < last)
        {  // Place the smallest value at beginning of array:
            int indexOfNextSmallest = getIndexOfSmallest(a, first, last);
            swap(a, first, indexOfNextSmallest);
            selectionSort(a, first + 1, last);
        } // end if
    } // end selectionSort

    // Returns the index of the smallest value in a portion of an array.
    private static <T extends Comparable<? super T>>
    int getIndexOfSmallest(T[] a, int first, int last)
    {
        T min = a[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++)
        {
            if (a[index].compareTo(min) < 0)
            {
                min = a[index];
                indexOfMin = index;
                // Assertion: min is the smallest of a[first] through a[index].
            } // end if
        } // end for
        return indexOfMin;
    } // end getIndexOfSmallest
// -------------------------------------------------------------------------------

    // ALTERNATE VERSION
    public static <T extends Comparable<? super T>>
    void selectionSort2(T[] a, int n)
    {
        selectionSort2(a, 0, n - 1);
    } // end selectionSort2

    public static <T extends Comparable<? super T>>
    void selectionSort2(T[] a, int first, int last)
    {
        if (first < last)
        { // place the largest value at end of array:
            swap(a, getIndexOfLargest(a, first, last), last);
            selectionSort2(a, first, last - 1 );
        } // end if
    } // end selectionSort2

    // Returns the index of the largest value in a portion of an
    private static <T extends Comparable<? super T>>
    int getIndexOfLargest(T[] a, int first, int last)
    {
        T max = a[first];
        int indexOfMax = first;
        for (int index = first+1; index <= last; index++)
        {
            if (a[index].compareTo(max) > 0)
            {
                max = a[index];
                indexOfMax = index;
                // Assertion: max is the largest of a[first] through a[index].
            } // end if
        } // end for

        return indexOfMax;
    } // end getIndexOfLargest
// -------------------------------------------------------------------------------

    // Swaps the array entries array[i] and array[j].
    private static void swap(Object[] array, int i, int j)
    {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    } // end swap
}
