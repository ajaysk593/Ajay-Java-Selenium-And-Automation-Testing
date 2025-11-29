package day24;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException {
		
		//Navigate().To//

     WebDriver driver=new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.navigate().to("https://demo.nopcommerce.com/");
     
     URL myurl=new URL("https://demo.automationtesting.in/FileUpload.html");
     driver.navigate().to(myurl);
     
     driver.navigate().to("https://demo.nopcommerce.com/");
     driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
     //Navigate().back()//
     driver.navigate().back();
     System.out.println(driver.getCurrentUrl());
     
     //Navigate().Forward()//
     driver.navigate().forward();
     System.out.println(driver.getCurrentUrl());
     
     //Navigate().Refresh()//
     driver.navigate().refresh();
     //System.out.println(driver.getCurrentUrl());

	}

}
