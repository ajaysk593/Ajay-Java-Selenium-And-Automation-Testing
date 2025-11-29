package day22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
public class example1 {

	private static final String drpSkills = null;
	private static final String drop = null;
	private static WebElement dropdown;

	public static <select> void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().browserVersion("2.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.findElement(By.id("email")).sendKeys("ajaysk593@gmail.com");
        
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("AJAY");
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("SAPAVATH");
        driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid[rows='3']")).sendKeys("1-1-98/Bankat Singh Thanda Dornakal,Mahabubabad,Telangana");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("ajaysk593@gmail.com");
        driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9133882630");
        driver.findElement(By.cssSelector("input[value='Male']")).click();
        driver.findElement(By.cssSelector("#checkbox1")).click();
        driver.findElement(By.cssSelector("#checkbox2")).click();
        driver.findElement(By.cssSelector("#checkbox3")).click();
        
        Thread.sleep(3000);
        WebElement languageelement=driver.findElement(By.id("msdd"));
        Select languagedropdown=new Select (languageelement);
        languagedropdown.selectByVisibleText("English");
        
        Thread.sleep(3000);
        WebElement skillelement=driver.findElement(By.id("Skills"));
        Select skilldropdown=new Select (skillelement);
        skilldropdown.selectByIndex(1);
        
		
        
    
        
        

        //driver.close();
        //System.out.println("Test is completed");

        //driver.close();
        //driver.quit();        
	}

	private static void selectByvalue(String string) {
		// TODO Auto-generated method stub
		
	}     
}
