/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author w10
 */
public class QuickSortHoare {
    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
 
        while (true) {
            // Find leftmost element greater
            // than or equal to pivot
            do {
                i++;
            } while (arr[i] < pivot);
 
            // Find rightmost element smaller
            // than or equal to pivot
            do {
                j--;
            } while (arr[j] > pivot);
 
            // If two pointers met.
            if (i >= j)
                return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // swap(arr[i], arr[j]);
        }
    }
 
    /* The main function that
       implements QuickSort
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    public static int quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            /* pi is partitioning index,
            arr[p] is now at right place */
            int pi = partition(arr, low, high);
 
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi);
            quickSort(arr, pi + 1, high);
        }
        return 0;
    }
}
