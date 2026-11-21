package IntroductoryProblems;

import java.util.Scanner;

public class weirdAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        while(n != 1){
            System.out.print(n + " ");
            if(n%2!=0){
                 n=(n*3) + 1;
            }
            else{
                   n/=2;
            }
        }
        System.out.println(n);


    }

}
