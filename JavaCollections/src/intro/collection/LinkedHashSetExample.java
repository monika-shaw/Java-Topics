package intro.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();

        lhs.add(11);
        lhs.add(22);

        Iterator<Integer> itr=lhs.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
