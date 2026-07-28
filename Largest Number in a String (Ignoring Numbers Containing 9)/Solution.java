import java.util.*;
public class Solution {
    public static void main(String[] args){
        String s="This is alpha 5057 and 9758";
        int num=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'0';

            if(n>=0 && n<=8){
                num=num*10+n;

                if(num>max){
                    max=num;
                }
            }else{
                num=0;
            }
            
        }
        System.out.println(max);
    }
}
