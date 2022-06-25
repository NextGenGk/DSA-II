package ArrayQuestion_v2;

// Cyclically Rotate Function
public class Cyclically_Rotate_an_Array_by_One {

    // Print Array Function
    static void printArray(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Initialize an Array
    static int arr[] = new int[]{1, 2, 3, 4, 5};

    // Rotate Function
    static void rotate() {
        int x = arr[arr.length-1];
        for (int i=arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
            arr[0] = x;
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate();
        printArray(arr);
    }
}

// Output -
// 1,2,3,4,5

// Algorithm -
/*
1. Store last element in a variable say x.
2. Shift all elements one position ahead.
3. Replace first element of array with x.
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */