package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
	     driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		//Drag and Drop Action//
		WebElement Oslo=driver.findElement(By.xpath("//div[@id='dropContent']//div[@id='box1']"));
		WebElement Italy=driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop(Oslo, Italy).perform();
		
		WebElement  Stockhol=driver.findElement(By.xpath("//div[@id='dropContent']//div[@id='box2']"));
		WebElement Norway=driver.findElement(By.xpath("//div[@id='box101']"));
		act.dragAndDrop(Stockhol, Norway).perform();

        //Like that All//

	}

}
