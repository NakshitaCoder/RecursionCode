package Arrays;
import java.util.ArrayList;

// 2. Linear search, create new static arrayList for returning the list
//  Note: multiple index
public class LinearSearchArray2 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,40,50};
        int target = 40;
        getLinearSearch(arr, target, 0);
        System.out.println("Index: "+ list);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void getLinearSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        getLinearSearch(arr, target, index+1);
    }



}
