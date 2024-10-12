package corejava.oct.oct032024;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReport2 {

        private WebDriver driver;
        private ExtentReports extent;
        private ExtentTest test;

        public static void main(String[] args) {
           ExtentReport2 report = new ExtentReport2();
            report.setUp1();
            report.launchGoogle1();
            report.tearDown1();
        }

        public void setUp1() {
            // Set up WebDriver
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            // Set up Extent Reports
            String reportName = "ExtentReport_Reshmahtml";
            extent = new ExtentReports();
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportName);
            extent.attachReporter(sparkReporter);
        }

        public void launchGoogle1() {
            test = extent.createTest("Test Google");

            // Navigate to Google
            driver.get("https://www.google.com/");

            // Log test result
            test.pass("Tests passed");
        }

        public void tearDown1() {
            // Close the driver
            driver.quit();

            // Flush Extent Reports
            extent.flush();
        }
}
