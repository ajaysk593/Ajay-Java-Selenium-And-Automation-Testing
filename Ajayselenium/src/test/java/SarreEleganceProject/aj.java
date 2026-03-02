package SarreEleganceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class aj {

    WebDriver driver;
   
    @Parameters("browserName")
    @BeforeTest
    public void initializeBrowser(String browsername) {

        switch (browsername.toLowerCase()) {

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            default:
                System.err.println("Enter valid browser name");
                break;
        }

        driver.manage().window().maximize();
       
    }

    @Parameters("url")
    @Test(priority = 1)
    public void initializeURL(String url) {
        driver.get(url);
    }

    @Test(priority = 2)
    public void clickon_CheckBoxes() {

        
    }

    @Test(priority = 3)
    public void buttons() {

        

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

       
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}