package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com"); 

        try {
            WebElement target = driver.findElement(By.className("item-class"));

            try {
                WebElement following = driver.findElement(By.cssSelector(".item-class + .sibling-class"));
                System.out.println("Following sibling text: " + following.getText());
            } catch (Exception e) {
                System.out.println("No following sibling found.");
            }

            JavascriptExecutor js = (JavascriptExecutor) driver;
            Object prevObj = js.executeScript("return arguments[0].previousElementSibling;", target);

            if (prevObj instanceof WebElement) {
                WebElement prev = (WebElement) prevObj;
                System.out.println("Preceding sibling text: " + prev.getText());
            } else {
                System.out.println("No preceding sibling found.");
            }

        } catch (Exception e) {
            System.out.println("Target element not found!");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
