package Substrings;

public class SkipApple {
    public static void main(String[] args){
        String str = "mango apple pear";
        System.out.println(skipApp(str));
    }

    static String skipApp(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(str.startsWith("apple")){
            return skipApp(str.substring(5)); // Size of Apple
        }else{
            return ch + skipApp(str.substring(1));
        }
    }
    static String skipApp2(String str){
        if(str.isEmpty()){
            return "";
        }
        String[] c = str.split(" ");
        if(str.startsWith("apple")){
            return skipApp(str.substring(5)); // Size of Apple
        }else{
            return c + skipApp(str.substring(1));
        }
    }
}
