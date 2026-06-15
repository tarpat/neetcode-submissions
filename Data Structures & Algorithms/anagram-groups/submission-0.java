class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finalList = new ArrayList<>();
        HashMap<ArrayList<Integer>, List<String>> map = new HashMap<>();
        for (String str : strs) {
            ArrayList<Integer> arr = new ArrayList<>(26);
            for (int i = 0; i < 26; i++) {
                arr.add(0);
            }
            for (Character c : str.toCharArray()) {
                arr.set(c - 'a', arr.get(c - 'a') + 1);
            }
            if (!map.containsKey(arr)) {
                List<String> newList = new ArrayList<>();
                map.put(arr, newList);
                finalList.add(newList);
            }
            List<String> list = map.get(arr);
            list.add(str);
        }

        return finalList;
    }
}
