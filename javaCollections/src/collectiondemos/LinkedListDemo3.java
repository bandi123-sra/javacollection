package collectiondemos;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[]args)
    {
        LinkedList l= new LinkedList();

        l.add("dog");
        l.add("dog");
        l.add("cat");
        l.add("horse");
        System.out.println(l);
        l.addFirst("tiger");
        l.addFirst("elephant");
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getFirst());
        l.removeFirst();
        l.removeLast();
        System.out.println("After removing first&last elements:"+l);



    }
}
