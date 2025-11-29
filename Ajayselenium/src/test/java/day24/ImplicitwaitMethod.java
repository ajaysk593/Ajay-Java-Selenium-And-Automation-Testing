package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitMethod {

	public static void main(String[] args) {

		 ChromeDriver driver = new ChromeDriver();
		 
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("AJAY SAPAVATH");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ajaysk593@gmail.com");
		 driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9133882630");
		 driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("AJAY");
		 driver.findElement(By.xpath("//input[@id='male']")).click();
		 driver.findElement(By.xpath("//input[@id='sunday']")).click();
		 driver.findElement(By.xpath("//input[@id='monday']")).click();
		 driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		 driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		 driver.findElement(By.xpath("//input[@id='thursday']")).click();
		 driver.findElement(By.xpath("//input[@id='friday']")).click();
		 driver.findElement(By.xpath("//input[@id='saturday']")).click();
         driver.findElement(By.xpath("//select[@id='country']")).sendKeys("india");
         driver.findElement(By.xpath("//option[@value='red']")).click();
         driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("14/04/2000");
		// driver.close();		
		
	}

}
