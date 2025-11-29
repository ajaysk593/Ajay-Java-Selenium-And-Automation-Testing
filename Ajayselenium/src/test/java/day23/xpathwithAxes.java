package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathwithAxes {

	public static <webElement, webElements> void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().browserVersion("2.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers");
        driver.manage().window().maximize();
        
        //self ---- select the current Nodes//
        
        String text=driver.findElement(By.xpath("//a[contains(text(),'Cindrella Hotels')]/self::a")).getText();
        System.out.println("self:"+text);
		
        String childs=driver.findElement(By.xpath("//a[contains(text(),'Cindrella Hotels')]/parent::td")).getText();
        System.out.println("parent:"+text);
		
        driver.findElement(By.xpath("//a[contains(text(),'Cindrella Hotels')]/ancestor::tr")).getText();
        System.out.println("Number of child Elements:"+childs);
		
		
		
		
		
		
	}

}
