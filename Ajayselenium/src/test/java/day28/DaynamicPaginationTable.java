package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DaynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.opencart.com/admin/");
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	driver.manage().window().maximize();
     	Thread.sleep(5000);
     	
     	
     	driver.findElement(By.xpath("//input[@id='input-username']"));
     	driver.findElement(By.xpath("//input[@id='input-password']"));
     	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();


     	
	}

}
