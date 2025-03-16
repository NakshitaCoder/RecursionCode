package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1,8,6,12};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr){
        //base condition
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0,j = 0 ,k = 0;

        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k++] = first[i++];
            }else {
                mix[k++] = second[j++];
            }
        }
        // if first array is not empty yet
        while (i< first.length){
            mix[k++] = first[i++];
        }
        // if second array is not empty yet
        while(j<second.length){
            mix[k++] = second[j++];
        }
        return mix;
    }
}
