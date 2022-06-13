package Sorting;

// Bubble Sort Class
public class BubbleSort {

    // Print Method (Print all the sorted element)
    void printArray(int arrNew[]) {
        int n = arrNew.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arrNew[i] + " ");
        System.out.println();
    }

    // Bubble Sort Method
    public void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer Loop
        for (int i=0; i<n-1; i++) {
            // Inner Loop for all elements (So, each time biggest element is placed on last cell)
            for (int j=0; j<n-i-1; j++) {
                // If next element is smaller than previous element, than swap it
                if (arr[j+1] < arr[j]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        // Create an Object of Bubble Sort Class
        BubbleSort bs = new BubbleSort();
        int[] arr = {2,8,9,1,4};
        bs.bubbleSort(arr);
        bs.printArray(arr);
    }
}

/*
Worst complexity: n^2
Average complexity: n^2
Best complexity: n
Space complexity: 1
 */
