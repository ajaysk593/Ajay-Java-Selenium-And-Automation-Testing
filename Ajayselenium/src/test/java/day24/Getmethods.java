package day24;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getmethods {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserVersion("2.0").setup();
        ChromeDriver driver = new ChromeDriver();
        
                          //get(URL)//      
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
                         //get(Title)//
        System.out.println(driver.getTitle());
        
                        //get(current URl)//
        System.out.println(driver.getCurrentUrl());
        
                       //getpagesource//
        System.out.println(driver.getPageSource());
        
                        //getwindowHandle//
       String windowid=driver.getWindowHandle();
       System.out.println("window ID:"+windowid);
       
                       //getwindowHandles//
       Thread.sleep(5000);
       driver.findElement(By.linkText("OrangeHRM, Inc")).click();
       Set<String>windowids=driver.getWindowHandles();
       System.out.println(windowids);
   
        		
       	
	}

}
