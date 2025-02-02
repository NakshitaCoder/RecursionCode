package Recursion;

public class FibnociiSeries {
    public static void main(String[] args){
        // print 0, 1, 1, 2, 3, 5, 8 ,   ....

       int ans = fibFunc(10);
       System.out.println(ans + " ");

        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibFunc(int idx){
        // base condition
        if(idx < 2){
            return idx;
        }
        return fibFunc(idx-1) + fibFunc(idx-2);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


