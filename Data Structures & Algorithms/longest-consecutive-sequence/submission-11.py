class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if nums == []:
            return 0
        n = set()
        for num in nums:
            n.add(num)
        
        count = 1
        best = 1
        while len(n) > 0:
            m = min(n)
            n.remove(m)
            while m+1 in n:
                count+=1
                m = m+1
                n.remove(m)
            best = max(best, count)
            count = 1
        return best