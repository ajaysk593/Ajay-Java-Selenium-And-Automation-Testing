package Ajayday27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlesDropDownBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Select DropDown//
		
	    WebElement drpcountryEle=driver.findElement(By.xpath("//select[@id='country']"));
	    Select drpcountry=new Select(drpcountryEle);
	    
	    //Select Option From The Drop Down//
	    //drpcountry.selectByVisibleText("india");
	    //drpcountry.selectByValue("india");
	    drpcountry.selectByIndex(9);
		
	    //Capture the options from the dropdown//
	    List<WebElement>options=drpcountry.getOptions();
	    System.out.println("number of options in a drop down:"+options.size());
	    
	    //printing the option//
	    for(int i=0;i<options.size();i++)
	    {
	    	System.out.println(options.get(i).getText());
	    }
	    
	    //Enhanced for loop//
	    for(WebElement option:options)
	    {
	    	System.out.println("option.getText()");
	    }
	    
	    
		
		

	}

}
