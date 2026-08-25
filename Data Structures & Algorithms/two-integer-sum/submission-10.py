class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # dictionary such that the key is the value we need, and the value is the index
        d = dict()
        for i, num in enumerate(nums):
            if target - num not in d:
                d[num] = i
            else:
                return [d.get(target - num), i]
        return [-1, -1]