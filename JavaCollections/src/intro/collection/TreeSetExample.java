package intro.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();

        ts.add("Hello");
        ts.add("Hi");

        Iterator<String> itr=ts.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
