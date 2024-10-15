package BinarySearchCode;
// If mentioned as Infinite Arr, then we cannot use the arr.length.

public class PositionInInfiniteArray {
    public static void main(String[] args){
        int[] arr = {5, 7, 7, 7, 7, 7, 8, 8, 9, 10, 11, 15, 15, 20};
        int ans = infiniteArrFunc(arr, 10);
        System.out.println("Index: "+ans);
    }
    public static int infiniteArrFunc(int[] arr, int target){
        //Find the range
        int start = 0;
        int end = 1;
        while(target > arr[end]){   // right now we don't have the condition if target is not present in array.
            int newStart = end + 1;
            // newEnd = previousEnd + 2 * size of chunk
            end = end + 2 * (end - start + 1);    // +1 -> index is starting from 0
            start = newStart;
        }
        // Binary search
        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
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
