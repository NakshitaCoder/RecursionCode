package Backtracking;
// backtracking 4 -> A person can move DOWN or RIGHT or DIAGONAL to reach the desired position,
// Add path to arrayList, return it

import java.util.ArrayList;

public class backtracking4 {
    public static void main(String[] args){
        int row = 3;
        int col = 3;
        String processed = "";
        ArrayList<String> list = getPathsList(processed, row, col);

        System.out.println("List: "+ list);
    }

    static ArrayList<String> getPathsList(String path, int row, int col){
        if(row==1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String > list = new ArrayList<>();


        // 1. Down
        if(row > 1){
            list.addAll(getPathsList(path+"Down ", row-1, col));
        }
        // 2. Right
        if(col > 1){
            list.addAll(getPathsList(path+ "Right ", row, col-1));
        }
        // 3. Diagonal
        if(row >1 && col>1){
            list.addAll(getPathsList(path + "Diagonal ", row-1, col-1));
        }
        return list;
    }

}
