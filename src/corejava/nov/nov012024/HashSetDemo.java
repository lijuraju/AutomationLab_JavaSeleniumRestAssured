package corejava.nov.nov012024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {


        HashSet hs = new HashSet();

        Set hs1 = new HashSet();

        HashSet<String> hs2 = new HashSet<>();

        hs.add(100);
        hs.add("Liju");
        hs.add(true);
        hs.add(null);

        hs.add(100);
        hs.add(null);

        System.out.println(hs);


        //Removing the elemnet from HashSet

        hs.remove(100);
        System.out.println(hs);

        //Inserting  into a particular place the element is not possible
        //Access specific element is not possible

        //Converting hashset to arraylist

        ArrayList a1 = new ArrayList(hs);//[null, Liju, true]

        System.out.println(a1.get(1));

        //Reading the elements though for each loop

        for(Object o:hs){
            System.out.println(0);

        }

         Iterator it = hs.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }












    }
}
