package collectiondemos;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queuedemo {
    public static void main(String[]args)
    {
        PriorityQueue q = new PriorityQueue();
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("C");
        //q.add(100);//not allowed in queue(hetrogenios data)
        System.out.println(q);
       System.out.println(q.element());//A
        System.out.println(q.peek());
        q.remove(q.remove());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        Iterator itr=q.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());

        }
        for(Object ele:q)
        {
            System.out.println(ele);
        }


    }
}
