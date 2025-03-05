package Arrays;
// Leetcode 154. Find Minimum in Rotated Sorted Array II
public class RotatedBinaryFindIdx {
    public static void main(String[] args){
//    Input: num = [2,2,2,0,1] -> Output: 0
      int[] nums = {9, 10,10, 10,11, 90,-3, 1, 4,5,6,7,9,9,9};
      int index = getIndex(nums, 0, nums.length-1);
      System.out.println("Value: "+ nums[index]);
      System.out.println("CountRotation: "+ index);
    }

    public static int getIndex(int[] arr, int left, int right){
        if(left >= right){
            return left;
        }
        int mid = left + (right-left)/2;
        //1. mid > right
        if(arr[mid] > arr[right]){
            return getIndex(arr, mid+1, right);
        }
        // 2. mid < right
        if(arr[mid] < arr[right]){
            return getIndex(arr, left, mid);
        }
        // 3. mid == right
        return getIndex(arr, left, right-1);
        //
    }
}
