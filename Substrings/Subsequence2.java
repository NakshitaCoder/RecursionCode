package Substrings;

import java.util.ArrayList;
public class Subsequence2 {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = getSequence("", str);
        System.out.println("List1: "+ list);

        ArrayList<String> list2 = getSequenceAscii("", str);
        System.out.println("List2: "+ list2);
    }
    static ArrayList<String> getSequence(String processed, String str){
        if(str.isEmpty()){
            ArrayList<String> newList = new ArrayList<>();
            newList.add(processed);
            return newList;
        }

        ArrayList<String> left = getSequence(processed + str.charAt(0), str.substring(1));
        ArrayList<String> right = getSequence(processed, str.substring(1));

        left.addAll(right);

        return left;
    }

    static ArrayList<String> getSequenceAscii(String processed, String str){
        if(str.isEmpty()){
            ArrayList<String> newList = new ArrayList<>();
            newList.add(processed);
            return newList;
        }
        char ch = str.charAt(0);

        ArrayList<String> left = getSequenceAscii(processed + ch, str.substring(1));
        ArrayList<String> right = getSequenceAscii(processed, str.substring(1));
        ArrayList<String> ascii = getSequenceAscii(processed + ( ch + 0 ), str.substring(1));

        left.addAll(right);
        left.addAll(ascii);

        return left;
    }

}
