public class FinallyBlock {
    public static void main(String[] args) {
        int numarr [] = new int[5];

        try{
            numarr[7]=50;
            System.out.println(numarr[7]);
        }
        catch(ArrayIndexOutOfBoundsException E){
            System.out.println(E);
            System.out.println("lastElement"+numarr[3]);
        }

        finally {
            System.out.println("I am in finally");
        }
    }
}

