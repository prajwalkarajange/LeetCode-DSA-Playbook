class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int idx = n - 1;

        int[] res = new int[n];

        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[idx] = nums[i] * nums[i];
                i++;
                idx--;
            } else {
                res[idx] = nums[j] * nums[j];
                idx--;
                j--;
            }
        }
        return res;
    }
}