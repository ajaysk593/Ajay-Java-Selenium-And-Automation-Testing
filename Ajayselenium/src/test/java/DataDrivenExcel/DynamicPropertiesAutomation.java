package DataDrivenExcel;


	import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import java.time.Duration;

	public class DynamicPropertiesAutomation {

	    WebDriver driver;
	    WebDriverWait wait;

	    @BeforeClass
	    public void setup() throws InterruptedException {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        // Defining an explicit wait of 10 seconds
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.get("https://demoqa.com/dynamic-properties");
	        Thread.sleep(1000);
	    }

	    @Test(priority = 1)
	    public void handleDynamicElements() throws InterruptedException {
	        // 1. Wait for the button to become enabled
	        WebElement enableButton = driver.findElement(By.id("enableAfter"));
	        System.out.println("Is button enabled? " + enableButton.isEnabled());
	        Thread.sleep(1000);
	        
	        wait.until(ExpectedConditions.elementToBeClickable(enableButton));
	        System.out.println("Button is now enabled!");
	        Thread.sleep(1000);

	        // 2. Check for Color Change (CSS class changes to include 'text-danger')
	        WebElement colorButton = driver.findElement(By.id("colorChange"));
	        // Wait until the class attribute contains 'text-danger' (red color)
	        wait.until(ExpectedConditions.attributeContains(colorButton, "class", "text-danger"));
	        System.out.println("Button color has changed to red.");
	        Thread.sleep(1000);

	        // 3. Wait for the 'Visible After 5 Seconds' button to appear
	        // Note: We use visibilityOfElementLocated because it's not in the UI initially
	        WebElement visibleButton = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
	        Thread.sleep(1000);
	        
	        System.out.println("Hidden button is now visible: " + visibleButton.getText());
	        visibleButton.click();
	        Thread.sleep(1000);
	    }
	}