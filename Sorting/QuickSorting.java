package Sorting;

import java.util.Arrays;

public class QuickSorting {
    public static void main(String[] args){
        int[] arr = {10,80,70,90,20,30,60,40};
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted: "+ Arrays.toString(arr));
    }

    static void quickSort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) /2;
        int pivot = nums[mid];
        System.out.println("Pivot: "+ pivot);

        while(start <= end){
            while(nums[start] < pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }

            if(start <= end){
                // Swap the elements
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++; end--;

                // print
                System.out.println(Arrays.toString(nums));
            }
        }

        // Pivot is on right position.

        // check left half
        quickSort(nums, low, end);

        // check right half
        quickSort(nums, start, high);
    }
}
