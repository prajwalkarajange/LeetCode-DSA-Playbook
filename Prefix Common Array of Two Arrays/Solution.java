import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] A = { 1, 3, 2, 4 };

        int[] B = { 3, 1, 2, 4 };

        
        for(int i=0;i<A.length;i++){
            int count=0;
            for(int j=0;j<=i;j++){
                for(int k=0;k<=i;k++){
                    if(A[j]==B[k]){
                        count++;
                    }
                }
                

            }
            
            System.out.print(count+" ");
        }
    }

}
