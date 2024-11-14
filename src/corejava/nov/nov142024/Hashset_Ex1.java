package corejava.nov.nov142024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset_Ex1 {
    public static void main(String[] args) {
        Set<String> hs1 = new HashSet<String>();
        hs1.add("Abram");
        hs1.add("Sarah");
        hs1.add("Liju");
        hs1.add("Liju");
        //System.out.println(hs1);

        //for enahanced for loop
        for(String s: hs1){
            System.out.println(s);
        }

        //iterator
        System.out.println("-----------------");
        Iterator<String> it = hs1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
