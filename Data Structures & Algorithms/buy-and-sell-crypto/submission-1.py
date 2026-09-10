class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) == 1:
            return 0
        best = 0
        l = 0
        r = 1
        while r < len(prices):
            if prices[l] < prices[r]:
                best = max(best, prices[r] - prices[l])
            else:
                l = r
            
            r += 1
        
        return best