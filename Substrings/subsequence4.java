package Substrings;

import java.util.ArrayList;
import java.util.List;

public class subsequence4 {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        List<List<Integer>> list = getSeq(arr);
        System.out.println("data: " + list);

//        Approach 1
        List<List<Integer>> evenList = new ArrayList<>();
        for(List<Integer> inner : list){
            if(getSum(inner) % 2 == 0){
                evenList.add(inner);
            }
        }
        System.out.println("Check even: " + evenList);

//        Approach 2 use removeIf

        List<List<Integer>> odd = list;
        odd.removeIf(inner -> getSum(inner) %2 == 0);   // removing even items
        System.out.println("Check Odd: " + odd);
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

    static int getSum(List<Integer> list){
        int sum =0;
        for(int num : list){
            sum += num;
        }
        return sum;
    }
}
