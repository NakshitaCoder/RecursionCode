package Recursion;

public class CeilingRec {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 55, 67, 76, 87, 91};
        //           {0,  1,  2 , 3,  4,  5,  6,  7,  8,  9};
        int target = 58;
        int idx = ceilingFunc(arr, target, 0, arr.length - 1);
        System.out.println("Index: " + idx);
        System.out.println("Target: " + target);
    }

    static int ceilingFunc(int[] arr, int target, int start, int end) {
        if (start > end) {
            return (start < arr.length) ? arr[start] : -1; //not found
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return ceilingFunc(arr, target, start, mid - 1);
        } else
            return ceilingFunc(arr, target, mid + 1, end);
    }
}

