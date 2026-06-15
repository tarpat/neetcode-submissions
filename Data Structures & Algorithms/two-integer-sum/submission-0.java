class Solution {
    public int[] twoSum(int[] nums, int target) {
        int idx1 = 0;
        while (idx1 < nums.length) {
            int num1 = nums[idx1];
            int idx2 = idx1 + 1;
            while (idx2 < nums.length) {
                int num2 = nums[idx2];
                if (num1 + num2 == target) {
                    return new int[] {idx1, idx2};
                }
                idx2++;
            }
            idx1++;
        }
        return new int[2];
    }
}
