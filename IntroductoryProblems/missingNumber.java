
import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        long n = sc.nextLong();
        for (int i = 0; i < n- 1; i++) {
            long x = sc.nextInt();
            sum+=x ;
        }
        long s = n * (1 + n) / 2;
        System.out.println(s - sum);
    }

}







