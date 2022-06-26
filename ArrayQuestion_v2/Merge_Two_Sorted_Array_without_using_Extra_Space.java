package ArrayQuestion_v2;
import java.util.Arrays;

// Merge two Sorted Array without using Extra Space Class
public class Merge_Two_Sorted_Array_without_using_Extra_Space {

    // Merge Two Array Function
    // where n & m is the length of 1st & 2nd array
    static void merge(int[] arr1, int[] arr2, int n, int m) {

        // Initialize i & j to 0
        int i = 0;
        int j = 0;

        // Sort the first array then the second one will be sorted automatically using sortArray function
        // While i is less than n
        while (i<n) {
            // if arr1 is greater than arr2, then simply swap it
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                // Call Sort Array Function
                sortArray(arr2);
            }
            i++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    // Sort Array Function to Sort the unsorted number of arr2
    static void sortArray(int[] arr2) {
        // Loop through arr2 length
        for (int i=1; i<arr2.length; i++) {
            // If current element is smaller than previous element, then swap it
            if (arr2[i] < arr2[i-1]) {
                int temp = arr2[i];
                arr2[i] = arr2[i-1];
                arr2[i-1] = temp;
            }
        }
    }

    // Main Function
    public static void main(String[] args) {
        int arr1[] = {1, 5, 9, 10, 15, 20};
        int arr2[] = {2, 3, 8, 13};
        merge(arr1, arr2, 6, 4);
    }
}

// Output -
/*
[1, 2, 3, 5, 8, 9]
[10, 13, 15, 20]
 */

// Algorithm -
/*
1. Initialize two variables i & j to 0
2. While i is less than n, check if arr1 is greater than arr2, then simply swap it
3. Check, If current element is smaller than previous element, then swap it
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */