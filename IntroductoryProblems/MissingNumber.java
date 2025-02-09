package IntroductoryProblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> nums = new HashSet<Integer>();

        int n = sc.nextInt();
        for (int i = 0; i < n-1 ; i++) {
            nums.add(sc.nextInt());
        }

        for (int i = 1; i <=n ; i++) {
            if(!nums.contains(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
