import java.util.Scanner;

public class multidimensionalArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int column = scn.nextInt();
        String arr [][] = new String[row][column];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                arr[i][j]= scn.next();
            }

        }
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(arr[i][j]+"  ");     //USE PRINT NOT PRINTLN
            }
            System.out.println();
        }
    }
}
