package ArrayQuestions;

// Search Element In Sorted Or Rotated Array Class
public class Search_Element_In_Sorted_Or_Rotated_Array {

    // Binary Search Function
    static int binarySearch(int[] arr, int key) {
        // Normal Binary Search
        // Starting index
        int low = 0;
        // Ending index
        int high = arr.length-1;

        while (low <= high) {
            // Find mid index / element
            int mid = low + (high - low)/2;
            // Check if value is present at mid, return mid
            if (arr[mid] == key) {
                return mid;
            }

            // Checking, If arr[low] is smaller than arr[mid], It means Left Part is Sorted
            if (arr[low] < arr[mid]) {
                if (key >= arr[low] && key < arr[mid]) {
                    // If key is present in the left subArray, then high = mid - 1
                    high = mid - 1;
                }
                    // If key is not present in the left subArray, then low = mid + 1
                else {
                    low = mid + 1;
                }
            }
            // Left Part is not Sorted, It means Right Part is Sorted
            else {
                if (key > arr[mid] && key <= arr[high]) {
                    // If key is present in the right subArray, then low = mid + 1
                    low = mid + 1;
                }
                    // If key is present in the right subArray, then high = mid - 1
                else {
                    high = mid - 1;
                }
            }
        }
        // If value is not present in the array
        return -1;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 60, 5, 10};
        int result = binarySearch(arr, 5);
        System.out.println(result);
    }
}

// Output -
// 5 (5th index)

// Algorithms -
/*
1. Compare x with the middle element.
2. If x matches with the middle element, we return the mid index.
3. Checking, If arr[low] is smaller than arr[mid], It means Left Part is Sorted
4. Checking If key is present in the left subArray, then high = mid - 1
5. Checking If key is not present in the left subArray, then low = mid + 1
6. Left Part is not Sorted, It means Right Part is Sorted
7. Checking If key is present in the right subArray, then low = mid + 1
8. Checking If key is present in the right subArray, then high = mid - 1
9. If value is not present in the array, return -1.
 */

// Time & Space Complexity -
/*
Time - O(log*n)
Space - O(1)
 */
