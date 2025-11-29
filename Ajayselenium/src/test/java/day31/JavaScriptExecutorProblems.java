package day31;

import java.time.Duration;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JavaScriptExecutorProblems {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		//passing the text into input box---Alternate of senndkeys//
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Ajay Sapavath')",inputbox);
		
		//passing the text in G-Mail//
		WebElement emailtext=driver.findElement(By.xpath("//input[@id='email']"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].setAttribute('value','ajaysk593@gmail.com')", emailtext);
		
		//passing the text in Phone-number//
		WebElement phoneText=driver.findElement(By.xpath("//input[@id='phone']"));
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].setAttribute('value','9133882630')",phoneText);
		
		//passing the text in Address area fiedl//
		WebElement textarea=driver.findElement(By.xpath("//textarea[@id='textarea']"));
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].setAttribute('value','Bankat Singh Thanda Dornakal')",textarea);
		

	}

}
