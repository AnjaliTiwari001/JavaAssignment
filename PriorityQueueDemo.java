import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue myqueue = new PriorityQueue();
        myqueue.add("Array");
        myqueue.add(3);
        myqueue.add(9.9f);

        Iterator itr = myqueue.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
