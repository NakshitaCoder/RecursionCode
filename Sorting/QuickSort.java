package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] nums = {5,4,3,6,8,7, 10, 2,1};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    // Quick Sort
    static void quickSort(int[] nums, int low, int high){
        if(low > high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;

        // get the pivot element
        int pivot = nums[mid];

        while(start <= end){
            while(nums[start] < pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }
            if(start <= end){
                // swap
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                //index should move -> start inc by 1 and end dec by 1
                start++; end--;
            }
        }
        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }
}
