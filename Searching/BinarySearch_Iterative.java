package Searching;

// Binary Search Class Iterative
public class BinarySearch_Iterative {

    // Binary Class Method
    public static int binarySearch(int[] arr, int value) {
        // Starting index
        int start = 0;
        // Ending index
        int end = arr.length-1;

        // Check if value is present at mid
        while (start <= end) {
            // Find mid index / element
            int mid = (start + end) / 2;
            // Check if value is present at mid
            if (arr[mid] == value) {
                return mid;
            }
            // If value is greater than mid (ignore left half)
            else if (value > arr[mid]) {
                start = mid + 1;
            }
            // If value is smaller than mid (ignore right half)
            else {
                end = mid - 1;
            }
        }
        // if we reach here, then element was
        // not present
        return -1;
    }

    // Main Method
    public static void main(String[] args) {
        // Create an object of BinarySearch_Iterative class
        BinarySearch_Iterative bs = new BinarySearch_Iterative();
        int[] arr = { 2, 3, 4, 10, 40 };
        int result = bs.binarySearch(arr, 2);
        if (result == -1)
            System.out.println("Element not present");
        else {
            System.out.println("Element found at " + "index " + result);
        }
    }
}

/*
Step-by-step Binary Search Algorithm: We basically ignore half of the elements just after one comparison.

1. Compare x with the middle element.
2. If x matches with the middle element, we return the mid index.
3. Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
4. Else (x is smaller) recur for the left half.
 */


/* Worst complexity: O(log n)
   Average complexity: O(log n)
   Best complexity: O(1)
   Space complexity: O(1) */