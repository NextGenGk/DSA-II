package ArrayQuestions;

// Find Minimum Operation To Make An Array Palindrome Class
public class Find_Min_Operations_To_Make_Array_Palindrome {

    // Returns minimum number of count operations
    // required to make arr[] palindrome
    // Find Minimum Operation Function
    static int findMinOps(int[] arr, int n) {
        // Initialize result
        int count = 0;

        // Start from two corners
        for (int i = 0, j=n-1; i<=j;) {
            // If corner elements are same,
            // problem reduces arr[i+1..j-1]
            if (arr[i] == arr[j]) {
                i++;
                j--;
            }
            // If right element is smaller, then
            // we merge left two elements
            else if (arr[i] < arr[j]) {
                i++;
                arr[i] = arr[i] + arr[i-1];
                count++;

            }
            // Else we merge right two elements
            else {
                j--;
                arr[j] = arr[j] + arr[j+1];
                count++;
            }
        }
        // Finally return count value
        return count;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 9, 1} ;
        System.out.println("Count of minimum operations is "+
                findMinOps(arr, arr.length));
    }
}

// Output -
// Count of minimum operations is 1

// Algorithm -
/*
1. If arr[i] == arr[j], then there is no need to do any merging operations at index i or index j. Our answer in this case will be f(i+1, j-1).
2. Else, we need to do merging operations. Following cases arise.
    1. If arr[i] < arr[j], If right element is smaller, update arr[i+1] = arr[i+1] + arr[i].
    Our answer in this case will be 1 + f(i+1, j).
     arr[i+1] = arr[i+1] + arr[i]. Our answer in this case will be 1 + f(i+1, j).
    2. For the case when arr[i] > arr[j], If left element is greater, arr[j-1] = arr[j-1] + arr[j].
     Our answer in this case will be 1 + f(i, j-1).
3. Our answer will be f(0, n-1), where n is the size of array arr[].
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */