class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                // we have a duplicate
                if (target == nums[i] * 2) {
                    int[] arr = new int[2];
                    arr[0] = Math.min(map.get(nums[i]), i);
                    arr[1] = Math.max(map.get(nums[i]), i);
                    return arr;
                }
            }
            map.put(nums[i], i);
        }

        for (int num : nums) {
            if (map.containsKey(target - num) && map.get(target - num) != map.get(num)) {
                int[] arr = new int[2];
                arr[0] = Math.min(map.get(target - num), map.get(num));
                arr[1] = Math.max(map.get(target - num), map.get(num));
                return arr;
            }
        }

        return new int[2];
    }
}
