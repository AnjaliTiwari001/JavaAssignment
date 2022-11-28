public class demouserdefined {
    public static void main(String[] args) {
        try {
            throw new userDefined("Anjali",21);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch(Exception error){
            System.out.println(error);
        }
        finally {
            System.out.println("I am in finally block");
        }

    }
}
