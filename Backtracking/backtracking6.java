package Backtracking;
// backtracking 6 -> maze with backtracking, all directions

public class backtracking6 {
    public static void main(String[] args){
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        getPath("", maze, 0, 0);
    }
    static void getPath(String pathStr, boolean[][] maze, int row, int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println("Path:" +pathStr);
            return;
        }

        if(!maze[row][col]){
            return;     // false, cant traverse there, to avoid returning to same cell
        }

        // add False to those which traversed already
        maze[row][col] = false;

        // down
        if(row < maze.length -1 ){
            getPath(pathStr+"D", maze, row+1, col);
        }
        // right
        if(col < maze[0].length -1 ){
            getPath(pathStr+"R", maze, row, col+1);
        }
        // up
        if(row > 0){
            getPath(pathStr+"U", maze, row-1, col);
        }
        //left
        if(col > 0){
            getPath(pathStr+"U", maze, row, col-1);
        }

        // when we are returning from recursive call, we need to remove the updated value of false
        maze[row][col] = true;
    }
}
