package ArrayQuestion_v2;

// Sort Array Class
public class Sort_an_Array_0_1_2 {

    // Print Array Function
    static void printArray(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Swap Function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Sort Array Function
    static void sortArray(int[] arr, int n) {
        // Initialize low
        int low = 0;
        // Initialize mid
        int mid = 0;
        // Initialize high
        int high = n-1;

        // while mid is less than equal to high
        while (mid <= high) {
            // If 0, swap arr[low] and arr[mid], low++, mid++
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            // If 1, mid++
            else if (arr[mid] == 1) {
                mid++;
            }
            // If 2, swap arr[mid] and arr[high], high--
            else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 0, 1, 2, 0, 2};
        int n = arr.length;
        sortArray(arr, n);
        printArray(arr);
    }
}

// Output -
// 0 0 0 1 1 1 2 2 2

// Algorithm -
/*
1. Initialize low, mid & high
2. If 0, swap arr[low] and arr[mid], low++, mid++
3. If 1, mid++
4. If 2, swap arr[mid] and arr[high], high--
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */