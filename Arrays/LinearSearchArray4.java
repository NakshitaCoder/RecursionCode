package Arrays;
// 4. Linear search, create new static arrayList inside **BODY** for returning the list.
// Note: multiple index, Very Important Concept of creating arrayList inside the body of the function and print data according to that.

import java.util.*;

public class LinearSearchArray4 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5,8};
        int target = 4;
        System.out.println("Index: " + getIndex(arr, target, 0));

    }
    static ArrayList<Integer> getIndex(int[] arr, int target, int idx){
        ArrayList<Integer> currentList = new ArrayList<>();
        // base condition
        if(idx == arr.length){
            return currentList;
        }
        if(arr[idx]==target){
            // current function call
            currentList.add(idx);
        }
        ArrayList<Integer> previousAns = getIndex(arr, target, idx+1);
        currentList.addAll(previousAns);
        return currentList;
    }
}
