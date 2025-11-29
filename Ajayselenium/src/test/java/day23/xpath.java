package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().browserVersion("2.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Index.html");
        
       //xpath with single Attribute//
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ajaysk593@gmail.com");
        driver.findElement(By.xpath("//img[@id='enterimg']")).click();

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("AJAY");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("SAPAVATH");
        driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("1-1-98/Bankat Singh Thanda Dornakal,Mahabubabad,Telangana");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ajaysk593@gmail.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9133882630");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        driver.findElement(By.xpath("//input[@id='checkbox3']")).click();


      

	}

}
