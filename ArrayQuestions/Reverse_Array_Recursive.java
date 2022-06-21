package ArrayQuestions;

// Reverse Array Recursive Class
public class Reverse_Array_Recursive {

    // Print array function
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Reverse Array Function
    static void reverseArray(int[] arr, int start, int end) {
        // If start is greater than or equal to end, then simply return we reach the base case
        if (start >= end) {
            return;
        }
        // Swapping
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverseArray(arr, start + 1, end - 1);
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        reverseArray(arr, 0, 4);
        printArray(arr,n);
    }
}

// Output -
// 5 4 3 2 1

// Algorithms -
/*
1) Initialize start and end indexes as start = 0, end = n-1
2) Swap arr[start] with arr[end]
3) Recursively call reverse for rest of the array.
 */

// Time & Space Complexity
/*
Time - O(n)
Space - O(1)
 */

