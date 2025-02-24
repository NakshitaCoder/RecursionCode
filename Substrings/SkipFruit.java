package Substrings;

public class SkipFruit {
    public static void main(String[] args) {
        String fruits = "Banana Apple Orange Guava";
        skipFruitFunc1(fruits, "");
        System.out.println();
        System.out.println(skipFruitFunc2(fruits));
    }

    static void skipFruitFunc1(String fruits, String ans){
        // base condition
        if(fruits.isEmpty()){
            System.out.print(ans);
            return;
        }
        char ch = fruits.charAt(0);
        if(fruits.startsWith("Orange")){
            skipFruitFunc1(fruits.substring(6), ans);
        }else {
            skipFruitFunc1(fruits.substring(1), ans + ch);
        }

    }

    static String skipFruitFunc2(String fruits){
        if(fruits.isEmpty()){
            return "";
        }
        char ch = fruits.charAt(0);
        if(fruits.startsWith("Orange")){
            return skipFruitFunc2(fruits.substring(6));
        }else{
            return ch + skipFruitFunc2(fruits.substring(1));
        }
    }


}

