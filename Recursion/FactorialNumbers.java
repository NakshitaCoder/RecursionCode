package Recursion;

public class FactorialNumbers {
    public static void main(String[] args){
        int target = 6;
        int fact = factorialFunc(target);
        System.out.println("Factorial of "+ target + " :" + fact);
    }
    static int factorialFunc(int target){
        if(target < 1){
            return 1;
        }
        int factorial = target * factorialFunc(target - 1);
        return factorial;
    }
}
