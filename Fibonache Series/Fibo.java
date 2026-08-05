import java.util.*;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int next = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(first+" ");
            next = first + second;
            first = second;
            second = next;

            

        }

    }
}