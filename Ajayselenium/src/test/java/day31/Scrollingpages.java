package day31;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpages {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll down page by pixel number--Approach 1//
		js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll the page till Element is visible--Approach 2//
		//WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		//js.executeScript("arguments[0].scrollIntoview();",ele);
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll page till end of the page--Approach 3//
		//js.executeScript("Window.scrollBy(0,document.body.scrollHeight)");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		//Thread.sleep(5000);
		
		//scroll page upto intitial position//
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		
		
		
	}

}
