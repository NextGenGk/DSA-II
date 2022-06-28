package ArrayQuestion_v2;

import java.util.HashSet;

// Find Array is a Subset of Another Array Class
public class Find_Array_is_a_Subset_of_Another_Array {

    // IsSubset Function
    // Return true if arr2[] is a subset of arr1[]
    static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
        // Create an HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        // hashSet stores all the values of arr1
        for (int i = 0; i < arr1.length; i++) {
            if (!hashSet.contains(arr1[i])) {
                hashSet.add(arr1[i]);
            }
        }

        // loop to check if all elements
        //  of arr2 also lies in arr1
        for (int j = 0; j < arr2.length; j++) {
            if (!hashSet.contains(arr2[j])) {
                return false;
            }
        }
        return true;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n)) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }
}

// Output -
// arr2 is a subset of arr1

// Algorithm -
/*
1. Create a Hash Table for all the elements of arr1[].
2. Traverse arr2[] and search for each element of arr2[] in the Hash Table. If element is not found then return 0.
3. If all elements are found then return 1.
 */

// Time & Space Complexity -
/*
Time - O(m+n)
Space - O(n)
 */