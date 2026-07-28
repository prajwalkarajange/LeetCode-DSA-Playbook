import java.util.*;
public class Solution {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5};
        int n=arr.length+1;

        int exceptedSum=n*(n+1)/2;
        int actualSum=0;
        for(int i:arr){
            actualSum=actualSum+i;
        }
        System.out.println(exceptedSum-actualSum);
    }
    
}
