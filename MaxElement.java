import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int size = scn.nextInt();
        int [] arr = new int[size];
        int element = scn.nextInt();
        int max= arr[0];

        for(int i=1;i<size;i++)
        {
            arr[i]= scn.nextInt();
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum element is of array is "+max);
    }
}
