package intro.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(6);
        s.push(7);
        s.push(9);

        Iterator<Integer> itr=s.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
        System.out.println();

        s.pop();
        itr=s.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }




    }
}
