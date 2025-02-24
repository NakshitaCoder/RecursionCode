package Recursion;

public class ReverseNumbers {
    public static void main(String[] args){
        int num = 1234;
        int rev = reverseFunc(num);
        System.out.println("reverse of "+ num + " : "+ rev);
        System.out.println("reverse of "+ num + " : "+ reverseFunc(num, 0));
    }

    /*
        Method 1: using helper func
        rem * 10 ^ pow (no of digits) + recursive call
     */
    static int reverseFunc(int num ){
        int digits = (int) Math.log10(num);
        return helperFunc(num, digits);
    }

    static int helperFunc(int num, int digits){
        if(num % 10 == num){
            return num;
        }
        int rem = num % 10;
        int place = (int) Math.pow(10, digits);
        int ans = (rem * place) + helperFunc(num/10, digits-1);

        return ans;
    }

/*
    Method 2: passing reverse in Arguments
     rev * 10 + rem
        1. 0 * 10 + 4
        2. 4 * 10 + 3
        3. 43 * 10 + 2
        4. 432 * 10 + 1 -> rev : 4321
 */
    static int reverseFunc(int num, int reverse){
        if(num == 0){
            return reverse;
        }

        return reverseFunc(num/10, reverse * 10 + num%10);
    }
}
