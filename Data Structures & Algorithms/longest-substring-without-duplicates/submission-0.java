class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int max = 0;
        while (l < s.length() && r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                if (r - l + 1> max) {
                    max = r - l + 1;
                }
            } else {
                while (set.contains(s.charAt(r)) && l < s.length()) {
                    set.remove(s.charAt(l++));
                }
                set.add(s.charAt(r));
            }
            r++;
        }

        return max;
    }
}
