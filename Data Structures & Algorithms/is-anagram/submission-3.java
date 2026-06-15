class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>(26);
        HashMap<Character, Integer> map2 = new HashMap<>(26);
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), 0);
            }
            if (!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), 0);
            }
            map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
        }

        for (int i = 0; i < 26; i++) {
            // System.out.println((char) ('a' + i));
            if (!map1.containsKey((char) ('a' + i))) {
                map1.put((char) ('a' + i), 0);
            }
            if (!map2.containsKey((char) ('a' + i))) {
                map2.put((char) ('a' + i), 0);
            }
            int n1 = map1.get((char) ('a' + i));
            int n2 = map2.get((char) ('a' + i));
            if (n1 != n2) {
                return false;
            }
        }

        return true;
    }
}
