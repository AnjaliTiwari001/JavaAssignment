import javax.lang.model.element.Element;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> myqueue = new LinkedList<String>();
        myqueue.add("Element1");
        myqueue.add("Element2");
        myqueue.add("Element3");

        Iterator itr = myqueue.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}

