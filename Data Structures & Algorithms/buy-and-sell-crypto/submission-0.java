class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = 0;
        int r = 1;
        while (l < prices.length && r < prices.length) {
            if (prices[r] < prices[l]) {
                l = r;
            } else {
                if (prices[r] - prices[l] > max) {
                    max = prices[r] - prices[l];
                }
            }
            r++;
        }
        if (prices[r - 1] - prices[l] > max) {
            max = prices[r - 1] - prices[l];
        }

        return max;
    }
}
