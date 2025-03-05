package Practice;

import java.util.Arrays;

public class inPlaceMergeSort {
    public static void main(String[] args){
        int[] arr = {8,3,4,12,5,6};
        solve(arr, 0, arr.length);
        System.out.println("Sorted Arr:" + Arrays.toString(arr));
    }
    static void solve(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = (start + end)/2;

        solve(arr, 0, mid);
        solve(arr, mid, end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end){
        int[] mix = new int[end-start];
        int i =start; int j=mid; int k =0;

        while(i< mid && j < end){
            if(arr[i] < arr[j]){
                mix[k++] = arr[i++];
            }
            else{
                mix[k++] = arr[j++];
            }
        }

        while(i<mid){
            mix[k++] = arr[i++];
        }

        while(j<end){
            mix[k++] = arr[j++];
        }

        // manipulate the arr
        for (int z = 0; z < mix.length; z++) {
            arr[start + z] = mix[z];
        }

    }
}
