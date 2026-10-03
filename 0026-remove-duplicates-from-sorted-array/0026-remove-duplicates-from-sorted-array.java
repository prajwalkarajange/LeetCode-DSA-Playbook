class Solution {
    public int removeDuplicates(int[] nums) {
        int cm=1;
        int unique=1;
        int officer=1;

        while(cm<nums.length){
            if(nums[cm]==nums[cm-1]){
                cm++;
            }else{
                nums[officer]=nums[cm];
                officer++;
                unique++;
                cm++;

            }
        }
        return unique;
    }
}