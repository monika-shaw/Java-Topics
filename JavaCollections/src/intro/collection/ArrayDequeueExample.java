package intro.collection;

import java.util.ArrayDeque;

public class ArrayDequeueExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();

        adq.add(10);
        adq.add(90);
        adq.add(80);
        System.out.println(adq);

        adq.clear();

        System.out.println(adq);
        adq.addFirst(66);
        adq.addLast(777);

        System.out.println(adq);
    }
}
