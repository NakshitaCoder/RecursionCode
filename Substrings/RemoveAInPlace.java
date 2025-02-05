package Substrings;

public class RemoveAInPlace {
   public static void main(String[] args){
       String str = "India";
       System.out.println(removeAs(str));
   }
   static String removeAs(String str){
       if(str.isEmpty()){
           return "";
       }
       char ch = str.charAt(0);

       if(ch == 'a' || ch == 'A'){
           return removeAs(str.substring(1));
       }
       else {
           return ch + removeAs(str.substring(1));
       }
   }
}
