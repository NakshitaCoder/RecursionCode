package Recursion;

public class PalindromeNumbers {
    public static void main(String[] args){
        int num = 12121; // true
        boolean ans = palinFunc(num);
        System.out.println("Palindrome : " + ans);;
    }
    static boolean palinFunc(int num){
        if (num < 0){
            return false;
        }
        int digits = (int) Math.log10(num); //number of digits -> pow
        int reverse = helperFunc(num, digits);

        if(num == reverse){
            return true;
        }else {
            return false;
        }
    }
    static int helperFunc(int num, int digits){
        if(num %10 == 0){
            return num;
        }

        // rem * 10^pow + recursive call
        int rem = num % 10;
        int pow = (int)Math.pow(10, digits);

        return (rem * pow) + helperFunc(num/10, digits-1); // return reverse number
    }
}
