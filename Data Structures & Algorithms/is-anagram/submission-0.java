class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0 ; i < s.length(); i++) {
            int cIndex1 = ((int) s.charAt(i)) - 97;
            int cIndex2 = ((int) t.charAt(i)) - 97;
            arr1[cIndex1]++;
            arr2[cIndex2]++;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
