package Recursion;

public class GeneralRecursion {
    public static void main(String[] args) {
        int N = 10;
        func(N);
    }
    static void func(int N){
        // base condition
        if(N==1){
            System.out.print(N + " ");
            return;
        }
        // Main
        System.out.print(N + " ");
        func(N-1);
    }
}
