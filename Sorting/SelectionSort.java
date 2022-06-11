package Sorting;

// Selection Sort Class
public class SelectionSort {

    // Print Function
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Selection Sort Function
    public static void selectionSort(int[] arr) {
        // One by one move boundary of unsorted subArray
        for (int i=0; i<arr.length; i++) {
            // Find the minimum element in unsorted array
            int minElement = i;
            for (int j=i+1; j< arr.length; j++) {
                if (arr[j] < arr[minElement]) {
                    minElement = j;
                }
            }
            // Swapping
            // swap the smallest element with the element at i
            if (minElement != i) {
                int temp = arr[i];
                arr[i] = arr[minElement];
                arr[minElement] = temp;
            }
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {7,8,1,3,2};
        selectionSort(arr);
        printArray(arr);
    }
}
