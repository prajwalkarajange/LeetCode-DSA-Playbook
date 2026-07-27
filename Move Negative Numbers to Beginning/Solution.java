import java.util.*;
public class Solution {
    public static void main(String [] args){
        int arr[]={-12,11,-13,-5,6,-7,5,-3,-6};

        int left=0;
        int right=arr.length-1;

        while(left<=right){
            if(arr[left]<0){
                left++;
            }else if(arr[right]>0){
                right--;
            }else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;

                left++;
                right--;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
