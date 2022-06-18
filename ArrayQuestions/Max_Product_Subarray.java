package ArrayQuestions;

// Max Product Subarray Class
public class Max_Product_Subarray {

    // Max Product Subarray Function
    static int maxSubarrayProduct(int[] arr, int n) {
        // Initialize maxProduct to Integer.Min_Value
        int maxProduct = Integer.MIN_VALUE;
        // Initialize product to 0
        int product = 1;

        // Loop through left to right
        for (int i=0; i<n; i++) {
            // Find product
            product = product * arr[i];
            // And adding on max product (which of the two is bigger)
            maxProduct =  Math.max(maxProduct, product);
            // Check if product is 0, then initialize product is 0
            if (product == 0) {
                product = 1;
            }
        }

        // start
        product = 1;
        // Loop through right to left
        for (int i=n-1; i>=0; i--) {
            // Find product
            product = product * arr[i];
            // And adding on max product (which of the two is bigger)
            maxProduct = Math.max(maxProduct, product);
            // Check if product is 0, then initialize product is 0
            if (product == 0) {
                product = 1;
            }
        }
        // Finally return maxProduct
        return maxProduct;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 6, -3, -10, 0, 2 };
        int n = arr.length;
        System.out.println("Maximum Sub array product is "
                + maxSubarrayProduct(arr,n));
    }
}

// Output -
// 180

// Algorithm -
/*
1. Initialize maxProduct to Integer.Min_Value & product to 1
2. Loop through left to right
3. Find product And adding on max product (which of the two is bigger (maxProduct or product));
4. Check if product is 0, then initialize product is 0
5. Loop through right to left
6. Find product And adding on max product (which of the two is bigger (maxProduct or product));
7. Check if product is 0, then initialize product is 0
8. Finally return maxProduct
 */

// Time & Space Complexity -
/*
Time - 0(n)
Space - O(1)
 */