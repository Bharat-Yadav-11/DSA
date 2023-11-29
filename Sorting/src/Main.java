import java.util.Scanner;

public class Main {

    static void printArray(int[] arr){
        System.out.println("Sorted array is : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];


        System.out.println("Enter element "+n+" of array : ");
        for (int i = 0; i < arr.length; i++){
           arr[i] = sc.nextInt();
        }

        //bubble sort

        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        //selection sort
        for (int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
               if (arr[smallest] > arr[j]){
                   smallest = j;
               }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }



        // insertion sort
        for (int i=0; i<arr.length; i++){
            int current = arr[i];
            int j =i-1;
        while (j>=0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        //placement
            arr[j+1] = current;
        }


        printArray(arr);





    }
}