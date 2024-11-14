package corejava.nov.nov142024;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex1 {
    public static void main(String[] args) {


        Map<String,Integer> m1 = new HashMap<>();
        m1.put("Liju",32);
        m1.put("Reshma",30);
        m1.put("Apoorva",33);
        m1.put(null,34);
        System.out.println(m1);
        System.out.println(m1.get("Liju"));

        System.out.println("--------");
        for(Map.Entry<String,Integer> entry :m1.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }


            System.out.println("--------");

            for(String key:m1.keySet()){
                System.out.println("Key are : "+key);
                System.out.println("Value are:"+m1.get(key));

            }

        }
}
