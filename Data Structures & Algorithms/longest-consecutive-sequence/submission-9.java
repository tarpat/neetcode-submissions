class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            seen.add(num);
        }
        HashSet<Integer> seq = new HashSet<>();
        for (int num : nums) {
            if(!seen.contains(num - 1)) {
                seq.add(num);
            }
        }

        // Everything in seq marks a new sequence
        int max = 0;
        int len = 0;
        for (int num : seq) {
            while (seen.contains(num + len)) {
                System.out.println("Ex" + num + " " + len);
                len++;
            }
            if (len > max) {
                max = len;
            }
            len = 0;
        }

        return max;
    }
}
