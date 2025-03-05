package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {4,3,2,1};
        arr = bubbleSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] bubbleSort(int[] arr, int col, int row){
        if(row == 0){
            return arr;
        }
        if(col < row){
            if(arr[col] > arr[col+1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
                return bubbleSort(arr, col+1, row);
        }
        else{
            return bubbleSort(arr, 0, row-1);
        }
    }
}
