package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().browserVersion("2.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Index.html");
        
        //tag id-----tag #id//
        driver.findElement(By.cssSelector("#email")).sendKeys("ajaysk593@gmail.com");
        driver.findElement(By.cssSelector("#enterimg")).click();
        
        
        //tag class-----tag.classname//
        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("AJAY");
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("SAPAVATH");
        
        

        
      
        
        
        

	}

}
