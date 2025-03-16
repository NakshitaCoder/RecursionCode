package Practice;

public class SkipWords {
    public static void main(String[] args){
        String target = "mangoappleApplebanana";
        System.out.println("Target: "+ target);
        System.out.print("Approach 1: ");
        getAns(target, "");              //Approach 1: Argument pass

        String processed = getAns2(target);         //Approach 2: Create variable in function body
        System.out.println();
        System.out.println("Approach 2: "+ processed);
    }

    static void getAns(String str, String processed){
        if(str.isEmpty()){
            System.out.print(processed);
            return;
        }
        char ch = str.charAt(0);
        if(str.startsWith("Apple") || str.startsWith("apple")){
            getAns(str.substring(5), processed);
        }else{
            getAns(str.substring(1),  processed + ch);
        }
    }

    static String getAns2(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(str.startsWith("Apple") || str.startsWith("apple")){
            return getAns2(str.substring(5));
        }
        else{
            return ch + getAns2(str.substring(1));
        }
    }
}
