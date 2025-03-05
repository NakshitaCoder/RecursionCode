package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {1,3,4,8, 10};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1,3,4,8, 10};
        optimizeSelectionSort(arr2, arr2.length, 0, 0);
        System.out.println(Arrays.toString(arr2));
    }
    static void selectionSort(int[] arr, int row, int col, int max){
        if(row==0){
            return;
        }
        if( col < row){
            if(arr[col] > arr[max]){
                 selectionSort(arr, row, col+1, col);
            }
            else{
                 selectionSort(arr, row, col+1, max);
            }
        }
        else{
            // swap max element
            System.out.println("Swap");
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;

             selectionSort(arr, row-1, 0, 0);
        }
    }
    static void optimizeSelectionSort(int[] arr, int row, int col, int max){
        if(row==0){
            return;
        }
        if( col < row){
            if(arr[col] > arr[max]){

                optimizeSelectionSort(arr, row, col+1, col);
            }
            else{
                optimizeSelectionSort(arr, row, col+1, max);
            }
        }
        else{
            // swap max element only necessary
            if(max != row-1){
                System.out.println("Swap");
                int temp = arr[max];
                arr[max] = arr[row-1];
                arr[row-1] = temp;
            }
            optimizeSelectionSort(arr, row-1, 0, 0);
        }
    }
}
