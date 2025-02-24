package Recursion;

public class ProductNumbers {
    public static void main(String[] args){
        int num = 123450;
        int prod = productFunc(num);
        System.out.println(prod);
    }
    static int productFunc(int num){
        if(num%10 == num){
            return num;
        }
        int rem = num % 10;
        int leftNum = num / 10;

        return rem * productFunc(leftNum);
    }
}
