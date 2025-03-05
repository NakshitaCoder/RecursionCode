package BinarySearchCode;
/*
 Binary search Pattern Questions.
 LeetCode Question: Find the ceiling of the target number
     Ceiling-> The smallest number in array which is greater or = than target.
     Ceiling [Arr, Target] >= Target.
*/

public class CeilingOfTarget {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 55, 67, 76, 87, 91};
                  // {0,  1,  2 , 3,  4,  5,  6,  7,  8,  9};

        int idx = ceilingOfTargetFunc(arr, 80); // it should return 8
        if(idx == -1){
            System.out.println("Target is greater than last value of array!");
        }else {
            System.out.println("Index: " + idx + " Value: " + arr[idx]);
        }
    }
    public static int ceilingOfTargetFunc(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        // if target is greater than end value
        if(target > arr[arr.length-1]){
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
        // The value is on start position.
        return start;
    }
}
