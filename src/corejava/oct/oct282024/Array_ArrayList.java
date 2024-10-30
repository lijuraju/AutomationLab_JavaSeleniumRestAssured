package corejava.oct.oct282024;

import java.util.ArrayList;
import java.util.List;

public class Array_ArrayList {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("Liju");
        list.add("Liju");//duplicate
        list.add(true);//different dat tyeps
        list.add(1);

        //Upraded version of arrqy
        //ArrayList is a class in java.util package
        //Aarrylist behind scene it is dynamic array
        //Arryalist it is growable array

        List<Integer> l = new ArrayList();
        l.add(1);

        List<String> l1 = new ArrayList(0);
        l1.add("Liju");



    }
}
