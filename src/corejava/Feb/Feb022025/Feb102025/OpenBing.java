package corejava.Feb.Feb022025.Feb102025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBing {

    @Test
    public void testOpenBing(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com");
        System.out.println("Bing Opened");
        System.out.println("Opened Bing on thread: " + Thread.currentThread().getId());
        driver.quit();
    }
}
