package day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Select single option from/
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
	    driver.findElement(By.xpath("//input[@value='jQuery']")).click();
	  	driver.findElement(By.xpath("//input[@value='Bootstrap']")).click();
		driver.findElement(By.xpath("//input[@value='Angular']")).click();
		driver.findElement(By.xpath("//input[@value='csharp']")).click();
		driver.findElement(By.xpath("//input[@value='Python']")).click();
		driver.findElement(By.xpath("//input[@value='MySQL']")).click();
		driver.findElement(By.xpath("//input[@value='Oracle']")).click();
		driver.findElement(By.xpath("//input[@value='MSSQL']")).click();
		driver.findElement(By.xpath("//input[@value='Java']")).click();
        Thread.sleep(5000);

		//capture all the options and find out size//
		List<WebElement> options=(List<WebElement>) driver.findElement(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("number of option:"+options.size());

		//Printing options from dropdown//
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	
	}

}
