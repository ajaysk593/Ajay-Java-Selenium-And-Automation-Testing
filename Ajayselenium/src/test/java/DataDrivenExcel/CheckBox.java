package DataDrivenExcel;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class CheckBox {

    WebDriver driver;
   

    @BeforeClass
    public void setup() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/checkbox");
        Thread.sleep(3000);
    }

    @DataProvider(name = "CheckBoxData")
    public Object[][] getCheckBoxData() {

        return new Object[][]{
                {"Desktop"},
                {"Documents"},
                {"Downloads"}
        };
    }

    @Test(priority = 1, dataProvider = "CheckBoxData")
    public void selectCheckBox(String checkBoxName) throws InterruptedException {
    	Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
        driver.findElement(By.xpath("//span[@aria-label='Select Home']")).click();

        System.out.println(checkBoxName + " selected successfully");

    }  
    @AfterClass
    public void tearDown() {
        
    }
}