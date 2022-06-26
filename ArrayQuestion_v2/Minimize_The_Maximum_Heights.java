package ArrayQuestion_v2;

import java.util.Arrays;

// Minimize The Maximum Heights Class
public class Minimize_The_Maximum_Heights {

    // Minimize Function
    static int minimizeHeights(int[] arr, int n, int k) {
        // Sorting an Array
        Arrays.sort(arr);

        // Maximum possible height difference
        int minDiff = arr[n-1] - arr[0];

        // Loop through array length
        for (int i=1; i<n; i++) {
            // if on subtracting k we got negative then
            // continue
            if (arr[n-1] -k < 0) continue;

            // Minimum element when we add k to whole array
            int min = Math.min(arr[0]+k, arr[i]-k);
            // Maximum element when we subtract k from whole array
            int max = Math.max(arr[i-1]+k, arr[n-1] -k);

            // Minimize the Maximum Heights Answer
            minDiff = Math.min(minDiff, max-min);
        }
        return minDiff;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        int ans = minimizeHeights(arr, arr.length, k);
        System.out.println(ans);
    }
}

// Output -
// 5

// Algorithm -
/*
1. First we sort the array
2. Find Maximum possible height difference
3. Loop through array length
4. If on subtracting k we got negative then, continue
5. Minimum element when we add k to whole array
6. Maximum element when we subtract k from whole array
 */

// Time & Space Complexity -
/*
Time - O(n*log*n)
Space - O(n)
 */