package Sorting;

public class BubbleSort_Optimize {

    // Print Method (Print all the sorted element)
    void printArray(int arrNew[])
    {
        int n = arrNew.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arrNew[i] + " ");
        System.out.println();
    }

    // Bubble Sort Method
    public void bubbleSort(int[] arr) {
        int n = arr.length;

        // An optimized version of Bubble Sort
        boolean swapped;

        // Outer Loop
        for (int i=0; i<n-1; i++) {
            // Starting swapped is false
            swapped = false;
            // Inner Loop for all elements
            for (int j=0; j<n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // If swapping is possible than swapped is true
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false) {
                break;
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        // Create an Object of Bubble Sort Class
        BubbleSort_Optimize bs = new BubbleSort_Optimize();
        int[] arr = {2,8,9,1,4};
        bs.bubbleSort(arr);
        bs.printArray(arr);
    }
}
