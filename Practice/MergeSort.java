package Practice;

import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args){
        int[] arr = {8,3,4,12,5,6};
        System.out.println("Sorted Arr:" + Arrays.toString(mergeSortFunc(arr)));
    }
    static int[] mergeSortFunc(int[] arr){
        // base condition
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSortFunc(Arrays.copyOfRange(arr,0, mid));
        int[] right = mergeSortFunc(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right){
        int[] mergeArr = new int[left.length + right.length];
        int i=0; int j=0; int k=0;

        // 1. comparing both arr
        while(i<left.length && j < right.length){
            if(left[i] < right[j]){
                mergeArr[k++] = left[i++];
            }else{
                mergeArr[k++] = right[j++];
            }
        }
        // if left arr is not empty
        while(i<left.length){
            mergeArr[k++] = left[i++];
        }

        // if right is not empty
        while(j<right.length){
            mergeArr[k++] = right[j++];
        }

        return mergeArr;
    }
}
