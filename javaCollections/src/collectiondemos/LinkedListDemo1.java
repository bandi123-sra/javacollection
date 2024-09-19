package collectiondemos;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[]args)
    {
        LinkedList l=new LinkedList();
        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);
        System.out.println(l);
        System.out.println(l.size());
        l.remove(3);
       // l.remove('A');
        System.out.println("After removing,new list:"+l);
        l.add(3,"java");
        System.out.println("After inserting element:"+l);
        System.out.println(l.get(3));
        l.set(5,"X");
        System.out.println("After changing the value:"+l);
        System.out.println(l.contains("java"));
        System.out.println(l.contains("python"));
        System.out.println(l.isEmpty());
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }

    }
}
