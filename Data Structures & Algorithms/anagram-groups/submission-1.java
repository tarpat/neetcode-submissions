class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            List<Integer> list = new ArrayList<>(26);
            for (int j = 0; j < 26; j++) {
                list.add(0);
            }
            for (int j = 0; j < strs[i].length(); j++) {
                list.set(strs[i].charAt(j) - 'a', list.get(strs[i].charAt(j) - 'a') + 1);
            }
            if (!map.containsKey(list)) {
                map.put(list, new ArrayList<String>());
            }
            map.get(list).add(strs[i]);
        }

        List<List<String>> anagrams = new ArrayList<>();
        for (List<Integer> list : map.keySet()) {
            anagrams.add(map.get(list));
        }

        return anagrams;
    }
}
