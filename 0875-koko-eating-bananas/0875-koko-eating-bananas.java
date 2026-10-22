
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        int ans = -1;

        for (int pile : piles) {
            high = Math.max(pile, high);
        }

        while (low <= high) {
            int speed = low + (high - low) / 2;
            long hr = findTime(piles, speed);

            if (hr <= h) {
                ans = speed;
                high = speed - 1;
            } else {
                low = speed + 1;
            }
        }

        return ans;
    }

    long findTime(int[] piles, int speed) {
        long hr = 0;

        for (int pile : piles) {
            hr += pile / speed;

            if (pile % speed != 0) {
                hr++;
            }
        }

        return hr;
    }
}
