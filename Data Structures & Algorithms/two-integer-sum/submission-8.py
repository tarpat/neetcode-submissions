class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # diff -> num
        x = dict()
        for i, num in enumerate(nums):
            x[target - num] = i
        

        for i, num in enumerate(nums):
            if num in x and i != x[num]:
                return [min(i, x[num]), max(i, x[num])]
        
        return [-1, -1]