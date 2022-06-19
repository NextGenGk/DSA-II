package ArrayQuestions;

import java.util.Arrays;

// Find a triplet that sum to a given value class
public class Sum_Of_3_Elements {

    // Find Number Function
    static void findNumber(int[] arr, int sum) {

        // Sort the array
        Arrays.sort(arr);

        // Loop over the array and fix the first element of the possible triplet, arr[i].
        for (int i=0; i< arr.length; i++) {

            // Then fix two pointers, low at i + 1 and the high at n – 1. And look at the sum
            int low = i+1;
            int high = arr.length-1;

            // To Find total sum
            int totalSum = sum - arr[i];

            // while low is less than high
            while (low < high) {
                // If the sum of elements at two-pointer is equal to given sum then print the triplet and break.
                if (arr[low] + arr[high] == totalSum) {
                    System.out.print("Triplet is " + arr[i] + ", " + arr[low] + ", " + arr[high]);
                    return;
                }
                // Else, If the sum is bigger, Decrease the end pointer to reduce the sum.
                else if (arr[low] + arr[high] > totalSum) {
                    high--;
                }
                // Else If the sum is smaller than the required sum, increment the first pointer.
                else if (arr[low] + arr[high] < totalSum) {
                    low++;
                }
            }
        }
        // If value is not found return 0
        System.out.println("Triplet Value is Not Present");
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 13;
        findNumber(arr, sum);
    }
}

// Output -
// Triplet is 1, 4, 8

// Algorithm -
/*
1. Sort the given array.
2. Loop over the array and fix the first element of the possible triplet, arr[i].
3. Then fix two pointers, one at i + 1 and the other at n – 1. And look at the sum,
    1. If the sum of elements at two-pointer is equal to given sum then print the triplet and break.
    2. Else, If the sum is bigger, Decrease the end pointer to reduce the sum.
    3. Else If the sum is smaller than the required sum, increment the first pointer.
 */

// Time & Space Complexity -
/*
Time - O(n^2)
Space - O(1)
 */