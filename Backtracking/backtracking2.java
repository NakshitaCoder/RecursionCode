package Backtracking;
// backtracking 2 -> A person can move DOWN or RIGHT to reach the desired position,
// Print path

public class backtracking2 {
    public static void main(String[] args){
        int row = 3;
        int col = 3;
        getPath("", row, col);
    }

    static void getPath(String path, int row, int col){
        if(row == 1 && col == 1){
            System.out.print(path);
            System.out.println();
            return;
        }
        if(row > 1){
            getPath(path + "D", row-1, col);
        }

        if(col > 1){
            getPath(path + "R", row, col-1);
        }
    }
}
