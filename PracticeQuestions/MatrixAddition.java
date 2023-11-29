package PracticeQuestions;
import java.util.*;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of matrix: ");
        int r = sc.nextInt();
        System.out.println("Enter the cols of matrix: ");
        int c =sc.nextInt();

        int[][] a1 = new int[r][c];
        int[][] a2 = new int[r][c];
        int[][] a3 = new int[r][c];

        System.out.println("Enter the element of matrix 1: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix 2: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The sum of matrix 1 & 2 is: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a3[i][j] = a1[i][j] + a2[i][j];
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(a3[i][j]+" ");
            }
            System.out.println();
        }




    }
}
