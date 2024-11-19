package corejava.nov.nov192024;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.LinkedHashMap;
import java.util.List;

public class LinkedHashMap_Ex1 {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
        LinkedHashMap<String,String> lastnameEmail = new LinkedHashMap<>();


        for(WebElement element:elements){
             String lastname = element.findElement(By.xpath("td[1]")).getText();
                String email = element.findElement(By.xpath("td[3]")).getText();
                lastnameEmail.put(lastname,email);

        }

        System.out.println(lastnameEmail);
        driver.quit();


    }
}
