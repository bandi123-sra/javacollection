package collectiondemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[]args)
    {
        HashSet hs= new HashSet();
        hs.add(100);
        hs.add("welcome");
        hs.add(16.4);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);
        hs.remove(16.4);
        System.out.println("After removing  element:"+hs);
        System.out.println( hs.contains("welcome"));
        System.out.println( hs.contains("xyz"));
        System.out.println(hs.isEmpty());
        Iterator it=hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }





    }
}
