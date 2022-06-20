package ArrayQuestions;

// Product Array Except Self Class
public class Product_Array_Except_Self {

    // Product Array Except Self Function
    public int[] productExceptSelf(int[] nums) {
        // Create an Array
        int[] result = new int[nums.length];

        // Find right side product
        result[nums.length - 1] = 1;

        // Iterate through right to left
        for (int i = nums.length - 2; i >= 0; i--) {
            // Find right side product each index
            result[i] = result[i + 1] * nums[i + 1];
        }

        // Declare left (temp) variable to hold left side product in each iteration
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            // Find final result
            result[i] = result[i] * left;
            // Update left value at each iteration
            left = left * nums[i];
        }
        return result;
    }

        // Main Function
    public static void main(String[] args){
        Product_Array_Except_Self pro = new Product_Array_Except_Self();
        int[] arr = {1,2,3,4};
        int[] result = pro.productExceptSelf(arr);
        for (int i=0;i< result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
// Output -
// 24 12 8 6

// Algorithm -
/*
1. Create an empty array
2. Find right side product
3. Iterate through right to left & Find right side product each index
4. Declare left (temp) variable to hold left side product in each iteration & Find final result
5. Update left value at each iteration
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */
