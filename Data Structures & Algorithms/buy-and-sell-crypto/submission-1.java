class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1, maxProfit = 0;
        while (i < prices.length && j < prices.length){
            if (prices[i] < prices[j]){
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            } else {
                i++;
                j = i;
            }
            j++;
        }
        return maxProfit;
    }
}
