package SpeshWayFinalTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AutoSuggestionAndFrame {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        Thread.sleep(2000); 
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

      
            

        Thread.sleep(2000); 

       driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

        driver.switchTo().frame("iframeResult");
        WebElement text = driver.findElement(By.tagName("h2"));
        System.out.println("Text inside iframe: " + text.getText());

        driver.switchTo().defaultContent();
        System.out.println("Switched back to main page");

        driver.quit();
    }
}
