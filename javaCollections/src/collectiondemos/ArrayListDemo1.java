package collectiondemos;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static  void main(String[]args){
        ArrayList al= new ArrayList();
        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);
        System.out.println(al);
        System.out.println("Number of elements in arraylist:"+al.size());
        al.remove(1);
        System.out.println("After removing element from array list:"+al);
        al.add(2,"java");
        System.out.println("After insertion:"+al);
        System.out.println(al.get(2));
        al.set(2,"C#");
        System.out.println("After replacing element:"+al);
        System.out.println(al.contains("C#"));
        System.out.println(al.contains("C"));
        System.out.println(al.isEmpty());
        System.out.println("Reading elements using for loop..............");
        /*for (int a=0;i<=al.size();i++)
        {
           // System.out.println(al.get(i));
        }
        */
        System.out.println("Reading elements using for..........each loop ");
        for(Object e:al)
        {
            System.out.println(e);
        }
        System.out.println("Reading elements using iterator method");
        Iterator it=al.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
