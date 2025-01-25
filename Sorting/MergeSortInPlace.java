package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1,8,6,12};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSortInPlace(int[] arr, int s, int e){
        //base condition
        if(e-s == 1){
            return;
        }
        int mid = (s+e)/2;

         mergeSortInPlace(arr, s, mid);
         mergeSortInPlace(arr, mid, e);

        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int mid, int e ){
        int[] mix = new int[e-s];
        int i = s,j = mid ,k = 0;

        while (i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k++] = arr[i++];
            }
            else {
                mix[k++] = arr[j++];
            }
        }
        // if first array is not empty yet
        while (i< mid){
            mix[k++] = arr[i++];
        }
        // if second array is not empty yet
        while(j < e){
            mix[k++] = arr[j++];
        }
        // copying the value of mix into arr
        for(int idx =0; idx< mix.length; idx++){
            arr[s + idx] = mix[idx];
        }
    }
}
