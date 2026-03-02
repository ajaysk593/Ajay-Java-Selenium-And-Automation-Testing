package DataDrivenExcel;

import org.testng.annotations.Test;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload8 {

    WebDriver driver;

    @Test(priority = 1)
    public void Elementspage() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Thread.sleep(2000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    @Test(priority = 2)
    public void upload() throws Exception {
        
        driver.findElement(By.xpath("//h5[normalize-space()='Elements']")).click();
        Thread.sleep(1000);

        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement upload = driver.findElement(By.xpath("//span[text()='Upload and Download']"));
        js.executeScript("arguments[0].scrollIntoView(true);", upload);
        upload.click();
        Thread.sleep(2000);

        
        WebElement ele = driver.findElement(By.id("uploadFile"));
        js.executeScript("arguments[0].click();", ele);
        
        
        Robot rb = new Robot();
        rb.delay(2000);

        
        String filePath = "C:\\Users\\dell\\OneDrive\\Desktop\\Test case Template.png";
        StringSelection ss = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

  
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(500,0)");
        Thread.sleep(1000);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    }
}