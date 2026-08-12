class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int len=n*2;
        int [] res=new int[len];
        int i=0;
        int j=n;

        for(int num:nums){
            res[i]=num;
            res[j]=num;
            i++;
            j++;
        }
        return res;
    }
}