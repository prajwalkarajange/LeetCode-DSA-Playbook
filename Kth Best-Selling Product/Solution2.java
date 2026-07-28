
import java.util.*;

public class Solution2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter Which elemnt sell product you want: ");
        int p = sc.nextInt();

        int[] num = new int[n];
        System.out.println("Enter array Elements: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (j < n && num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            
        }
        System.out.println(num[p-1]);
    }
}
