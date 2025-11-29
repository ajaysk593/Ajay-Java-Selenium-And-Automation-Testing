package day29;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MouseHoverAction {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-opencart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
       WebElement deskstops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
       WebElement pc=driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));
       WebElement Mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (2)']"));
       Actions act=new Actions(driver);
       
       
       //Mouse Hover Action//
       act.moveToElement(deskstops).moveToElement(pc).moveToElement(Mac).click().build().perform();
		
       
       
		
		
		
		
	}

}
