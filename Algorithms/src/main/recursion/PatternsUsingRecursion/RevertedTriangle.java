package PatternsUsingRecursion;

public class RevertedTriangle {

    public static void main(String[] args) {
        revertedTriangle(4,0);
        normalTriangle(4,0);
    }

    private static void normalTriangle(int row, int col) {
        if(row<1)
            return;
        if(col<row){
            normalTriangle(row,col+1);
            System.out.print("* ");
        }
        else{
            normalTriangle(row-1,0);
            System.out.println();
        }
    }

    private static void revertedTriangle(int row, int col) {
        if(row<1)
            return;
        if(col<row){
            System.out.print("* ");
            revertedTriangle(row,col+1);
        }
        else{
            System.out.println();
            revertedTriangle(row-1,0);
        }
    }


}
