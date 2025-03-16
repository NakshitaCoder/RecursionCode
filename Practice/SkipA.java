package Practice;
// Approach 1: Pass ans/Processed arr in argument
public class SkipA {
    public static void main(String[] args){
        String str = "baccadbabababcdxxz";
        skipWords(str, "");
    }

    static void skipWords(String str, String ans){
        if(str.isEmpty()){
            System.out.print(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a' || ch == 'A'){
            skipWords(str.substring(1), ans);
        }
        else{
            skipWords(str.substring(1),  ans + ch);
        }
    }
}
