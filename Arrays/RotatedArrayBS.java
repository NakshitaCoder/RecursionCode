package Arrays;

// Question 1. Search an element in a rotated sorted array (Recursive) Rotated Array Binary Search

/*Time complexity:
Best case: O(1)->found at mid
Worst case: O(Log N) -> element found at last step/not found -> better than linear search O(N)
*/
public class RotatedArrayBS {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,1,2,3};    // Sorted array but rotated with some pivot point
        int target = 1;
        int index = getIndex(arr, target, 0, arr.length-1);
        System.out.println("Target: "+ target + " Index: " + index);
    }
    static int getIndex(int[] arr, int target, int start, int end){
        if(start > end){
            return -1; // not found case
        }
        int mid = start + (end-start) / 2;
        // case 1: found at mid
        if(target == arr[mid]){
            return mid;
        }
        // case 2: check for left side if it is sorted or not
        if(arr[start] < arr[mid]){
            if(target >= arr[start] && target < arr[mid]){
                return getIndex(arr, target, start, mid-1);
            }else{
                return getIndex(arr, target, mid+1, end);
            }
        }
        // case 3: check for right side
        else {
            if(target > arr[mid] && target <= arr[end]){
                return getIndex(arr, target, mid+1, end);
            }
            else {
                return getIndex(arr, target, start, mid-1);
            }
        }
    }
}
/*
Approach for Rotated Binary Search
Algorithm Steps:
1. Find the Middle Element: (low + high) / 2
2. Check if the Middle Element is the Target: If arr[mid] == target, return mid.
3. Determine the Sorted Half:
    If arr[low] ≤ arr[mid], the left half is sorted.
    Otherwise, the right half is sorted.
4. Decide Where to Search Next:
    a.If the left half is sorted, check if the target is in the left range. If yes, search in low to mid-1, otherwise search in mid+1 to high.
    b.If the right half is sorted, check if the target is in that range. If yes, search in mid+1 to high, otherwise search in low to mid-1.
5. Repeat Until low > high (Element Not Found).
 */