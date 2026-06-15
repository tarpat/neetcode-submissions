class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<String, Integer> s_set = new HashMap<>(26);
        HashMap<String, Integer> t_set = new HashMap<>(26);
        for (int i = 0; i < s.length(); i++) {
            String s_c = s.substring(i, i+1);
            String t_c = t.substring(i, i+1);
            if (!s_set.containsKey(s_c)) {
                s_set.put(s_c, 0);
            }

            if (!t_set.containsKey(t_c)) {
                t_set.put(t_c, 0);
            }

            t_set.put(t_c, t_set.get(t_c) + 1);
            s_set.put(s_c, s_set.get(s_c) + 1);
        }
        return t_set.equals(s_set);
    }
}
