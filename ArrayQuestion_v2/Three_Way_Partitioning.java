package ArrayQuestion_v2;

// Three Way Partitioning Class
public class Three_Way_Partitioning {

    // Swap Function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Partition Function
    static void partition(int[] arr, int a, int b) {
        // Initialize ext available positions for
        // smaller (than range) and greater elements
        int left = 0;
        int right = arr.length-1;

        // Traverse elements from left
        for (int i=0; i<=right; i++) {
            // If current element is smaller than
            // range, put it on next available smaller
            // position.
            if (arr[i]<a) {
                swap(arr, left, i);
            }
            // If current element is greater than
            // range, put it on next available greater
            // position.
            else if (arr[i]>b){
                swap(arr, right, i);
                right--;
                left--;
            }
        }
    }

    // Main Function
    public static void main (String[] args) {
        int[] arr = { 1, 2, 3, 3, 4 };
        partition(arr, 1, 2);
        System.out.println("Modified array ");
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Output
/*
Modified array
1 2 4 3 3
 */

// Algorithm -
/*
1. Initialize two variables left to 0 & right to length-1
2. Traverse elements from left
3. If current element is smaller than range, then swap left & current element
4. If current element is greater than range.,then swap right & current element
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */
