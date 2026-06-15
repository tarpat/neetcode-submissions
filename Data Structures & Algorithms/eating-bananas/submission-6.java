class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1; // slowest rate
        int max = 0; // fastest rate
        for (int pile : piles) {
            // if (pile < min) min = pile;
            if (pile > max) max = pile;
        }

        while (min < max) {
            int middle = (min + max) / 2; // bananas per hour rate
            int middleTime = calculateTime(middle, piles);
            if (middleTime < h) {
                max = middle;
            } else if (middleTime > h) {
                min = middle + 1;
            } else {
                max = middle;
            }
        }

        return max;
    }

    public int calculateTime(int middle, int[] piles) {
        int time = 0;
        for (int pile : piles) {
            time += (int) Math.ceil(((double) pile) / middle);
        }

        return time;
    }
}
