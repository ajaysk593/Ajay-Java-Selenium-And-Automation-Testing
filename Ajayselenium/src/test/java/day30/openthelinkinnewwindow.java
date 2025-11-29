package day30;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openthelinkinnewwindow {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement reg_Link=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act=new Actions(driver);
		
		//Control+reg_Link//
		act.keyDown(Keys.CONTROL).click(reg_Link).keyDown(Keys.CONTROL).perform();
		
		//SwitchTo Registration page//
		List<String>ids=new ArrayList(driver.getWindowHandles());
		
		//Registration//
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("AJAY");
		
		//Home Page//
	    driver.switchTo().window(ids.get(0));
	    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirts");
	

	}

}
