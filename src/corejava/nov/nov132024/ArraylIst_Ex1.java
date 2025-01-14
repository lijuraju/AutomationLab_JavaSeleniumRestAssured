package corejava.nov.nov132024;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ArraylIst_Ex1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> rows =driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        List<String> listOfLastName = new ArrayList<>();
        for(WebElement row:rows){
            listOfLastName.add(row.findElement(By.xpath("td")).getText());
        }
        System.out.println(listOfLastName);

        driver.quit();


    }
}
