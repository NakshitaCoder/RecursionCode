package Arrays;
// 1. Linear search
//Note: Single index

public class LinearSearchArray {
    public static void main(String[] args){
        int[] arr = {3,2,1,18,9};
        int target = 18;
        int index = getLinearIdx(arr, target, 0);
        System.out.println("Index: " + index);
        System.out.println("Index: " + linearSearch(arr, target, 0));
        System.out.println("Method 3: Index: " + getIndexFromBehind(arr, target, arr.length-1));
    }

    //  return the index value
    static int getLinearIdx(int[] arr, int target, int i){
        // base condition
        if(i == arr.length){
            return -1;
        }

        if(target == arr[i]){
            return i;
        }else{
            return getLinearIdx(arr, target, i+1);
        }
    }

    // only for boolean value
    static boolean linearSearch(int[] arr, int target, int i){
        if(i > arr.length-1){
            return false; // not found
        }
        return target == arr[i] || linearSearch(arr, target, i+1);
    }

    // Question2 : linear search from back
    static int getIndexFromBehind(int[] arr, int target, int index){
        if(index < 0){
            return -1;
        }
        /*
        if(target == arr[index]){
            return index;
        }
        else {
            return getIndexFromBehind(arr, target, index -1);
        }*/
        return (target == arr[index]) ? index : getIndexFromBehind(arr, target, index-1);
    }
}
