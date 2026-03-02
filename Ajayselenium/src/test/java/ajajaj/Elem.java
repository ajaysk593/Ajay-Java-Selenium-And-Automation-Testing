package ajajaj;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Elem {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod 
    @Parameters({"broswer"})
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @DataProvider(name = "TextBoxData")
    public Object[][] getTextData() {
        return new Object[][]{
                {"Ajay Kumar", "ajay@gmail.com", "Hyderabad", "Warangal"},
                {"Archu Aj", "archu@gmail.com", "Bangalore", "Mysore"}
        };
    }

    @Test(priority = 1, dataProvider = "TextBoxData")
    public void testTextBox(String name, String email, String current, String permanent) {
        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.id("userName")).sendKeys(name);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        driver.findElement(By.id("currentAddress")).sendKeys(current);
        driver.findElement(By.id("permanentAddress")).sendKeys(permanent);

        // Scroll to button and click via JS to avoid Ad-overlays
        WebElement submit = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);

        WebElement outputName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        AssertJUnit.assertTrue(outputName.getText().contains(name));
        System.out.println("TextBox Data Submitted: " + name);
    }

    @Test(priority = 2)
    public void testCheckBox() {
        driver.get("https://demoqa.com/checkbox");
        // Expand the tree
        driver.findElement(By.cssSelector("button[title='Toggle']")).click();
        // Click the Desktop checkbox label
        driver.findElement(By.xpath("//span[text()='Desktop']")).click();
        
        WebElement result = driver.findElement(By.id("result"));
        AssertJUnit.assertTrue(result.getText().contains("desktop"));
        System.out.println("Checkbox Selected Successfully");
    }

    @DataProvider(name = "RadioData")
    public Object[][] getRadioData() {
        return new Object[][]{ {"yesRadio"}, {"impressiveRadio"} };
    }

    @Test(priority = 3, dataProvider = "RadioData")
    public void testRadioButton(String radioId) {
        driver.get("https://demoqa.com/radio-button");
        // DemoQA radio inputs are hidden; we click using Javascript
        WebElement radio = driver.findElement(By.id(radioId));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radio);
        
        AssertJUnit.assertTrue(driver.findElement(By.className("text-success")).isDisplayed());
        System.out.println("Radio Button Selected: " + radioId);
    }

    @Test(priority = 4)
    public void testButtons() {
        driver.get("https://demoqa.com/buttons");
        Actions action = new Actions(driver);

        action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
        action.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();
        
        // Dynamic ID button - search by text
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();

        AssertJUnit.assertTrue(driver.findElement(By.id("doubleClickMessage")).getText().contains("double click"));
        System.out.println("All Button Actions Performed Successfully");
    }

    @Test(priority = 5)
    public void testLinks() {
        driver.get("https://demoqa.com/links");
        String originalWindow = driver.getWindowHandle();

        driver.findElement(By.id("simpleLink")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
        driver.close();
        driver.switchTo().window(originalWindow);

        // API Link call
        driver.findElement(By.id("created")).click();
        WebElement response = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
        AssertJUnit.assertTrue(response.getText().contains("201"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Use quit() instead of close() to clear the session
        }
    }
}