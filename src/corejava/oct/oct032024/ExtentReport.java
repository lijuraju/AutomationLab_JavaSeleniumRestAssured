package corejava.oct.oct032024;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
    private WebDriver driver;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeTest
    public void setUp() {
        // Set up WebDriver
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

        // Set up Extent Reports
        String reportName = "ExtentReport-Liju.html";
        extent = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportName);
        extent.attachReporter(sparkReporter);
    }

    @Test
    public void launchGoogle() {
        test = extent.createTest("Launch Google");

        // Navigate to Google
        driver.get("https://www.google.com/");

        // Log test result
        test.pass("Google launched successfully");
    }

    @AfterTest
    public void tearDown() {
        // Close the driver
        driver.quit();

        // Flush Extent Reports
        extent.flush();
    }
}
