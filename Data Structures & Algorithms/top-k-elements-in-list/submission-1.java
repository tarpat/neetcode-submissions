class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);
        }

        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        for (Integer key : counts.keySet()) {
            buckets.get(counts.get(key) - 1).add(key);
        }


        int[] finalArr = new int[k];
        int stored = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < buckets.get(i).size(); j++) {
                finalArr[stored++] = buckets.get(i).get(j);
                if (stored == k) {
                    return finalArr;
                }
            }
        }

        return finalArr;
    }
}
