package day25;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxes {

	private static int i = 0;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Select Specific checkbox//
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
	    //Select all the checkboxes//
		List<WebElement>checkboxes=(List<WebElement>)driver.findElement(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//Approach 1//
	    for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
	    
		
		//I want select last 3 checkboxes//
		// i want to select=starting index//
		//7-3=4(starting index)//
				
		
		//select first 3 checkboxes//
		
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		//unselect checck boxes if they are selected//
		for(int i=0;i<3;i++);
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		
		for(i=0;i<checkboxes.size();i++)
	    {
			if(checkboxes.get(i).isSelected())
		{
				checkboxes.get(i).click();
		}
	}
		
				
	    }
}
