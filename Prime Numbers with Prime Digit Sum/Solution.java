import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n = 20;
        int m = 30;

        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                int sum = digitSum(i);

                if (isPrime(sum)) {
                    System.out.println(i + " ");
                }
            }

        }
    }

    public static boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }

        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int lDigit = n % 10;
            sum = sum + lDigit;
            n = n / 10;
        }
        return sum;

    }
}
