package Arrays;

public class IsSortedArray {
    public static void main(String[] args){
        int[] arr = {2,8,4,6,9,12};
        boolean status = getStatus(arr);
        System.out.println("1. Sorted: "+ status);
        System.out.println("2. Sorted: "+ getStatusFunc(arr, 0));

    }

    static boolean getStatus(int[] arr){
        boolean stat = helper(arr, 0, false);
        return stat;
    }

    static boolean helper(int[]arr, int i, boolean stat){
        if(i == arr.length-1){
            return stat;
        }
        if(arr[i] <= arr[i+1]){
            return helper(arr, i+1, true);
        }else{
            return false;
        }
    }

    static boolean getStatusFunc(int [] arr, int idx){
        if( idx >= arr.length-1){
            return false;
        }
        return (arr[idx] <= arr[idx+1]) && getStatusFunc(arr, idx+1);
    }
}
