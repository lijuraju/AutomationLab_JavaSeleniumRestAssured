package corejava.nov.nov192024;

import java.util.Map;
import java.util.TreeMap;

public class Treemap_Ex1 {
    public static void main(String[] args) {
        Map<String,Integer> tm = new TreeMap<>();
        tm.put("Liju",32);
        tm.put("Reshma",30);
        tm.put("Apoorva",33);


        System.out.println(tm);
    }
}
