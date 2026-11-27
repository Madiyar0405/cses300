//package IntroductoryProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String DNA = sc.next();
        int ans = 0;
        int count = 0;
        for (int i = 0; i < DNA.length(); i++) {
            if(i != 0 && DNA.charAt(i) == DNA.charAt(i -1))
                count++;
            else
                count = 1;
            if(count > ans){
                ans = count;
            }
        }

        System.out.println(ans);
    }
}

