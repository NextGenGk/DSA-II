package ArrayQuestions;

// Rainwater Trapping Problem Class
public class Rainwater_Trapping_Problem {

    // Create an array
    static int[] arr = new int[] {3, 1, 2, 4, 0, 1, 3, 2};

    // Function for maximum amount of water
    static int trapRainWater(int n) {
        // Left aux array
        int[] left = new int[n];
        // right aux array
        int[] right = new int[n];

        // left[i] contains height of tallest bar to the
        // left of i'th bar including itself
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        // Initialize result
        int water = 0;

        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the
        // amount of water accumulated on this particular
        // bar will be equal to min(left[i], right[i]) - arr[i] .
        for (int i = 0; i < n; i++) {
            water = water + (Math.min(left[i], right[i]) - arr[i]);
        }

        // finally return max trap water
        return water;
    }

    // Main Function
    public static void main(String[] args) {
        System.out.println("Maximum water that can be accumulated is " + trapRainWater(arr.length));
    }
}

// Output -
// 8

// Algorithm -
/*
1. Create two arrays left and right of size n.
2. left[i] contains height of tallest bar to the left of i'th bar including itself
3. Right [i] contains height of tallest bar to the right of ith bar including itself
4. Initialize result
5. Calculate the accumulated water element by element consider the amount of water on i'th bar,
 the amount of water accumulated on this particular bar will be equal to min(left[i], right[i]) - arr[i] .
*/

// Time & Space Complexity -
/*
TIme - O(n)
Space - O(n)
 */