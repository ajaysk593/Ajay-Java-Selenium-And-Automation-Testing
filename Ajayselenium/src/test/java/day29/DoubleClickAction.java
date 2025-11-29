package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new ChromeDriver();
	     driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.switchTo().frame("//iframe[@id='iframeResult']");  
	     WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
	     WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
	     WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
         box1.clear();
         box1.sendKeys("Welcome");
         Thread.sleep(5000);
         
         //DoubleClick Action on the button//
         Actions act=new Actions(driver);
         act.doubleClick(button).perform();
		
         //Validation:b ox2 should contains("Ajay")//
		String text=box2.getDomAttribute("Value");
		System.out.println("Captured value is:"+text);
		if(text.equals("Welcome"))
		{
			System.out.println("Text copied");
		}
		else
		{
			System.out.println("Text not copied properly");
		}
				
	}

}
