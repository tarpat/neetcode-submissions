class Solution {
    public int[] twoSum(int[] nums, int target) {
        // stores difference : index
        HashMap<Integer, Integer> differences = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (differences.containsKey(nums[i])) {
                return new int[] {differences.get(nums[i]), i};
            } else {
                differences.put(target - nums[i], i);
            }
        }
       return new int[2];
    }
}
