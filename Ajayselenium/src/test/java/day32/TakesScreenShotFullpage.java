package day32;

import java.io.File;
import java.time.Duration;

import org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShotFullpage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Take screeenshot full page//
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File("C:\\Users\\user\\eclipse-workspace\\Ajayselenium\\Screenshots\\fullpage.png");
	    sourcefile.renameTo(targetfile);
		
		
		//Specific area of the page capture screenshot section//
		//WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	    //File sourcefile1=featuredproducts.getScreenshotAs(OutputType.FILE);
		//File targetfile1=new File("\\Screenshots\\featuredproducts.png");
		//sourcefile1.renameTo(targetfile1);
		
		
		//capture the screen shot of WebElement//
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		//File targetfile=new File("\\Screenshots\\logo.png");
		//sourcefile.renameTo(targetfile);
			
	}

}

