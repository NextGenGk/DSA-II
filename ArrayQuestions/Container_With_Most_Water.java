package ArrayQuestions;

// Container With Most Water Class
public class Container_With_Most_Water {

    // Container With Most Water Function
    public static int maxArea(int[] arr, int n) {
        // Initialize left
        int left = 0;
        // Initialize right
        int right = n - 1;
        // Total Area
        int area = 0;

        // While left is less than right
        while (left < right) {
            // Calculating the max area
            area = Math.max(area, Math.min(arr[left], arr[right]) * (right - left));

            // If left is smaller than right, increment 1 in left
            if (arr[left] < arr[right]) {
                left++;
            }
            // Else decrement 1 in right
            else {
                right--;
            }
        }
        // finally return maximum area
        return area;
    }

    // Main Function
    public static void main(String[] args) {
        int a[] = {1, 5, 4, 3};
        int n = 4;
        System.out.print(maxArea(a, n) + "\n");
    }
}

// Output -
// 6

// Algorithm:
/*
1. Keep two index, left = 0 and right = n-1 and a value max_area that stores the maximum area.
2. Run a loop until first is less than the last.
3. Update the max_area with maximum of max_area and min(array[left] , array[right])*(right-left)
4. if the value at array[left] is greater the array[right] then update right as right – 1 else update left as left + 1
5. Print the maximum area
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */