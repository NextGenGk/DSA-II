package ArrayQuestions;

// Contain Duplicate Class
public class Contains_Duplicates {

    // Contain Duplicate Function
    public static int containDuplicates(int[] arr) {
        // first we visit all indexes
        for (int i=0; i< arr.length; i++) {
            // checking Number (if starting is negative then (abs) convert in positive Number)
            int index = Math.abs(arr[i]);

            // if checking number is negative, then we know that next time is visit in this index
            if (arr[index] < 0) {
                return index;
            }

            // if the number is not negative, then convert it to negative
            arr[index] = -arr[index];
        }
        return -1;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int result = containDuplicates(arr);
        System.out.println(result);
    }
}

// Output -
// 2

// Algorithms -
/*
first we visit all indexes
then, checking Number (if starting is negative then abs convert in positive Number)
if checking number is negative, then we know that next time is visit in this index
if the number is not negative, then convert it to negative
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */