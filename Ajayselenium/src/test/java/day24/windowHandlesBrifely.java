package day24;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class windowHandlesBrifely {

	public static void main(String[] args) {

       WebDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.findElement(By.xpath("//input[@placeholder='Username']")).click();
       
       Set<String>windowIDS=driver.getWindowHandles();
       
       //Approach 1//
       List<String>windowList=new ArrayList(windowIDS);
       String parentID=windowList.get(0);
       String childID=windowList.get(1);
       
       //Switch to child window id//
       driver.switchTo().window(childID);
       System.out.println(driver.getTitle());
       
       //Switch to parent window id//
       
       driver.switchTo().window(parentID);
       System.out.println(driver.getTitle());
       

       }

	}

