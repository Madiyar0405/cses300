package IntroductoryProblems;

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String DNA = sc.next();

        int max_length = 1;
        int curr_length = 1;

        for (int i = 1; i < DNA.length(); i++) {
            if(DNA.charAt(i) == DNA.charAt(i-1)) {
                curr_length++;
            }
            else{
                if(max_length < curr_length) {
                    max_length = curr_length;
                }
                curr_length = 1;

            }
        }
        if(curr_length > max_length) {
            max_length = curr_length;
        }
        System.out.println(max_length);

    }
}
