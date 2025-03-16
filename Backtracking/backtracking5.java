package Backtracking;
// Backtarcking 5 -> maze with Obstacles

public class backtracking5 {
    public static void main(String [] args){
        boolean[][] maze ={
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        getPath("", maze, 0, 0);

//        System.out.println(maze.length);
//        System.out.println(maze[0].length);
//        System.out.println();
//        System.out.println(maze.length-1);
//        System.out.println(maze[0].length-1);
    }
    public static void getPath(String path, boolean[][] maze, int row, int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(path);
            return;
        }

        // check for obstacles
        if(!maze[row][col]){
            return;
        }

        if(row < maze.length - 1 ){
            getPath(path + "D", maze,row+1, col);
        }
        if(col < maze[0].length-1){
            getPath(path+ "R" , maze, row, col+1);
        }
    }
}
