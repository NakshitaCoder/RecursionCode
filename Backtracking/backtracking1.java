package Backtracking;
// backtracking 1 -> A person can move DOWN or RIGHT to reach the desired position, count number of paths
// get Count value -> no of paths possible

public class backtracking1 {
    public static void main(String [] args){
        int row = 3;
        int col = 3;
        int ans = countFor(row, col);

        System.out.println("No of ways: " + ans);
    }

    static int countFor(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = countFor(row-1, col);       // down
        int right = countFor(row, col-1);       // right

        return (left + right);          // provide the optimal solution
    }
}
