package day29;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions act=new Actions(driver);
        //Right Click//
        act.contextClick(button).perform();
        
        //Click on copy,Edit,cut,delete,quit//
        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Cut']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Delete']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Quit']")).click();

        Thread.sleep(5000);
        
        //click on Alert box//
        driver.switchTo().alert().accept();
	}

}
