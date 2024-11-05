package corejava.nov.nov042024;

import java.util.HashMap;
import java.util.Map;

public class Map_Demo {
    public static void main(String[] args) {

        //Map is an interface
        //Map uses key value pair
        //Map does not allow duplicate keys


        Map m1 = new HashMap();

        m1.put(1,"Liju");
        m1.put(2,"Reshma");
        m1.put(3,"Abram");

        System.out.println(m1);

        Map<String,Integer> m2 = new HashMap<>();
        m2.put("id1" , 1);
        m2.put("id2",2);
        m2.put(null,3);

        System.out.println(m2);
        System.out.println(m2.keySet()  );
        System.out.println(m2.values()  );





    }
}
