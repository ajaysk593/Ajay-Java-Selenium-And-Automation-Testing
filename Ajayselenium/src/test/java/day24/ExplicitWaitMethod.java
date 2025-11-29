package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ExplicitWaitMethod {
	
	
	public static <webDriverwait> void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().browserVersion("2.0").setup();
        ChromeDriver driver = new ChromeDriver();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))	;
     	
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
     	
     	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
     	
       WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
       txtusername.sendKeys("Admin");
       
       WebElement txtpassword=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
       txtpassword.sendKeys("admin123");
       
       WebElement loginbutton=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
       loginbutton.click();
       
	
	}

}
