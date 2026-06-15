class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        generate(arr, nums, target, 0, set, new ArrayList<>(), 0);
        return arr;
    }

    public void generate (List<List<Integer>> arr, int[] nums, int target, int curr, Set<List<Integer>> set, List<Integer> currList, int idx) {
        if (curr > target) {
            return;
        }
        if (curr == target) {
            // valid list as long as not in already
            ArrayList<Integer> newArr = new ArrayList<>();
            for (Integer i : currList) {
                newArr.add(i);
            }
            Collections.sort(newArr);
            if (!set.contains(newArr)) {
                set.add(newArr);
                arr.add(newArr);
            }
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            int num = nums[i];
            currList.add(num);
            generate(arr, nums, target, curr+num, set, currList, i);
            currList.remove(currList.size() - 1);
        }
    }
}
