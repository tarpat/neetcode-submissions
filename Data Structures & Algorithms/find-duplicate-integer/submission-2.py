class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        arr = [0] * len(nums)
        for num in nums:
            if arr[num - 1] != 0:
                return num
            arr[num - 1] += 1
        return -1