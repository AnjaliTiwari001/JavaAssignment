import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int length_of_array = scn.nextInt();
        int array[] = new int[length_of_array];
        {


            array[0] = scn.nextInt();
            array[1] = scn.nextInt();
            array[2] = scn.nextInt();

            System.out.println((array[0] * array[1] * array[2]) / 100);
        }
    }

}
