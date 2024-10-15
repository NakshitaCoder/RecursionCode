package BinarySearchCode;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args){
        int[] arr = {5, 7, 7, 7, 7, 7, 8, 8, 9, 10, 11, 15, 15};
        int[] ans = firstAndLastFunc(arr, 9);
        System.out.println("Ans: "+ Arrays.toString(ans));
    }
    public static int[] firstAndLastFunc(int[] arr, int target){
        int[] ans = {-1, -1};
        ans[0] = searchIndex(arr, target, true);
        if(ans[0] != -1){
            ans[1] = searchIndex(arr, target, false);
        }
        return ans;
    }
    public static int searchIndex(int[] arr, int target, boolean isFirst){
        int start =0;
        int end = arr.length -1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end-start) /2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if (target < arr[mid]){
                end = mid -1;
            }
            else {
                // Target found -> check if the target is present in left or right array
                ans = mid;
                if(isFirst){
                    // first position -> left array
                    end = mid -1;
                }
                else {
                    // last position is always on right
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
