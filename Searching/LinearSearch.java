package Searching;

// Linear Search Class
public class LinearSearch {

    // Linear Search Method
    public static int linearSearch(int[] arr, int value) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value is found at the index of " + i);
                return i;
            }
        }
        System.out.println("The element " + value+ " not found.");
        return -1;
    }

    // Main Method
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        LinearSearch.linearSearch(arr,3);
    }
}

// Algorithms (Approach) ->
/* A simple approach is to do a linear search, i.e

1. Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
2. If value matches with an element, return the index.
3. If value doesn’t match with any of elements, return -1.
*/

// Time & Space Complexity ->
/* Worst complexity: O(n)
   Average complexity: O(n)
   Best performance: O(n/2)
   Space complexity: O(1)
*/