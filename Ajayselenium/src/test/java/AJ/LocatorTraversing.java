package AJ;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTraversing {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/login");

      
       driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
       driver.findElement(By.cssSelector("input#Password")).sendKeys("Test@123");

       
        WebElement passwordLabel = driver.findElement(By.xpath("//input[@id='Password']/preceding-sibling::label"));
        System.out.println("Label before Password field: " + passwordLabel.getText());

      
    }
}
