public class ArithmaticException extends Throwable {
    public static void main(String[] args) {
        try{
            int num1= 30;
            int num2= 0;
            System.out.println(num1/num2);
        }
        catch (java.lang.Exception E)
        {
            System.out.println("Can't Divide a number by zero");
        }

        try {
            int num = Integer.parseInt("Anjali");

        }
        catch(java.lang.Exception e)
        {
            System.out.println("Number Format Exception");
        }
        try{
            int arr[] = new int[5];
            System.out.println(arr[9]);
        }
        catch(java.lang.Exception k)
        {
            System.out.println("Can't access the element");
        }
    }
}
