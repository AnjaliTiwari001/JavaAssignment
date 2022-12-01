import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList cs1 = new ArrayList();

        arr.add(5);
        arr.add(4);
        arr.add(9);
        Collections.sort(arr,Collections.reverseOrder());
        Iterator itr =  arr.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
