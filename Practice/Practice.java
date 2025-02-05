package Practice;

public class Practice {
    public static void main(String[] args){
        String str = "Mango and Apple are my fav fruit";

        System.out.print("Method 1: ");
        removeAs(str, "");
        System.out.println("Method 2: " + removeAsInPlace(str));
        System.out.println("Method 3: " + removeApple(str));

// Checking if String is blank or not using isBlank().
        String checkStr = "";
        check(checkStr);
    }



// Note: In this case we are printing in the last call so we need to add ch at end of ans each time
// Note: when we are returning the data and then print so put ch in front.

    static void removeAs(String str, String ans){
        // base condition
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            removeAs(str.substring(1) ,ans);
        }
        else {
            removeAs(str.substring(1),  ans + ch);
        }
    }

    static String removeAsInPlace(String str){
        // base condition
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return removeAsInPlace(str.substring(1));
        }
        else {
            return ch + removeAsInPlace(str.substring(1));
        }
    }

    static String removeApple(String str){
        // base condition
        if(str.isEmpty()){
            return "";
        }
        if(str.isBlank()){
            System.out.println("Blank");
        }
        char ch = str.charAt(0);

        if(str.startsWith("apple") || str.startsWith("Apple")){
            // Size of Apple
            return removeApple(str.substring(5));
        }
        else {
            return ch + removeApple(str.substring(1));
        }

    }
    static void check(String str){
        if(str.isBlank()){  // if str= " ", contains one whitespace or many still it return true.
            System.out.println("Blank status: True ");
        }
        if (str.isEmpty()){     // if str = "" then only isEmpty is true
            System.out.println("Empty Status: True");
        }

    }

}
