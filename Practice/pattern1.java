package Practice;

public class pattern1 {
    public static void main(String[] args){
        // pattern 1
        drawPattern1(5, 0);     //  1️⃣Print an Inverted Right-Angled Triangle
        drawPattern2(5, 0);     //  2️⃣Print a Right-Angled Triangle Pattern
    }

    static void drawPattern2(int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            drawPattern2(row, col+1);
            System.out.print("*");
        }
        else{
            drawPattern2(row-1, 0);
            System.out.println();
        }
    }

    static void drawPattern1(int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            System.out.print("*");
            drawPattern1(row, col+1);
        }else{
            System.out.println();
            drawPattern1(row-1, 0);
        }
    }

}
