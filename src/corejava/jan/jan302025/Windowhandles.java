package corejava.jan.jan302025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Windowhandles {


    @Test
    public void testWindowHandles() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        Thread.sleep(2000);
        String parentWindowhandle = driver.getWindowHandle();
        System.out.println("Parent window handle is: "+parentWindowhandle);

        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
        Set<String> windowhandles = driver.getWindowHandles();
        for (String childHandles :windowhandles){
            System.out.println("Child window handles are: "+childHandles);
            if(!childHandles.equals(parentWindowhandle)){
                driver.switchTo().window(childHandles);
                driver.findElement(By.id("firstName")).sendKeys("John");
            }
        }
        Thread.sleep(2000);
        driver.quit();



    }
}
