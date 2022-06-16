package ArrayQuestions;

// Best Time To Buy & Sell Stocks I Class
public class Best_Time_To_Buy_And_Sell_Stocks_1st {

    // maxProfit Function
    static int maxProfit(int[] prices) {
        // Initialize minSoFar arr[0]
        int minSoFar = prices[0];
        // maxProfit 0
        int maxProfit = 0;

        // Looping to arr.length
        for (int i=0; i<prices.length; i++) {
            // Find minimum prices to buy a stock
            minSoFar = Math.min(minSoFar, prices[i]);

            // Find profit
            int profit = prices[i] - minSoFar;

            // Maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }
        // Finally return maxProfit
        return maxProfit;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 4};
        System.out.println(maxProfit(arr));
    }
}

// Que - At most one transaction is allowed

// Output -
/*
4
when buy stock on day 2 & sell this stock on day 3 (2,6)
 */

// Algorithm -
/*
1. Declare variable minSoFar & maxProfit
2. Looping to arr.length
3. Find minimum price to buy this stock
4. Find profit from minimum & prices[i]
5. Find maximum profit
6. Finally return maxProfit
 */

// Time & Space Complexity
/*
Time - O(n)
Space - O(1)
 */