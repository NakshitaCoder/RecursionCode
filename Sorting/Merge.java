package Sorting;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {10, 20, 8 ,4, 800, 90, 100};

        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length];
        int i=0, j=0, k=0;

        while (i<left.length && j<right.length) {
            if (left[i] < right[j]) {
                mix[k++] = left[i++];
            } else {
                mix[k++] = right[j++];
            }
        }
        // if left array is not empty
        while(i< left.length){
            mix[k++] = left[i++];
        }
        // if right array is not empty
        while(j< right.length){
            mix[k++] = right[j++];
        }

        return mix;
    }
}
