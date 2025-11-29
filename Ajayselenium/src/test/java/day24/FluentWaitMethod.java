package day24;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class FluentWaitMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		//Fluentwait method//
	
		Wait<WebDriver>mywait=new FluentWait<WebDriver>(driver)
				
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
        .ignoring(NoSuchElementException.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtUsername=mywait.until(new Function<WebDriver,WebElement>(){
        public WebElement apply(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@placeholder='Username']")); 
        }
		});
        
		 txtUsername.sendKeys("Admin"); 
 
        
        }
     }

	
        
      
		
