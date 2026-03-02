package DataDrivenExcel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Button4 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
    }

    @Test(priority = 1)
    public void doubleClick() {
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickBtn).perform();

        String message = driver.findElement(By.id("doubleClickMessage")).getText();
        System.out.println("Double Click Message: " + message);
    }

    @Test(priority = 2)
    public void rightClick() {
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickBtn).perform();

        String message = driver.findElement(By.id("rightClickMessage")).getText();
        System.out.println("Right Click Message: " + message);
    }

    @Test(priority = 3)
    public void ClickMe() {
        WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeBtn.click();

        String message = driver.findElement(By.id("dynamicClickMessage")).getText();
        System.out.println("Dynamic Click Message: " + message);
    }

    @AfterClass
    public void teardown() {
       
    }
}