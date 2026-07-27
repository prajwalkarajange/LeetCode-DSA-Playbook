import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        HashMap<String, Integer> map = new HashMap<>();

        String day=sc.next().toLowerCase();

        int n=sc.nextInt();

        map.put("sun", 0);
        map.put("mon", 1);
        map.put("tue", 2);
        map.put("wed", 3);
        map.put("thu", 4);
        map.put("fri", 5);
        map.put("sat", 6);

        int start=map.get(day);

        int count=0;

        for(int i=0;i<=n;i++){
            if((start+i)%7==0){
                count++;
            }
        }
        System.out.println(count);
    }

}
