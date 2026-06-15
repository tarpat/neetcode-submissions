class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prod[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            prod[i] = prod[i-1] * nums[i-1];
        }

        int runProd = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            runProd *= nums[i + 1];
            prod[i] = prod[i] * runProd;
        }

        return prod;
    }
}  
