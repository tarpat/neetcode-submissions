class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int j = i + 1;
            while (j < numbers.length && numbers[i] + numbers[j] < target) {
                j++;
            }
            if (j < numbers.length && numbers[i] + numbers[j] == target) {
                return new int[] {i + 1, j + 1};
            }
        }
        return new int[2];
    }
}
