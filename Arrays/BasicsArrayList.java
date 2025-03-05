package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BasicsArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        addingNum(numList);

//        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> listnew = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(listnew);

    }

    static void addingNum(ArrayList<Integer> list){
        // adding
        list.add(10);
        list.add(20);
        list.add(2, 30);
        list.add(3, 40);
        list.add(50);
        list.add(60);

        System.out.println("List:" + list);
//
//        System.out.println("Get: "+ list.get(0));
        int ele = list.getLast();
//        System.out.println(ele);
        System.out.println("Set: "+ list.set(0, 100));

        System.out.println("List:" + list);
        int size = list.size();
//        System.out.println("Size: "+size);

        // contains or not
//        System.out.println("50 contains: "+ list.contains(50));

        // Iteration For loop
        for(int i=0; i<list.size(); i++){
//            System.out.print(i+1 + ": " + list.get(i) + " ");
        }

        System.out.println();

        // iteration using for each loop
        for(int num : list){
//            System.out.print(num + " ");
        }

        // using iterator
        Iterator<Integer> iter = list.iterator();

//        System.out.println("Iterator");
        while(iter.hasNext()){
//            System.out.println(iter.next());
        }


    }


}
