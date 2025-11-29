package day35;

import org.openqa.selenium.chrome.ChromeDriver;

public class riugh {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getPageSource();
		System.out.println(driver.getPageSource());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		
		

	}

}
