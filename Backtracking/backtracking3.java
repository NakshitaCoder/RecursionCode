package Backtracking;
import java.util.ArrayList;
// backtracking 3 -> A person can move DOWN or RIGHT to reach the desired position,
// Add path to arrayList, return it

public class backtracking3 {
    public static void main(String[] args){
        int row = 3;
        int col = 3;
        String processed = "";
        ArrayList<String> list = getPathsList(processed, row, col);

        System.out.println("List: "+ list);
    }
    static ArrayList<String> getPathsList(String processed, int row, int col){
        if(row == 1 && col ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
            list.addAll(getPathsList(processed+"D", row-1, col));
        }
        if(col > 1){
            list.addAll(getPathsList(processed + "R", row, col-1));
        }
        return list;
    }
}
