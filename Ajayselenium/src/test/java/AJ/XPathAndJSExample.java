package AJ;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAndJSExample {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
 
        driver.findElement(By.xpath("//h3[normalize-space()='Information']")).click();
       
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

       
    }
}
