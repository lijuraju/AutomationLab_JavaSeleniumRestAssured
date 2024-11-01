package corejava.nov.nov012024;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm  = new HashMap();

        hm.put(1, "Liju");

        Map hm3 = new HashMap();


//
//        HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
//
//        hm1.put(1, "Liju");
//        hm1.put(2, "Raju");
//        hm1.put(1, "Liju1");
//
//        System.out.println(hm1);
//
//        System.out.println(hm1.entrySet());

        for( Object o:hm.entrySet()){

            System.out.println(o);

        }



    }
}
