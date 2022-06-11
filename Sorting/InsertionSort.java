package Sorting;

// Insertion Sort Class
public class InsertionSort {

    // Print array function
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Insertion Sort Method
    public void insertionSort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;

            // Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            // of their current position
            while (j>=0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    // Main Method
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        // Create an object of Insertion Sort Class
        int[] arr = {1,9,4,6,8};
        is.insertionSort(arr);
        printArray(arr);
    }
}
