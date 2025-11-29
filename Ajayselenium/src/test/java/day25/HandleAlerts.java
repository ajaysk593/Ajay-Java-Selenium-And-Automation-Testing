package day25;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1.Normal Alert with(ok-buttion)//
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		//MultipleAlerts//
		Alert myalert=driver.switchTo().alert();
		System.out.print(myalert.getText());
		myalert.accept();
		
		//Confirmation Alert(ok and cancel button)//
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	    driver.switchTo().alert().dismiss();
		
		//prompt Alert-input-Box//
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myalert1=driver.switchTo().alert();
		Thread.sleep(5000);
		myalert1.sendKeys("welcome");
	    myalert1.accept();
		
		//Alerts-----:
		driver.switchTo().alert().accept();
		driver.switchTo().alert();
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
