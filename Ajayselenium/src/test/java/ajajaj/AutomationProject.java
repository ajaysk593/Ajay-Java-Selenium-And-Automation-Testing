package ajajaj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class AutomationProject {
	
public static void main(String [] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Registration Form//
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sapavath Ajay");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ajaysk593@gmail.com");
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9133882630");
	driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Hyderabad Madhapur");
	driver.findElement(By.xpath("//input[@id='male']")).click();
	driver.findElement(By.xpath("//input[@id='sunday']")).click();
	driver.findElement(By.xpath("//option[@value='canada']")).click();
	driver.findElement(By.xpath("//option[@value='blue']")).click();
	driver.findElement(By.xpath("//option[@value='dog']")).click();
	driver.findElement(By.xpath("//input[@id='datepicker']"));
	driver.findElement(By.xpath("//input[@id='txtDate']")).sendKeys("15-04-2000");



	}
}


