import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of elements: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        int []copy=new int[n];

        System.out.println("Enter array Elemnts: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            copy[i]=arr[i];

        }

        Arrays.sort(copy);

        HashMap<Integer,Integer> map=new HashMap<>();

        int rank=1;

        for(int num:copy){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank++;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(map.get(arr[i])+" ");
        }
        
    
    }
}