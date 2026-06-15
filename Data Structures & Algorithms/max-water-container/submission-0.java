class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;
        while (l < r) {
            int vol = (r - l) * Math.min(heights[r], heights[l]);
            if (max < vol) {
                max = vol;
            }
            if (heights[r] < heights[l]) {
                r--;
            } else {
                l++;
            }
        }
        return max;
    }
}
