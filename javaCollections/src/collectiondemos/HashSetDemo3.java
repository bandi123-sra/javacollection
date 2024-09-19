package collectiondemos;

import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[]args)
    {
        HashSet<Integer> set1 =new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("HashSet1:"+set1);
        HashSet<Integer> set2 =new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("HashSet2:"+set2);
        set1.addAll(set2);
        System.out.println("union:"+set1);
        set1.retainAll(set2);
        System.out.println("Intersections:"+set1);
        //difference
        set1.removeAll(set2);
        System.out.println("difference:"+set2);
        set1.containsAll(set2);
        System.out.println("subset element:"+set2);
        System.out.println(set2.containsAll(set1));

    }
}
