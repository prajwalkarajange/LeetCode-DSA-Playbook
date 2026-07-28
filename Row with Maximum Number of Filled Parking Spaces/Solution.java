import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 0 },
                { 1, 1, 1 },
                { 1, 1, 1 } };
        int n = arr.length;
        int sum = 0;
        int maxSum = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + arr[i][j];
                if (maxSum < sum) {
                    maxSum = sum;
                    index = i;
                }
            }
            sum = 0;
        }

        System.out.println(index + 1);

    }
}
