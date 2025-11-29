package Hari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Loginpage {

    public static void main(String[] args) throws InterruptedException {
    	
    
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
     
        driver.findElement(By.id("password")).sendKeys("Password123");
       
        driver.findElement(By.id("submit")).click();
       

    }
}
       

       