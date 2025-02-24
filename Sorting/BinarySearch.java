package Sorting;

public class BinarySearch {
    public static void main (String[] args){
        int[] arr = {1,2,3,4,5,11,13};
        int target = 130;
        int idx = binarySearchFunc(arr, target, 0, arr.length-1);
        System.out.println("target: " + target +  " Index: "+ idx);
    }
    // function for binary search
    static int binarySearchFunc(int[] arr, int target, int s, int e){
        if (s > e){
            return -1;
        }
        int mid = s + (e-s) / 2;

        if(target == arr[mid]){
            return mid;
        }
        if(target < arr[mid]){
            return binarySearchFunc(arr, target, s, mid-1);
        }
        return binarySearchFunc(arr, target, mid+1, e);
    }
}
