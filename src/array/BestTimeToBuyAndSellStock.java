package array;
/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = {7,6,4,3,1};
		System.out.println(maximumProfit(prices));

	}
	
	public static int maximumProfit(int[] prices) {
		//at the beginning minimum price is the first place
		int buy_price = prices[0];
		//at the beginning the minimum profit is zero
		int profit = 0;
		for(int i=1;i<prices.length;i++) {
			//if the current price is less update the buy_price
			if(prices[i] < buy_price) {
				buy_price = prices[i];
			}
			else {
				//else check if we can get a better profit
				int current_profit = prices[i] - buy_price;
				profit = Math.max(current_profit , profit);
			}
		}
		return profit;
	}

}

/*Only update the buy_price if new price is lower
 * Try to sell if new price > buy_price
 * current_profit=today's price - buy_price
 * update max_profit when needed
 */
