
public class LeftRotateArray {
    public static void main(String[] args){
       int[] nums = {1, 2, 3, 4, 5};
       int k=1;

       for(int i=k;i<nums.length;i++){
        System.out.print(nums[i]+" ");
       }

       for(int i=0;i<k;i++){
        System.out.print(nums[i]+" ");
       }
    }
}
