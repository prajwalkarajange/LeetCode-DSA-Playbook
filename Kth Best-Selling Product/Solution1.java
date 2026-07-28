import java.util.*;
public class Solution1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter Which elemnt sell product you want: ");
        int p=sc.nextInt();

        int [] num=new int[n];
        System.out.println("Enter array Elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        Arrays.sort(num);

        System.out.println(num[n-p]);
    }
    
}
