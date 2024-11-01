package corejava.nov.nov012024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {

       //Declaration1
        ArrayList myList  = new ArrayList();

        //Declration2
        List myList1 = new ArrayList();

        //Declaration3

        ArrayList<Integer> myList3 = new ArrayList<Integer>();

        //Declarayion4

        //ArrayList<Employee> myList4 = new ArrayList<Employee>();

        //Adding data into the list
        myList.add("Liju");
        myList.add(1);
        myList.add(1.5);
        myList.add(true);
        myList.add(1);
        myList.add(null);



        //Size of ArrayList

        System.out.println(myList.size());

        //Printing the arraylist

        System.out.println(myList);

        //Removing the elemnet from Arraylist
        //Here we have to specify the index

        myList.remove(4);

        System.out.println(myList);

        //Insert some value in the middle of the arraylist

        myList.add(1,"Raju");

        System.out.println(myList);


        //Modify or change the element in arraylist

        myList.set(0,"Abram R");

        System.out.println(myList);//[Abram R, Raju, 1, 1.5, true, null]



        //Retrive the element from the arraylist

        System.out.println(myList.get(1));

        //Reading all the elements from the arraylist
        //Approach1
        for(Object o : myList){
            System.out.println(o);
        }

        //Approach2

        System.out.println("-----------------");

        for(int i =0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }

        //Approach3
        //Iterator concept

        System.out.println("-----------------");

        Iterator it=myList.iterator();

        Iterator<String> it1 = myList.iterator();

        while (it.hasNext()){ //it.hasNext() will return true if there is next element in the list
            System.out.println(it.next());//it.next() will return the next element in the list
        }


// checking Arraylist is empty or not

        System.out.println(myList.isEmpty());

        //Remove elements

        myList.remove(0);//[Abram R, Raju, 1, 1.5, true, null]

        System.out.println(myList);

        //Remove all elements from the list
        //myList.clear();













    }
}
