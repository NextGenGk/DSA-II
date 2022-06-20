package ArrayQuestions;

// Product Array Except Self Class
public class Product_Array_Except_Self {

    // Product Array Except Self Function
    public int[] productExceptSelf(int[] nums) {

        // Create an empty array
        int output[] = new int[ nums.length];

        // Initialize 0 (zero) index with the value of 1
        output[0] = 1;

        // left prefix product (Loop through nums.length)
        for(int i=1;i<nums.length;i++){
            output[i] = output[i-1] * nums[i-1];
        }

        // Initialize product to 1
        int product = 1;

        // Loop through right to left
        for(int i=nums.length-1;i>=0;i--){
            output[i] = output[i] * product;
            product = product * nums[i];
        }
        return output;
    }

    // Main Function
    public static void main(String[] args){
        Product_Array_Except_Self pro = new Product_Array_Except_Self();
        int[] arr = {4, 6, 1, 2};
        int[] result = pro.productExceptSelf(arr);
        for (int i=0;i< result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
// Output -
// 12 8 48 24

// Algorithm -
/*
1. Create an empty array
2. Initialize 0 (zero) index with the value of 1
3. left prefix product
4. Initialize product to 1
5. Loop through right to left
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */