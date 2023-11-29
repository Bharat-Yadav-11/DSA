package PracticeQuestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check for Palindrome");
        int num = sc.nextInt();
        int revNum = 0;
        int remainder;
        int realNum = num;
        while(num != 0){
            remainder = num%10;
            revNum = revNum*10 + remainder;
            num = num/10;
            System.out.println(revNum);
        }
        if(realNum == revNum){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }





    }
}
