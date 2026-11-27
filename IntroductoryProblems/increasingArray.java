//package IntroductoryProblems;

import java.util.Scanner;

public class increasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long count = 0;
        int a = sc.nextInt();
        long[] arr = new long[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]){
                count+= arr[i-1] - arr[i];
                arr[i] = arr[i - 1];
            }
        }

        System.out.println(count);
    }
}
