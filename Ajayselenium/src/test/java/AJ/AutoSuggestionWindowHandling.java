package AJ;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class AutoSuggestionWindowHandling {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
   
        driver.findElement(By.name("q")).sendKeys("Selenium");
       
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//li[@role='presentation']//span)[1]")).click();

       
        String mainWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demowebshop.tricentis.com/");
        System.out.println("Opened new tab: " + driver.getTitle());
        driver.switchTo().window(mainWindow);
        System.out.println("Back to main window: " + driver.getTitle());

        
    }
}
