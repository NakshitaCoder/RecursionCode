package Substrings;

public class RemoveAs {
    public static void main(String[] args){
        String str = "abc"; // Ans: bcdbcbcdd
        removeAllA(str, "");
    }
    static void removeAllA(String str, String ans){
        // base condition
        if(str.isEmpty()){
            System.out.print(ans);
            return;
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            removeAllA(str.substring(1), ans);
        }
        else {
            // This will add ch at end as we want
            removeAllA(str.substring(1), ans + ch);
            // This will add ch at first pos in ans -> reverse pos ans
           //removeAllA(str.substring(1), ch + ans);
        }
    }
}
