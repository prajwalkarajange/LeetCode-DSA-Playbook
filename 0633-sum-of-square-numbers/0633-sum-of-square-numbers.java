class Solution {
    public boolean judgeSquareSum(int c) {
        long low = 0;
        long high =(long) Math.sqrt(c);
        while (low <= high) {
            long ans = low * low + high * high;
            if (ans == c) {
                return true;
            } else if (ans < c) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }
}