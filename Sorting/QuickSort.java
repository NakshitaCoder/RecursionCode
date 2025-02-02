package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,6,8,7, 10, 2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    // Quick Sort
    static void quickSort(int[] arr, int low, int high){
        if(low > high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;

        // get the pivot element
        int pivot = arr[mid];

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                // swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                //index should move -> start inc by 1 and end dec by 1
                start++; end--;
            }
        }
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
