import java.util.Iterator;
import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(6);
        stk.push(8);
        stk.push(9);
        stk.peek();
        Iterator itr = stk.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
