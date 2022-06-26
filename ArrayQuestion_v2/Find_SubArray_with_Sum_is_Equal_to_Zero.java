package ArrayQuestion_v2;

import java.util.HashSet;
import java.util.Set;

// Find SubArray with Sum is Equal to Zero Class
public class Find_SubArray_with_Sum_is_Equal_to_Zero {

    // SubArray Function
    static boolean subArray(int[] arr) {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i=0; i<arr.length; i++) {
            // Add current element to sum
            sum = sum + arr[i];
            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash set
            if (arr[i] == 0 || sum == 0 || hs.contains(sum)) {
                return true;
            }
            // Add sum to hash set
            hs.add(sum);
        }
        // We reach here only when there is
        // no subArray with 0 sum
        return false;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 4, 2, -3, 1, 6 };
        if (subArray(arr)) {
            System.out.println("Found a subArray with 0 sum");
        }
        else {
            System.out.println("No Such Sub Array Exists!");
        }
    }
}

// Output -
// Found a subArray with 0 sum

// Algorithm -
/*
1. Creates an empty hashset hs
2. Initialize sum of elements
3. Traverse through the given array
4. Add current element to sum
5. Return true in following cases
    a) Current element is 0
    b) sum of elements from 0 to i is 0
    c) sum is already present in hash set
6. If all the conditions are not true then Add sum to hash set
7. If SubArray is not found simply return false
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */

