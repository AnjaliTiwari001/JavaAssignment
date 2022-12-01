import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vec = new Vector();
        Vector vec1 = new Vector();
        vec.add(9);
        vec.add("vector");
        vec1.addAll(vec);

        System.out.println(vec1);


    }
}
