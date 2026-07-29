import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int W=sc.nextInt();

        if(2>=W && W%2!=0 && V>=W){
            System.out.println("Invalid Input");
        }

        int FW=(W-2*V)/2;
        int TW=V-FW;

        if(FW<0 || TW<0){
            System.out.println("Invalid Input");
        }else{
            System.out.println("TW: "+TW);
            System.out.println("FW: "+FW);
        }
    }
    
}
