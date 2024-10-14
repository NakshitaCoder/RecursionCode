package BinarySearchCode;

public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 55, 67, 76, 87, 91};
        int idx = binarySearchFunc(arr, 91);
        System.out.println("Index: " + idx);
    }
    public static int binarySearchFunc(int[] arr, int target){
        // start, end and mid
        int start = 0;
        int end = arr.length -1 ;
        // Int has a specific range so we need to keep the middle value in the range of int only.

        // check
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) {
                // start changes to mid + 1
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }

        // if target not hit, return -1.
        return -1;
    }
}