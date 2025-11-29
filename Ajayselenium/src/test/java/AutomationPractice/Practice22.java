package AutomationPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Practice22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("ajaysk593@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("AJAY");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("SAPAVATH");
		driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid[rows='3']")).sendKeys("1-1-98/ Bankat Singh Thanda Dornakal,Banglore,Karnataka");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("ajaysk593@gmail.com");
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9133882630");
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		driver.findElement(By.cssSelector("#checkbox1")).click();
		driver.findElement(By.cssSelector("#checkbox2")).click();
		driver.findElement(By.cssSelector("#checkbox3")).click();
		
        driver.findElement(By.cssSelector("#msdd")).click();
        driver.findElement(By.cssSelector("section[id='section'] li:nth-child(8) a:nth-child(1)")).click();
        
        WebElement drpskillEle=driver.findElement(By.xpath("//select[@id='Skills']"));
	    Select drpskill=new Select(drpskillEle);
	    drpskill.selectByVisibleText("AutoCAD");

	    driver.findElement(By.cssSelector("#countries")).click(); 
	    driver.findElement(By.cssSelector("span[role='combobox']")).click();
	    driver.findElement(By.cssSelector("span[class='select2-container select2-container--default select2-container--open'] li:nth-child(6)")).click();

	    driver.findElement(By.cssSelector("#yearbox")).click();
	    driver.findElement(By.cssSelector("option[value='2000']")).click();

	    driver.findElement(By.cssSelector("select[placeholder='Month']")).click();
	    driver.findElement(By.cssSelector("option[value='April']")).click();

	    driver.findElement(By.cssSelector("#daybox")).click();
	    driver.findElement(By.cssSelector("option[value='14']")).click();

	    driver.findElement(By.cssSelector("#firstpassword")).sendKeys("Ajaysk9133@");
	    driver.findElement(By.cssSelector("#secondpassword")).sendKeys("Ajaysk9133@");
	    driver.findElement(By.cssSelector("#submitbtn")).click();
	       
	}
	
}
	
	