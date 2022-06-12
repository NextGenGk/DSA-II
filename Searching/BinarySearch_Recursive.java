package Searching;

// Binary Search Class Recursive
public class BinarySearch_Recursive {

    // Binary Class Method
    public static int binarySearch(int[] arr, int value, int startIndex, int endIndex) {
        // Check if startIndex is greater than endIndex
        if (startIndex > endIndex) {
            return -1;
        }
        else {
            // Find mid index / element
            int mid = (startIndex + endIndex) / 2;
            // Check if value is present at mid
            if (arr[mid] == value) {
                return mid;
            }
            // If value is greater than mid (ignore left half)
            else if (value > arr[mid]) {
                return binarySearch(arr, value, mid + 1, endIndex);
            }
            // If value is smaller than mid (ignore right half)
            else {
                return binarySearch(arr, value, startIndex, mid - 1);
            }
        }
    }

        // Main Method
        public static void main(String[] args) {
        // Create an object of BinarySearch_Recursive class
        BinarySearch_Recursive bs = new BinarySearch_Recursive();
        int arr[] = { 2, 3, 4, 10, 40 };
        int result = bs.binarySearch(arr,1,0,arr.length-1);
        System.out.println(result);
    }
}

// Time & Space Complexity
// Time Complexity : O(log n)
// Auxiliary Space : O(log n)