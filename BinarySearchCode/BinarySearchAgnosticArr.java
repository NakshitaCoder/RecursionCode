package BinarySearchCode;

public class BinarySearchAgnosticArr {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 55, 67, 76, 87, 91};
        int idx = binarySearchAgnosticArr(arr, 100);
        System.out.println("Index: " + idx);
    }
    public static int binarySearchAgnosticArr(int[] arr, int target) {
        // Agnostic means when we don't know if the sorted array is in ascending/descending order.
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];  // Check whether the array is in ascending order?

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc) {
                // Ascending Order
                if(target > arr[mid]){
                    //right side of mid
                    start = mid + 1;
                }
                else {
                    //left side of mid
                    end = mid -1;
                }
            }
            else {
                // Descending Order
                if(target > arr[mid]){
                    //left side of mid
                    end = mid - 1;
                }
                else {
                    //right side of mid
                    start = mid + 1;
                }
            }
        }
        // When target is not found.
        return -1;
    }
}
