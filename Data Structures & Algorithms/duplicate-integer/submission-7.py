class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        x = set()
        for i, num in enumerate(nums):
            x.add(num)
            if len(x) != i+1:
                return True

        return False