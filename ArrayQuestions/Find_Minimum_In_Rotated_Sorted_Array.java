package ArrayQuestions;

// Find Minimum In Rotated Sorted Array Class
public class Find_Minimum_In_Rotated_Sorted_Array {

    // Find Minimum Function
    static int findMinimum(int[] arr) {
        // Starting index
        int start = 0;
        // Ending index
        int end = arr.length-1;

        // If the first element is less than the last element
        // then there is no rotation. The first element is minimum.
        if (arr[start] <= arr[end]) {
            return arr[start];
        }

        // while low index is smaller & equal to high index
        while (start <= end) {
            // Find mid index / element
            int mid = start + (end - start)/2;

            // If the middle is greater than its next element, then the next element is the minimum element
            // Ex -  7 > , it means We have got the 1st smallest element of the 2nd Sorted Array
            // Right element is always present // 5, 1, 2, 3, 4
            if (arr[mid] > arr[mid+1]) {
                return arr[mid+1];
            }
            // If the middle element is smaller than its previous element,
            // then it is the minimum element
            // Ex - 0 < 7, it means We have got the 1st smallest element of the 2nd Sorted Array // 4, 5, 6, 7, 0, 1, 2
            else if (arr[mid] < arr[mid-1]) {
                return arr[mid];
            }
            // Left array is sorted. So the pivot is on the right side
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            // Right array is sorted. So the pivot is on the left side
            else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
        }
        // If smallest element is not present in the array, then return -1
        return -1;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        int result = findMinimum(arr);
        System.out.println(result);
    }
}

// Test Cases -
/*
4, 5, 6, 7, 0, 1, 2
5, 1, 2, 3, 4
1
 */

// Output -
// 1

// Algorithm -
/*
1. If the first element is less than the last element then there is no rotation. The first element is minimum.
2. Find middle index / element
3. If the middle is greater than its next element, then the next element is the minimum element
4. If the middle element is smaller than its previous element, then it is the minimum element
5. Left array is sorted. So the pivot is on the right side
6. Right array is sorted. So the pivot is on the left side
 */

// Time & Space Complexity -
/*
Time - O(log*n)
Space - O(1)
 */