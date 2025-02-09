package IntroductoryProblems;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long exp_sum = (long) n * (n + 1) / 2;
        long act_sum = 0;
        for (int i = 0; i < n-1 ; i++) {
            int num = sc.nextInt();
            act_sum += num;
        }

        System.out.println(exp_sum - act_sum);
    }
}
