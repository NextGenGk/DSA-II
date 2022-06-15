package ArrayQuestions;

// Maximum Sum SubArray Class
public class Max_Sum_SubArray {

    // Max Sub Subarray Function
    static int maxSumSubarray(int[] arr) {
        // Initialize maxSum And currentSum to 0
        int maxSum = 0;
        int currentSum = 0;

        // Loop for each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Adding 1st element to currentSum
            currentSum = currentSum + arr[i];

            // currentSum is greater than maxSum then, currentSum is maxSum
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // currentSum is less than 0, then, currentSum = 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1,2,-6,3,4};
        int result = maxSumSubarray(arr);
        System.out.println(result);
    }
}

// Output -
// 7

// Algorithms (Kadane Algorithm) -
/*
Initialize:
    maxSum = 0;
    currentSum = 0

Loop for each element of the array
  (a) currentSum = currentSum + a[i]
  (b) if(currentSum > maxSum)
            maxSum = currentSum
  (c) if(currentSum < 0)
            currentSum = 0
return maxSum
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */