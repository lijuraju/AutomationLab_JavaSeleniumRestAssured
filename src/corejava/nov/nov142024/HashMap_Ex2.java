package corejava.nov.nov142024;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;

public class HashMap_Ex2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/tables");
       List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
        HashMap<String,String> lastnameEmail = new HashMap<>();
       for(WebElement element:rows){
           String lastname =element.findElement(By.xpath("td[1]")).getText();
          String email   = element.findElement(By.xpath("td[3]")).getText();

          lastnameEmail.put(lastname,email);

       }
        System.out.println(lastnameEmail);

        driver.quit();


    }

}
