package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.InvalidArgumentException;
public class UpLoadFilesDeom {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Single file upload//
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Program Files (x86)\\Common Files");
		Thread.sleep(5000);

		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test1.txt"))			
				{
			System.out.println("File is Sucessfully Uploaded");
				}
		 else
		 {
			 System.out.println("upload Failed");
		 }
		
		//Multiple files uploads//
		String file1="C:\\\\Program Files (x86)\\\\Common Files";
		String file2="C:\\\\Program Files (x86)\\\\Common Files";
		driver.findElement(By.xpath("//input[@id='filesToUpload']"));
		

		
		
		
		
		
		
		
		
	}

}
