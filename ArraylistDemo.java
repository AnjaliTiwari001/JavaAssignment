
import java.util.ArrayList;
import java.util.Iterator;
public class ArraylistDemo {
    public static void main(String[] args) {
        //creating object of arraylist class
        ArrayList list = new ArrayList();
        list.add("Anjali");
        list.add(7);
        list.add("$");
        Iterator itr =  list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }




    }


}
