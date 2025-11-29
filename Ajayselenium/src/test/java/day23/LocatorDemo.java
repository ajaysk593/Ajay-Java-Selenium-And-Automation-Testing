package day23;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorDemo {

	public static <webElements> void main(String[] args) {

       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
       
       //Name
       driver.findElement(By.name("email")).sendKeys("9133882630");

       //id
       boolean status=driver.findElement(By.id("logo")).isDisplayed();
       System.out.println("logoDisplaystatus");
       
       //linkText and PartialLinkText
      driver.findElement(By.linkText("Log in")).click();
      
      
       //class Name
       List<WebElement>headerLinks=driver.findElements(By.className("List-inline-item"));
      System.out.println("Total number of header links:"+headerLinks.size());
       
       //tag Name
       List<WebElement>links=driver.findElements(By.tagName("a"));
       System.out.println("Total number of links:"+links.size());
       
       List<WebElement>images=driver.findElements(By.tagName("a"));
       System.out.println("Toatal number of links:"+links.size());
		
	}

}
