package Substrings;

import java.util.ArrayList;
import java.util.List;

public class subsequence1 {
    public static void main(String[] args){
        String str = "abc";
        getSequence(str, "");
        getSequenceASCII(str, "");
    }

    static void getSequence(String str, String processed){
        if(str.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = str.charAt(0);
        // 1. add it
        getSequence(str.substring(1), processed + ch);
        // 2. ignore it
        getSequence(str.substring(1), processed);
    }

    static void getSequenceASCII(String str, String processed){
        if(str.isEmpty()){
            System.out.print(processed + " ");
            return;
        }
        char ch = str.charAt(0);
        // 1. add it  ASCII value
        getSequenceASCII(str.substring(1), processed + (ch+0));
        // 2. ignore it
        getSequenceASCII(str.substring(1), processed);


    }
}

