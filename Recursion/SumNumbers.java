package Recursion;

public class SumNumbers {
    public static void main(String[] args){
        int num = 5;
        int sum = sumFunc(num);
        System.out.println("Sum of " + num + " : " + sum);
        int sum2 = sumFunc2(num);
        System.out.println("Sum of " + num + " : " + sum2);
    }


    static int sumFunc(int num){
        if(num%10 == num){   // better approach
            return num;
        }
        int rem = num % 10;
        int leftNum = num / 10;

        return rem + sumFunc(leftNum);
    }
/*
 What’s the Issue?
The issue is efficiency rather than correctness:

Unnecessary recursive call:
1. Instead of stopping at sumFunc2(5), it calls sumFunc2(0) before returning.
       That extra call is not needed because 5 itself is already the sum.
2. More function calls = more stack memory used
        Even though it's a small issue, avoiding unnecessary recursion is always better.
 */
    static int sumFunc2(int num){
        if(num < 1){   //not good approach
            return num;
        }
        int rem = num % 10;
        int leftNum = num / 10;

        return rem + sumFunc2(leftNum);
    }
}
