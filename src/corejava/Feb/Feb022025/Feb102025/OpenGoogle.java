package corejava.Feb.Feb022025.Feb102025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogle {

    @Test
    public void testOpenGoogle(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Google Opened");
        System.out.println("Opened Google on thread: " + Thread.currentThread().getId());
        driver.quit();
    }
}
