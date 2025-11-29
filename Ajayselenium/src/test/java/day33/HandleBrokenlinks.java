package day33;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.Connection;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenlinks {

	public static <HttpURLconnection> void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());
		for(WebElement linkElement:links)
		{
			String hrefattvalue=linkElement.getAttribute("href");
			if(hrefattvalue==null || hrefattvalue.isEmpty())
			{
				System.out.println("href attribute value is null or empty.so not possible to check");
				continue;
			}
				//Hit URL to the Server//
			try
			{
				URL linkURL=new URL(hrefattvalue);
				HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection();
			    conn.connect();
			    
			    
				if(conn.getResponseCode()>=400)
				{
					System.out.println("Broken links+========>");
				}
				else
				{
					System.out.println("Not a Broken links+========>");
				}
			    }
			    catch(Exception e)
			    {		
			    }
			}
		}
	}





			
			
		
	
