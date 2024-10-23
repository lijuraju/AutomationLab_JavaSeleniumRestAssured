package corejava.oct.oct232024;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LoginPage {


    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.demo.guru99.com/V4/";
        driver.get(baseUrl);
        WebElement username = driver.findElement(By.xpath("//input[@name='uid']"));
        username.sendKeys("UserId");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Password");
        WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        login.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Thread.sleep(2000);
        driver.quit();




    }

}
