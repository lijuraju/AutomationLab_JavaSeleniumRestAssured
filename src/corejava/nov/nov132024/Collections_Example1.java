package corejava.nov.nov132024;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections_Example1 {

    public static void main(String[] args) {

        List<String> exArraylist = new ArrayList<String>();

        exArraylist.add("Liju");
        exArraylist.add("Amith");
        System.out.println(exArraylist);


        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        System.out.println(listInt);

        List<String> listOfEmployees = new ArrayList<>(List.of("Liju", "Amith", "Raju"));
        System.out.println(listOfEmployees);

        //iteration:using iterator

        Iterator<String> it = exArraylist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //iteration:using for each loop
        System.out.println("-----------");
        for(String s:exArraylist){
            System.out.println(s);
        }





    }
}
