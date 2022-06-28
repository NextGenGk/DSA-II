package ArrayQuestion_v2;

// Find Minimum Swaps Class
public class Find_Minimum_Swaps_k_Together {

    // Utility function to find minimum swaps
    // required to club all elements less than
    // or equals to k together
    // Minimum Swap Function
    static int minSwap(int arr[], int n, int k) {

        // Find count of elements which are
        // less than equals to k
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] <= k)
                count++;

        // Find unwanted elements in current
        // window of size 'count'
        int bad = 0;
        for (int i = 0; i < count; i++)
            if (arr[i] > k)
                bad++;

        // Initialize answer with 'bad' value of
        // current window
        int ans = bad;
        for (int i = 0, j = count; j < n; i++, j++) {

            // Decrement count of previous window
            if (arr[i] > k)
                bad--;

            // Increment count of current window
            if (arr[j] > k)
                bad++;

            // Update ans if count of 'bad'
            // is less in current window
            ans = Math.min(ans, bad);
        }
        return ans;
    }

    // Main Method
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 3};
        int k = 3;
        int n = arr.length;
        System.out.print(minSwap(arr,n, k) + "\n");
    }
}

// Output -
// 1

// Algorithm -
/*
1. Find the count of all elements which are less than or equal to ‘k’. Let’s say the count is ‘cnt’
2. Using the two-pointer technique for a window of length ‘cnt’, each time keep track of how many elements in this
range are greater than ‘k’. Let’s say the total count is ‘bad’.
3. Repeat step 2, for every window of length ‘cnt’ and take a minimum of count ‘bad’
among them. This will be the final answer.
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */
