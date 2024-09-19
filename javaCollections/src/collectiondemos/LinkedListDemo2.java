package collectiondemos;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[]args)
    {
        LinkedList l= new LinkedList();
        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");
        LinkedList new_1= new LinkedList();
        new_1.addAll(l);
        System.out.println(new_1);
        new_1.removeAll(l);
        System.out.println(new_1);
        //sort() Collection sort(collection)
        System.out.println("Before sorting:"+l);
        Collections.sort(l);
        System.out.println("After sorting:"+l);
        //revarse order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("revarse order:"+l);
        //shuffling
        Collections.shuffle(l);
        System.out.println("After Shuffling:"+l);


    }
}
