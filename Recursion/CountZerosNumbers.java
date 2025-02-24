package Recursion;

public class CountZerosNumbers {
    public static void main(String[] args){
        int number = 10000; // count - 4
        int count = countZeros(number, 0);
        System.out.println("No of Zeros: "+count);
    }

    static int countZeros(int num, int count){

        if(num == 0){
            return count;
        }
        int rem = num % 10;
        if(rem == 0){
            return countZeros(num/10, count+1);
        }
        else {
            return countZeros(num/10, count);
        }
    }

}
