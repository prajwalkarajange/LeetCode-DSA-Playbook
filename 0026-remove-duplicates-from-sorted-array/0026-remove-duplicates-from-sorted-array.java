class Solution {
    public int removeDuplicates(int[] nums) {
        int officer = 1;
        int unique = 1;
        int cm = 1;

        while (cm < nums.length) {
            if (nums[cm] == nums[cm - 1]) {
                cm++;
                continue;
            }
            nums[officer] = nums[cm];
            officer++;
            cm++;
            unique++;

        }
        return unique;
    }
}