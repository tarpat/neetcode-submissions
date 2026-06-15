class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length;
        while (s < e) {
            int middleIdx = (s + e) / 2;
            if (nums[middleIdx] > target) {
                e = middleIdx - 1;
            } else if (nums[middleIdx] < target) {
                s = middleIdx + 1;
            } else {
                return middleIdx;
            }
        }
        if (s < nums.length && nums[s] == target) {
            return s;
        }
        
        return -1;
    }
}
