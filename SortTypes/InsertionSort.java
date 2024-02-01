package SortTypes;

public class InsertionSort {

    // INSERTION SORT
    public static <T extends Comparable<? super T>>
    void insertionSort(T[] a, int n)
    {
        insertionSort(a, 0, n - 1);
    } // end insertionSort

    public static <T extends Comparable<? super T>>
    void insertionSort(T[] a, int first, int last)
    {
        if (first < last)
        {
            // Sort all but the last entry
            insertionSort(a, first, last - 1);

            // Insert the last entry in sorted order
            insertInOrder(a[last], a, first, last - 1);
        } // end if
    } // end insertionSort
// -------------------------------------------------------------------------------

    // ALTERNATE VERSION
    public static <T extends Comparable<? super T>>
    void insertionSort2(T[] a, int n)
    {
        insertionSort2(a, 0, n - 1);
    } // end insertionSort2

    public static <T extends Comparable<? super T>>
    void insertionSort2(T[] a, int first, int last)
    {
        if (first < last)
        {
            insertionSort2(a, first, last - 1);         // Sort all but last item
            insertInOrder(a[last], a, first, last - 1); // Insert last item in sorted order
        } // end  if
    } // end insertionSort2

    // Inserts element into the sorted array elements a[begin] through a[end].
    private static <T extends Comparable<? super T>>
    void insertInOrder(T element, T[] a, int begin, int end)
    {
        if (element.compareTo(a[end]) >= 0)
            a[end + 1] = element;
        else if (begin < end)
        {
            a[end + 1] = a[end];
            insertInOrder(element, a, begin, end - 1);
        }
        else
        {
            a[end + 1] = a[end];
            a[end] = element;
        } // end if
    } // end insertInOrder

// -------------------------------------------------------------------------------

}
