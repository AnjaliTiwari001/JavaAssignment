import java.util.Scanner;

public class Si {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ROI[] = new int[n];
        {


            ROI[0] = scn.nextInt();
            ROI[1] = scn.nextInt();
            ROI[2] = scn.nextInt();

            System.out.println((ROI[0] * ROI[1] * ROI[2]) / 100);
        }
    }

}
