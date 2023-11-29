package PracticeQuestions;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0){
            System.out.println(n + " is divisible by both 3 & 5");
        }
        else if(n % 3 == 0){
            System.out.println(n + " is divisible by 3");
        }
        else if(n % 5 == 0){
            System.out.println(n + " is divisible by 5");
        }
        else {
            System.out.println(n +  " is Neither divisible by 3 nor by 5");
        }


    }
}
