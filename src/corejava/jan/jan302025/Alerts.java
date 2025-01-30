package corejava.jan.jan302025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alerts {

    WebDriver driver= new ChromeDriver();

    @Test
    public void testSimpleAlert(){

        //You cannot inspect the OK or cancel button in the alert box.That's why we need alert
//        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        WebElement button = driver.findElement(By.xpath("//button[@id='alertBox']"));
        button.click();

       Alert simpleAlert = driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        simpleAlert.accept();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Assert.assertEquals(driver.getTitle(),"H Y R Tutorials");





    }
}
