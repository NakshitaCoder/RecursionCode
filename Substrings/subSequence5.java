package Substrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// remove duplicates
public class subSequence5 {
    public static void main(String[] args){
        int[] arr = {1,2,2};
        List<List<Integer>> ans = getSequenceDuplicates(arr);
        System.out.println("data: " + ans);
    }
    static List<List<Integer>> getSequenceDuplicates(int[] arr){
        int start=0; int end =0;
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        Arrays.sort(arr);
        for(int index =0; index <arr.length; index++){
            start =0;
            if(index >0 && arr[index] == arr[index-1]){
                start = end +1;
            }
            end = outerList.size() - 1;
            int size = outerList.size();
            for(int i =start; i<size; i++){
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(arr[index]);
                outerList.add(innerList);
            }
        }
        return outerList;
    }


}
