package Recursion;

public class StepsNumbers {
    public static void main(String[] args){
        int num = 14;
        int steps = getStepsFunc(num, 0);
        System.out.println("Method 1. "+ num + " : " + steps);
        System.out.println("Method 2. "+ num + " : " + getStepsFunc2(num, 0));
    }

    static int getStepsFunc(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num%2==0){
            return getStepsFunc(num/2, ++steps);
        }
        else {
            return getStepsFunc(num-1, ++steps);
        }
    }

    static int getStepsFunc2(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num%2==0){
            num=num/2;
        }
        else {
            num=num-1;
        }
        return getStepsFunc2(num, ++steps);
    }
}
