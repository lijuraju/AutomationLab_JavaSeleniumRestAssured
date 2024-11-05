package corejava.nov.nov042024;

import java.util.HashSet;
import java.util.Set;

public class Hashset_Demo {

    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add("Liju");
        hs.add("Liju");
        hs.add(null);

        System.out.println(hs);
        System.out.println("-----------------");

        for(Object o: hs)
            System.out.println(o);

        Set hs1 = new HashSet();

        HashSet<Object>  hs3 = new HashSet<>();

        hs3.add("Liju");


    }
}
