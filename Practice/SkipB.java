package Practice;
// Approach 2: Create variable in function body
public class SkipB {
    public static void main(String[] args){
        String str = "baccadbabababcdxxz";
        System.out.println("Original: " + str);
        System.out.println("Processed: " + skipWords(str));
    }
    static String skipWords (String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a' || ch == 'A'){
            return skipWords(str.substring(1));
        }
        else{
            return ch + skipWords(str.substring(1));
        }
    }
}
