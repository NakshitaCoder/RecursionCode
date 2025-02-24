package Substrings;

public class SkipB {
    public static void main(String[] args){
        String str = "baccbdBBBaa";

        System.out.print("Apprach 1:");
        skipBFunc(str, " ");
        System.out.println();
        System.out.println("Approch 2: " + skipBFunc2(str));
    }
    static void skipBFunc(String org, String retStr){
        // base condition
        if(org.isEmpty()){
            System.out.print(retStr);
            return;
        }
        char ch = org.charAt(0);
        if(ch == 'b' || ch == 'B'){
            // skip B
            skipBFunc(org.substring(1), retStr);
        } else {
            // add character
            skipBFunc(org.substring(1), retStr + ch);
        }
    }
    static String skipBFunc2(String orginal){
        // base condition
        if(orginal.isEmpty()){
            return "";
        }
        char ch = orginal.charAt(0);
        if(ch == 'b' || ch == 'B'){
            // Skip B
            return skipBFunc2(orginal.substring(1));
        }else{
            // return char
            return ch + skipBFunc2(orginal.substring(1));
        }
    }
}
