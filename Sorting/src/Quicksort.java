import java.util.Scanner;

public class Quicksort {

    static void displayArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr [x] = arr [y];
        arr [y] = temp;
     }

     static int partition(int[] arr, int st, int end ){
        int pivot = arr[st];
        int cnt = 0;
        for(int i=st+1; i<=end; i++){
            if(arr[i] <= pivot) cnt++;
        }
        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);
        int i = st, j = end;

        /* elements lesser or equal --> left of pivotIdx, greater --> right side of pivotIdx */
         while (i<pivotIdx && j>pivotIdx){
             while(arr[i] <= pivot) i++;
             while(arr[j] > pivot) j--;
             if(i<pivotIdx && j>pivotIdx){
                 swap(arr, i, j);
                 i++;
                 j--;
             }
         }
         return pivotIdx;
     }
     static void quickSort(int[] arr, int st, int end){
        if (st >= end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);

     }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array after sorting :");
        quickSort(arr, 0, arr.length-1);
        displayArray(arr);

    }
}
