package base;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fileupload {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/upload-download");
    }

    @Test
    public void upload() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to upload section
        js.executeScript("window.scrollBy(0,200)");

        // Locate Upload input
        WebElement uploadElement = driver.findElement(By.id("uploadFile"));

        // Click using JS (if normal click fails)
        js.executeScript("arguments[0].click();", uploadElement);

        // File Path
        String filePath = "C:\\Users\\dell\\OneDrive\\Pictures\\Nature.jpg";

        // Validate file exists
        File file = new File(filePath);
        Assert.assertTrue(file.exists(), "File not found!");

        // Copy file path to clipboard
        StringSelection selection = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        // Create Robot instance
        Robot robot = new Robot();
        robot.delay(2000);

        // CTRL + V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(1000);

        // Press ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.delay(2000);

        // Verification
        String uploadedText = driver.findElement(By.id("uploadedFilePath")).getText();
        System.out.println("Uploaded File: " + uploadedText);

        Assert.assertTrue(uploadedText.contains("Nature.jpg"),
                "Upload verification failed!");
    }

    @AfterClass
    public void tearDown() {

    }
}