package DataDrivenExcel;

import org.testng.annotations.*;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Register {

    WebDriver driver;

  
    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");
    }

    @DataProvider(name = "DataSubmitted")
    public Object[][] getData() {

        return new Object[][]{

                {"Ajay Kumar", "ajay@gmail.com",
                        "Hyderabad, Telangana",
                        "Warangal, Telangana"},

                {"Archu Aj", "archuaj@gmail.com",
                        "Bangalore, Karnataka",
                        "Mysore, Karnataka"},

                {"Murali Sharma", "murali@gmail.com",
                        "Chennai, Tamil Nadu",
                        "Coimbatore, Tamil Nadu"}
        };
    }

   
    @Test(priority = 1)
    public void verifyPageTitle() throws InterruptedException {

        String title = driver.getTitle();
        Assert.assertFalse(title.contains("DEMOQA"));
        System.out.println("Title Verified Successfully");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test(priority = 2, dataProvider = "DataSubmitted")
    public void fillTextBoxForm(String name,  String email, String currentAddress,String permanentAddress) throws InterruptedException {
                              
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));          
                               
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("userName")).clear();
        driver.findElement(By.id("userName")).sendKeys(name);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.id("userEmail")).clear();
        driver.findElement(By.id("userEmail")).sendKeys(email);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.id("currentAddress")).clear();
        driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("permanentAddress")).clear();
        driver.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("submit")).click();

        WebElement outputName = driver.findElement(By.id("name"));
        Assert.assertTrue(outputName.getText().contains(name));

        System.out.println("Data Submitted Successfully for: " + name);

        driver.navigate().refresh();
    }

    @Test(priority = 3)
    public void dummyLogoutTest() throws InterruptedException {
        System.out.println("Logout Test Executed");
        Thread.sleep(2000);

    }

   
    @AfterClass
    public void tearDown() {
        
    }
}