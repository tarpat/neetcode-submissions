class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == -nums[i]) {
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[l]);
                    arr.add(nums[r]);
                    arr.add(nums[i]);
                    list.add(arr);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l-1]) {
                        l++;
                    }
                    // -4 -1 -1 0 1 2
                } else if (sum < -nums[i]) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return list;
    }
}
