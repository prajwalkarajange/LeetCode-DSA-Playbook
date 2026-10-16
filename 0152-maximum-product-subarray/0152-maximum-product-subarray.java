class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = maxEnding * nums[i];
            int v2 = minEnding * nums[i];
            maxEnding = Math.max(nums[i], Math.max(v1, v2));
            minEnding = Math.min(nums[i], Math.min(v1, v2));

            res = Math.max(res, Math.max(maxEnding, minEnding));
        }
        return res;
    }
}