import java.sql.SQLOutput;
import java.util.Scanner;

public class Bubblesort {

    static void printArray(int [] arr){
      //  System.out.println("ARRAY AFTER SORTING : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements of array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("ARRAY AFTER SORTING : ");

        printArray(arr);
    }
}
