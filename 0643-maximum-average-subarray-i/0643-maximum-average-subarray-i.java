class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int high = k - 1;
        double sum = 0;
        double currAvg = 0;
        int n = nums.length;

        for (int i = low; i <= high; i++) {
            sum = sum + nums[i];
        }
        double avg = sum / k;

        while (high < n) {
            currAvg = sum / k;
            avg = Math.max(currAvg, avg);
            low++;
            high++;
            if (high == n) {
                break;
            }
            sum = sum - nums[low - 1];
            sum = sum + nums[high];

        }
        return avg;
    }
}