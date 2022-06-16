package ArrayQuestions;

// Best Time To Buy & Sell Stocks II Class (Que - Infinite transactions are allowed)
public class Best_Time_To_Buy_And_Sell_Stocks_2nd {

    // maxProfit Function
    static int maxProfit(int[] prices) {
        // Initialize profit to 0
        int maxProfit = 0;

        // Looping through prices.length
        for (int i=1; i<prices.length; i++) {
            // Checking, if current elements is greater than previous elements,
            // then subtract current Element - previous Element
            // & then add on profit
            if (prices[i] > prices[i-1]) {
                maxProfit = maxProfit + (prices[i] - prices[i-1]);
            }
        }
        // Finally return maxProfit
        return maxProfit;
    }

    // Main Function
    public static void main(String[] args) {
        int[] prices = { 5, 2, 6, 1, 4, 7, 3, 6 };
        System.out.println(maxProfit(prices));
    }
}

// Que - Infinite transactions are allowed

// Output -
// 13

// Algorithm -
/*
1. Initialize profit to 0
2. Looping through prices.length
3. Checking, if current elements is greater than previous elements,
   then subtract current Element - previous Element
   & then add on profit
4. Finally return maxProfit
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */