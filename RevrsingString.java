import java.util.Scanner;

public class RevrsingString {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String str= scn.next();
        String result= "";
        for (int i =str.length()-1 ; i>=0;i--)
        {
            result+= str.charAt(i);
        }
        System.out.println(result);
    }
}
