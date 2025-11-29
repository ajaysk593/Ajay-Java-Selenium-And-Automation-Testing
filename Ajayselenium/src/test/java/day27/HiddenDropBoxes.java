package day27;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropBoxes {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
		
driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(5000);

//clicking on PIM//
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

//clicked on dropdown//
Thread.sleep(5000);
driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']")).click();
//select single options//
driver.findElement(By.xpath("//div[contains(text(),'Account Assistant')]")).click();

//count number of options//
List<WebElement>options=(List<WebElement>) driver.findElement(By.xpath("(//div[@role='listbox'])[1]"));
System.out.println("Number of options:"+options.size());

//Printing options//
for(WebElement option:options)
{
	System.out.println(option.getText());
}
}
}