package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().browserVersion("2.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
        
        //isDisplayed//
        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo:"+logo.isDisplayed());
		
		//isEnabled//
		boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Enable status:"+status);
		
		//isselected//
		 driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		System.out.println("male_rd.is selected()");
		
		
		
		
		
		
		
		
	}

}
