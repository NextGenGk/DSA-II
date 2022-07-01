package ArrayQuestion_v2;

import java.util.Arrays;

// Cyclically Rotate Function
public class Cyclically_Rotate_an_Array_by_One {

    // Initialize an Array
    static int arr[] = new int[]{1, 2, 3, 4, 5};

    // Rotate Function
    static void rotate() {
        int x = arr[arr.length-1];
        for (int i=arr.length-1; i>0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;
    }

    // Main Function
    public static void main(String[] args) {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));

        rotate();

        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
}

// Output -
// 5,1,2,3,4

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