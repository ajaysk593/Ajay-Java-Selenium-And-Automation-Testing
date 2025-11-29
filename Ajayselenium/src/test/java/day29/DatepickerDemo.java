package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Switch to Frame//
		driver.switchTo().frame(0);
		
		//method 1 : using Sendkeys()//
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("14/04/1997");
        Thread.sleep(5000);

        //method 2 using data picker//
        String Year="2025";
        String month="may";
        String date="20";
        
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        
        //Select Month And Year Future//
        while(true)
        {
        	String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        	String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        	
        	if(currentmonth.equals(month) && currentyear.equals(Year))
        	{
        		break;
        	}
        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        //select alldates//
       List<WebElement>AllDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a\"));\r\n"));
        for(WebElement dt:AllDates)
        {
        	if(dt.getText().equals(AllDates))
        	{
        		break;
        	}
        		
        }
         
		
	}
}
		
		
		



