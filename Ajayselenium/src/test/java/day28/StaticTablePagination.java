package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTablePagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	driver.manage().window().maximize();
     	
     	//Find total number of rows in a table//
      int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
      System.out.println("Number of rows:"+rows);
      
      //Find Total number of column in a Table//
      int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
      System.out.println("Number of cols:"+cols);
      Thread.sleep(5000);
      
      //Find the Specific row and cols//
      driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
      
      
      
	}

}
