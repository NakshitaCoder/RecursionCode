package BinarySearchCode;
/*
 Binary search Pattern Questions.
 LeetCode Question: Find the Floor of the target number
     Floor-> The greatest number in array which is smaller or = than target.
     Floor [Arr, Target] <= Target.
*/

public class FloorOfTarget {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 55, 67, 76, 87, 91};
                  // {0,  1,  2 , 3,  4,  5,  6,  7,  8,  9};

        int idx = floorOfTargetFunc(arr, 60);
        if(idx == -1){
            System.out.println("Target is smaller than first value of array!");
        }else {
            System.out.println("Index: " + idx + " Value: " + arr[idx]);
        }
    }
    public static int floorOfTargetFunc(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        // if target is smaller than end value
        if(target < arr[0]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                // target found
                return mid;
            }
        }
        // The value is on end position.
        return end;
    }
}
