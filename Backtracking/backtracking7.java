package Backtracking;
// important : Printing paths with steps

/*
Output:-
[1, 2, 3]
[0, 0, 4]
[0, 0, 5]
RRDD
 */

import java.util.Arrays;

public class backtracking7 {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        int[][] path = new int[maze.length][maze[0].length];

        getPath("", maze, 0, 0, path, 1);
    }

    static void getPath(String pro, boolean[][] maze, int row, int col, int[][] path, int step){
        if(row == maze.length-1 && col== maze[0].length-1){
            // last step
            path[row][col] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(pro);
            System.out.println();
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        path[row][col] = step;

        // down
        if(row < maze.length -1 ){
            getPath(pro+"D", maze, row+1, col, path, step+1);
        }
        // right
        if(col < maze[0].length -1 ){
            getPath(pro+"R", maze, row, col+1, path, step+1);
        }
        // up
        if(row > 0){
            getPath(pro+"U", maze, row-1, col , path, step+1);
        }
        //left
        if(col > 0){
            getPath(pro+"U", maze, row, col-1, path, step+1);
        }

        // when we are returning from recursive call, we need to remove the updated value of false
        maze[row][col] = true;
        path[row][col] = 0;
    }

}
