package day50Guru999;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Guru99Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.demo.guru99.com/V4/");
     driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 //Login//
	 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr595606");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bYhareh");
	 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	 
	// New Customer//
	  driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
	  driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ajay Sapavath");
	  driver.findElement(By.xpath("//input[@value='m']")).click();
      driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("14/04/2000");
	  driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Bengaluru mahadev pura");
	  driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bengaluru");
	  driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Karnataka");
	  driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("333777");
	  driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9133882630");
	  driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("ajaysk593@gmail.com");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ajaysk9133@");
	  driver.findElement(By.xpath("//input[@name='sub']")).click();

	  //Edit Customer//
	  driver.findElement(By.xpath("//a[normalize-space()='Edit Customer']")).click();
	  
	  
	  
	  
	  

	  
	  
	  
	  
	}

}
