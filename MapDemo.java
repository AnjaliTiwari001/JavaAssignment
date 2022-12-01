import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap() ;
        map.put("Name","Anjali");
        map.put("Age",21);
        map.put("city","Delhi");

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext())
        {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }
}
