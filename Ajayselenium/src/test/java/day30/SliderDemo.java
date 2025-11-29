package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		//Minimum Slider//(x=59,y=249)
	    WebElement min_Slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Default Location of min Slider:"+min_Slider.getLocation());
		act.dragAndDropBy(min_Slider, 100, 0).perform();
	    System.out.println("Location of the  min Slider After Moving:"+min_Slider.getLocation());
		
		//Maximum Slider//(x=510,y=249)
		WebElement max_Slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("Default Location of the max Slider:"+max_Slider.getLocation());
		act.dragAndDropBy(max_Slider, -100, 0).perform();
		System.out.println("Location of the max slider After moving:"+max_Slider.getLocation());

	}

}
