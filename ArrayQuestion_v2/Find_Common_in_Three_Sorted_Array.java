package ArrayQuestion_v2;

// Find common in Three Sorted Array Class
public class Find_Common_in_Three_Sorted_Array {

    // Find Common Function
    static void findCommon(int[] arr1, int[] arr2, int[] arr3) {

        // Initial values i = 0, j = 0, k = 0
        int i = 0;
        int j = 0;
        int k = 0;

        // Iterate through three arrays while all arrays
        // have elements
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            }
            // If arr1[i] is smaller than arr2[j] then increment i.
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            // If arr2[j] is smaller than arr3[k] then increment j.
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            // We reach here when i > j and k < j, i.e., k
            // is smallest
            else {
                k++;
            }
        }
    }

    public static void main(String[] args) {
        Find_Common_in_Three_Sorted_Array ob = new Find_Common_in_Three_Sorted_Array();
        int[] arr1 = { 1, 5, 10, 20, 40, 80 };
        int[] arr2 = { 6, 7, 20, 80, 100 };
        int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };

        System.out.print("Common elements are ");
        ob.findCommon(arr1, arr2, arr3);
    }
}

// Output -
// 20, 80

// Algorithm -
/*
1. Let the current element traversed in arr1[] be i, in arr2[] be j and in arr3[] be k. We can have following cases inside the loop.
2. If i, j and k are same, we can simply print any of them as common element and move ahead in all three arrays.
3. Else If i < j, we can move ahead in arr1[] as i cannot be a common element.
4. Else If i > k and j > k), we can simply move ahead in arr3[] as k cannot be a common element.
 */

// Time & Space Complexity -
/*
Time - O(i+j+k)
Space - O(1)
 */