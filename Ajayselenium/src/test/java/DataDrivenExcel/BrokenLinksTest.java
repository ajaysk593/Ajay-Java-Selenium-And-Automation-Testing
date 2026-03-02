package DataDrivenExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinksTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/broken");
    }

    @Test
    public void validateBrokenLinks() {

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {

            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                continue;
            }

            try {
                HttpURLConnection connection =
                        (HttpURLConnection) new URL(url).openConnection();

                connection.setRequestMethod("HEAD");
                connection.connect();

                int responseCode = connection.getResponseCode();

                System.out.println(url + " -> Response Code: " + responseCode);

              
                Assert.assertTrue(responseCode < 400,
                        "Broken link found: " + url + " | Code: " + responseCode);

            } catch (Exception e) {
                Assert.fail("Exception for URL: " + url + " | " + e.getMessage());
            }
        }
    }

    @AfterClass
    public void tearDown() {
       
    }
}