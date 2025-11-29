package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
         //close()---//
		//quit()---//
		
		WebDriverManager.chromedriver().browserVersion("2.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Thread.sleep(5000);
        driver.close();
        driver.quit();
        

	}

}
