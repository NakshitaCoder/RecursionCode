package Arrays;

// 3. Linear search, return arrayList
//  Note: multiple index

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5,6,7,7};
        int target = 10;
        ArrayList<Integer> list = new ArrayList<>();
        // get the index
        System.out.println("Target: "+ target + " Index: "+getIndex(arr, target, 0, list));
    }

    static ArrayList<Integer> getIndex(int[] arr, int target, int idx, ArrayList<Integer> list){
        if (idx == arr.length){
            return list;
        }
        if(arr[idx] == target ){
            list.add(idx);
        }
        return getIndex(arr, target, idx+1, list);
    }

}
