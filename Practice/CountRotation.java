package Practice;

public class CountRotation {
    public static void main(String[] args){
        int[] arr = {15, 18,19,23,155, -9, 1,2, 3, 6, 12, 13};
        // Output -> 5 -> no of times the array rotated
        int rotated = countRotation(arr, 0, arr.length-1);
        System.out.println("Counts: "+ rotated);
    }

    static int countRotation(int[] arr, int left, int right){
        if (arr[left] <= arr[right]){
            return left;
        }

        int mid = left + (right - left)/2;

        if(left < mid && arr[mid] < arr[mid-1]){
            return mid;
        }

        if(right > mid && arr[mid+1] < arr[mid]){
            return mid+1;
        }

        if(arr[mid] < arr[right]){
            return countRotation(arr, left, mid);
        }
        else{
            return countRotation(arr, mid+1, right);
        }
    }
}
