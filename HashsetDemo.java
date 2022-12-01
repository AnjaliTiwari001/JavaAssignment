

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String >();
        set.add("str1");
        set.add("Str2");
        set.add("Str3");
        set.add(" ");
        set.add(null);
        set.add(null);


        Iterator<String> itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
