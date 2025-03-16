package Substrings;

// permutation of String

import java.util.ArrayList;
import java.util.List;

public class Permutation1 {
    public static void main(String[] args){
        String str = "abcd";
        //permutation(str, "");

        List<String> result = new ArrayList<>();
        permutation2(str, "", result);
        System.out.println("List: "+ result);

        // Count func
        int count = countPerm(str, "");
        System.out.println("Count: "+ count);
    }
    static void permutation(String str, String processed){
        if(str.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = str.charAt(0);
        for(int i=0 ; i<=processed.length(); i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i);

            permutation(str.substring(1),first + ch + second );
        }
    }

//    approach 2
    static void permutation2(String str, String processed, List<String> Result){
        if(str.isEmpty()){
            Result.add(processed);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            String rem1 = str.substring(0,i);
            String rem2 = str.substring(i+1);

            String remaining = rem1 + rem2;
            //String remaining = str.substring(0, i) + str.substring(i + 1);


            permutation2(remaining, processed + ch, Result);
        }
    }

    static int countPerm(String str, String proc){
        if(str.isEmpty()){
            return 1;
        }
        int count =0;
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            String rem = str.substring(0,i) + str.substring(i+1);
            count = count + countPerm(rem, proc + ch);
        }
        return count;
    }
}

/*
* generatePermutations("abc", "")
 ├── generatePermutations("bc", "a")
 │   ├── generatePermutations("c", "ab")
 │   │   ├── generatePermutations("", "abc")  → ✅ "abc"
 │   ├── generatePermutations("b", "ac")
 │   │   ├── generatePermutations("", "acb")  → ✅ "acb"
 ├── generatePermutations("ac", "b")
 │   ├── generatePermutations("c", "ba")
 │   │   ├── generatePermutations("", "bac")  → ✅ "bac"
 │   ├── generatePermutations("a", "bc")
 │   │   ├── generatePermutations("", "bca")  → ✅ "bca"
 ├── generatePermutations("ab", "c")
 │   ├── generatePermutations("b", "ca")
 │   │   ├── generatePermutations("", "cab")  → ✅ "cab"
 │   ├── generatePermutations("a", "cb")
 │   │   ├── generatePermutations("", "cba")  → ✅ "cba"
*/
