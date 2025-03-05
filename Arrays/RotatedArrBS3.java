package Arrays;

public class RotatedArrBS3 {
    // max element
    public static void main(String[] args){
        int[] arr = {4,5,8,0,1,2,3};    // Sorted array but rotated with some pivot point
        int index = search(arr, 0, arr.length-1);
        System.out.println(" Index: " + index);
    }

    static int search(int[] arr, int left, int right){
       if(left==right){
           return left;
       }
       int mid = left + (right - left) /2;

       // right side is smaller
       if(mid < right && arr[mid] > arr[mid+1]){
           return mid;
       }
       if(left < mid && arr[mid-1] > arr[mid]){
           return mid-1;
       }

       if(arr[right] < arr[mid]){
           return search(arr, mid+1, right);
       }
       else {
           return search(arr, left, mid-1);
       }
    }
}
