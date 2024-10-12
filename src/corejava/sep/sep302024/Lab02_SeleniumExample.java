package corejava.sep.sep302024;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Lab02_SeleniumExample {

        public static void main(String[] args) throws IOException {

//            String osName = System.getProperty("os.name");
//            String osVersion = System.getProperty("os.version");
//            String osArch = System.getProperty("os.arch");
//
//            System.out.println("Operating System: " + osName);
//            System.out.println("Version: " + osVersion);
//            System.out.println("Architecture: " + osArch);


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            // Set the path to your ChromeDriver
//            // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            // Initialize the ChromeDriver
//            WebDriver driver = new ChromeDriver();


               driver.get("https://www.google.com");

//                // Take a screenshot

             File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

//                // Save the screenshot to a file
            FileUtils.copyFile(screenshot, new File("src/corejava/sep302024/Test.jpg"));

//                System.out.println("Screenshot taken and saved as google_screenshot.png");
//
//

//                // Close the browser
              driver.quit();
            }
        }


