package Sorting;

// QuickSort Class
public class QuickSort {

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //   This function takes last element as pivot, places
    //   the pivot element at its correct position in sorted
    //   array, and places all smaller (smaller than pivot)
    //   to left of pivot and all greater elements to right
    //   of pivot
    public static int partition(int[] arr, int start, int end) {
        // pivot
        int pivot = arr[end];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = start-1;
        for (int j=start; j<=end; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {
                // Increment index of
                // smaller element
                i++;
                // swap
                swap(arr, i, j);
            }
        }
        // swap
        swap(arr, i+1, end);
        return (i+1);
    }


    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // start --> Starting index,
    // end --> Ending index
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            // pivot is partitioning index, arr[pivot]
            // is now at right place
            int pivot = partition(arr, start, end);
            // Recursive call
            quickSort(arr, start,pivot-1);
            // Recursive call
            quickSort(arr,pivot+1, end);
        }
    }

    // Function to print an array
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {7,9,4,2,8};
        quickSort(arr,0,arr.length-1);
        printArray(arr,arr.length);
    }
}
