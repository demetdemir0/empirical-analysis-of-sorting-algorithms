package project;

public class Main {

    public static void main(String[] args) {

        In in = new In("input_files/1Kints.txt");
        int[] a = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        int count = 0;
        
      
       
        //selectionSort        
        //count = SelectionSort.count(a);
        //InsertionSort
        //count = InsertionSort.count(a);
        //mergeSort
        //count = MergeSort.count(a,0,a.length-1);
        //quicksort, lomuto/hoare
        //count = QuickSortLomuto.quickSort(a, 0, a.length-1);
        //count = QuickSortHoare.quickSort(a, 0, a.length-1);
        //heapSort
        //count = HeapSort.count(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(count); // count of the number of distinct pairs that sum to exactly 0.
       
     
    }

}
