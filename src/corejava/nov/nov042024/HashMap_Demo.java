package corejava.nov.nov042024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMap_Demo {
    public static void main(String[] args) {

        HashMap<String,String> students = new HashMap();

        students.put("id1","Liju");
        students.put("id2","Reshma");
        System.out.println(students);



        HashMap<String,String> students2 = new HashMap();

        students2.put("id1","Abram");
        students2.put("id2","Sarah");
        System.out.println(students2);

        List student = new ArrayList();

        student.add(students);
        student.add(students2);

        System.out.println(student);





    }
}
