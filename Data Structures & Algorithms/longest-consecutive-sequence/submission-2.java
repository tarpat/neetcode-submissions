class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> n = new HashSet<>();
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
            n.add(num);
        }
        int maxLen = 0;
        int currLen = 0;
        for (int i = min; i <= max; i++) {
            if (n.contains(i)) {
                // System.out.println(currLen);
                currLen++;
            } else {
                if (currLen > maxLen) maxLen = currLen;
                currLen = 0;
            }
        System.out.println(currLen);
        }
        if (currLen > maxLen) maxLen = currLen;
        return maxLen;
    }
}
