class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] num_ways = new int[n];
        num_ways[0] = 1;
        num_ways[1] = 2;
        for (int i = 2; i < n; i++) {
            num_ways[i] = num_ways[i - 1] + num_ways[i - 2];
        }
        return num_ways[n - 1];
    }
}
