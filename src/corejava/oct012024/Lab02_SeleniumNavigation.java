package corejava.oct012024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Lab02_SeleniumNavigation {

    public static void main(String[] args) {

        //1. Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver",
                "C://chrome_driver//chromedriver-win64//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Open the URL
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        //navigate on specific software web application page or URL
        driver.navigate().to("http://selenium-venkat.blogspot.com/p/index_4.html");
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        //To navigate back (Same as clicking on browser back button)
        driver.navigate().back();
        System.out.println("Back to Google");
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        //To navigate forward (Same as clicking on browser forward button)
        driver.navigate().forward();
        System.out.println("Forward to Selenium");
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);

        driver.quit();
    }
}



