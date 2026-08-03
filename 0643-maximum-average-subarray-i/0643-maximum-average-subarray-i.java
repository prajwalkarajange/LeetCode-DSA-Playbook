class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high=k-1;
        double sum=0;
        double currAvg=0;

        for(int i=0;i<=high;i++){
            sum=sum+nums[i];
            
        }
        double avg=sum/k;
        
        while(high<nums.length){
            currAvg=sum/k;
            avg=Math.max(avg,currAvg);
            low++;
            high++;

            if(high==nums.length){
                break;
            }
            sum=sum-nums[low-1];
            sum=sum+nums[high];

        }
        return avg;
    }
}