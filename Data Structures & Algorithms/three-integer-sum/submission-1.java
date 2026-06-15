class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<List<Integer>> arr = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                int diff = -1 * (nums[i] + nums[j]);
                if (set.contains(diff)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(diff);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    Collections.sort(list);
                    arr.add(list);
                }
            }
            set.add(nums[i]);
        }
        List<List<Integer>> list = new ArrayList<>();
        for (List<Integer> elm : arr) {
            list.add(elm);
        }

        return list;
    }
}
