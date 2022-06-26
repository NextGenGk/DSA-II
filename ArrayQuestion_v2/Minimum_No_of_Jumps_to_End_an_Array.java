package ArrayQuestion_v2;

// Minimum Numbers of Jumps to End an Array Class
public class Minimum_No_of_Jumps_to_End_an_Array {

    // Minimum Humps Function
    static int minJumps(int[] arr) {
        // Initialize jumps, currentJumpEnd & farthest to 0
        int jumps = 0;
        int currentJumpEnd = 0;
        int farthest = 0;

        // Loop through array length -1
        for (int i=0; i< arr.length-1; i++) {
            // Find farthest
            farthest = Math.max(farthest , i + arr[i]);
            // If i == currentJumpEnd then increase the jumps by one
            if (i == currentJumpEnd) {
                jumps++;
                // If end is reached, then ith jump is finished, therefore update currentJumpEnd = farthest.
                currentJumpEnd = farthest;
            }
        }
        // Finally return the minimum jumps
        return jumps;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 4 };
        int result = minJumps(arr);
        System.out.println(result);
    }
}

// Output -
// 2

// Algorithm -
/*
1. Consider three variables, jumps, which stores the number of jumps, end, which denotes the end of the array
 and farthest denoting the farthest one can jump and initialise them to 0.
2. Traverse over the given array and perform the following operation:
    farthest = i + arr[i]
    If end is reached, then ith jump is finished, therefore update currentJumpEnd = farthest.
3. Return total jumps.
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */