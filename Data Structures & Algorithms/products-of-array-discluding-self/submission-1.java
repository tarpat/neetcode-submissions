class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodPrev = 1;
        int prodEnd = 1;
        int[] prev = new int[nums.length];
        int[] after = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prev[i] = prodPrev;
            prodPrev *= nums[i];

            after[nums.length - 1 - i] = prodEnd;
            prodEnd *= nums[nums.length - 1 - i];
        }

        for (int i = 0; i < prev.length; i++) {
            prev[i] *= after[i];
        }

        return prev;
    }
}  
