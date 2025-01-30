package corejava.jan.jan302025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class promptAlert {

    WebDriver driver = new ChromeDriver();

    @Test
    public void testPromptAlert() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='promptBox']")).click();


        Alert confirmAlert = driver.switchTo().alert();
        System.out.println(confirmAlert.getText());
        confirmAlert.sendKeys("Liju");
        confirmAlert.accept();
        Thread.sleep(5000);
        driver.quit();

    }
}
