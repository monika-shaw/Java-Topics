package intro.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);

        Iterator<Integer> itr= hs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
