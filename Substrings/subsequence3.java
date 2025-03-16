package Substrings;

import java.util.*;


public class subsequence3 {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        List<List<Integer>> ans = getSeq(arr);
        System.out.println("data: " + ans);
    }

    static List<List<Integer>> getSeq(int[] arr){
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        for(int num : arr){
            int size = outerList.size();
            for (int i = 0; i < size; i++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(num);
                outerList.add(innerList);
            }
        }
        return outerList;
    }
}
