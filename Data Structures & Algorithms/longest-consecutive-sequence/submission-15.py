class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        n = set(nums)
        
        count = 0
        best = 0
        for num in n:
            if (num - 1) not in n:
                # this must be the start of a sequence
                count = 1
                m = num
                while (m + count) in n:
                    count +=1
            best = max(best, count)
        return best