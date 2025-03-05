package Arrays;

// Question 2. Find the index of the minimum element in a rotated sorted array

public class RotatedArrBS2 {
    public static void main(String[] args){
        int[] arr = {1,2};    // Sorted array but rotated with some pivot point
        int index = getIndex2(arr, 0, arr.length-1);
        System.out.println(" Index: " + arr[index]);
    }

    static int getIndex2(int[] arr, int left, int right){
        // get the minimum of arr
        if(arr[left] <= arr[right]){
            return left;
        }

        int mid = left + (right-left) /2;

        if(left < mid && arr[mid] < arr[mid-1]){
            return mid;
        }
        if(mid < right && arr[mid] > arr[mid+1]){
            return mid+1;
        }

        if(arr[right] > arr[mid]){
            return getIndex2(arr, left, mid-1);
        }else{
            return getIndex2(arr, mid+1, right);
        }

    }

}
