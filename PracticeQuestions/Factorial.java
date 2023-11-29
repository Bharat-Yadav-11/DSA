package PracticeQuestions;

import java.util.*;

public class Factorial {

    // Method by using Recursion
    public static int factRec(int n){
        if(n == 0 || n == 1) return 1; // base case
        //Recursive work + self work
        return n*factRec(n-1);

    /*  Evaluation of the above statement
        int factRec_nm1 = fact(n-1); // Recursive work
        int factRec_n = n*fact_nm1; // Self work
        return factRec_n; */

    }

    //By using normal method
    public static int printFactorial(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to calculate its factorial: ");
        int n = sc.nextInt();
//        int fact = 1;
//        for(int i=1; i<=n; i++){
//            fact = fact * i;
//            System.out.println("The factorial of "+i+" is "+fact);
//        }
//        System.out.println("The factorial of "+n+" is "+fact);


        //By using Recursion
//        System.out.println("The factorial of "+n+ " is "+factRec(n));
//        for(int i=1; i<=n; i++){
//            System.out.println("The factorial of "+i+ " is "+factRec(i));
//        }



//        By using normal method
        System.out.println(printFactorial(n));




    }
}
