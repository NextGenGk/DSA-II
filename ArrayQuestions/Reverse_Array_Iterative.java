package ArrayQuestions;

// Reverse Array Iterative Class
public class Reverse_Array_Iterative {

    // Print array function
    static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Reverse Array Function
    static void reverseArray(int[] arr, int start, int end) {
    // while start is smaller than end, we basically swap both elements
        while (start < end) {
            // Swapping
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        reverseArray(arr, 0, n-1);
        printArray(arr,n);
    }
}

// Output -
// 5 4 3 2 1

// Algorithms -
/*
1) Initialize start and end indexes as start = 0, end = n-1
2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
start = start +1, end = end – 1
 */

// Time & Space Complexity
/*
Time - O(n)
Space - O(1)
 */