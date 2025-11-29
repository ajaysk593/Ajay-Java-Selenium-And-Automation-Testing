package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webpagegoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserVersion("2.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.fitpeo.com/");
        driver.findElement(By.name("q")).sendKeys("Automation Testing");
        driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
        driver.close();
        System.out.println("Test case is passed");
        
		
		
	}

}
