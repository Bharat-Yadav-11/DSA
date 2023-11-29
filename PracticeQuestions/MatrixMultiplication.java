package PracticeQuestions;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. the rows of matrix 1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter no. the cols of matrix 1: ");
        int c1 =sc.nextInt();
        System.out.println("Enter the no. rows of matrix 2: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the no. cols of matrix 2: ");
        int c2 =sc.nextInt();

        if(c1 != r2){
            System.out.println("Matrix multiplication is not possible!");
            return;
        }

        int[][] a1 = new int[r1][c1];
        int[][] a2 = new int[r2][c2];
        int[][] a3 = new int[r1][c2];


        System.out.println("Enter the element of matrix 1: ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix 2: ");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                a2[i][j] = sc.nextInt();
            }
        }


        System.out.println("The product of matrix 1 & 2 is: ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    a3[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }
        //Print the matrix
        for(int i=0; i<r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(a3[i][j] + " ");

            }
            System.out.println();
        }
    }
}
