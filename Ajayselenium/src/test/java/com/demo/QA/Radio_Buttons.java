package com.demo.QA;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Set;

public class Radio_Buttons {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // ===================== TEXT BOX =====================

    @DataProvider(name = "TextBoxData")
    public Object[][] getTextData() {
        return new Object[][]{
                {"Ajay Kumar", "ajay@gmail.com", "Hyderabad", "Warangal"},
                {"Archu Aj", "archu@gmail.com", "Bangalore", "Mysore"}
        };
    }

    @Test(priority = 1, dataProvider = "TextBoxData")
    public void testTextBox(String name, String email, String current, String permanent) {

        driver.get("https://demoqa.com/text-box");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        driver.findElement(By.id("userName")).clear();
        driver.findElement(By.id("userName")).sendKeys(name);

        driver.findElement(By.id("userEmail")).clear();
        driver.findElement(By.id("userEmail")).sendKeys(email);

        driver.findElement(By.id("currentAddress")).clear();
        driver.findElement(By.id("currentAddress")).sendKeys(current);

        driver.findElement(By.id("permanentAddress")).clear();
        driver.findElement(By.id("permanentAddress")).sendKeys(permanent);

        driver.findElement(By.id("submit")).click();

        Assert.assertTrue(driver.findElement(By.id("name")).getText().contains(name));

        System.out.println("TextBox Data Submitted Successfully: " + name);
    }

    // ===================== CHECK BOX =====================

    @Test(priority = 2)
    public void testCheckBox() {

        driver.get("https://demoqa.com/checkbox");

        driver.findElement(By.xpath("//span[@class='rct-collapse rct-collapse-btn']")).click();
        driver.findElement(By.xpath("//span[text()='Desktop']")).click();

        System.out.println("Checkbox Selected Successfully");
    }

    // ===================== RADIO BUTTON =====================

    @DataProvider(name = "RadioData")
    public Object[][] getRadioData() {
        return new Object[][]{
                {"yesRadio"},
                {"impressiveRadio"}
        };
    }

    @Test(priority = 3, dataProvider = "RadioData")
    public void testRadioButton(String radioId) {

        driver.get("https://demoqa.com/radio-button");

        WebElement radio = driver.findElement(By.id(radioId));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radio);

        System.out.println("Radio Button Selected: " + radioId);
    }

    // ===================== BUTTONS =====================

    @Test(priority = 4)
    public void testButtons() {

        driver.get("https://demoqa.com/buttons");

        Actions action = new Actions(driver);

        // Double Click
        WebElement doubleBtn = driver.findElement(By.id("doubleClickBtn"));
        action.doubleClick(doubleBtn).perform();

        // Right Click
        WebElement rightBtn = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightBtn).perform();

        // Dynamic Click
        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMe.click();

        System.out.println("All Button Actions Performed Successfully");
    }

    // ===================== LINKS =====================

    @Test(priority = 5)
    public void testLinks() throws InterruptedException {

        driver.get("https://demoqa.com/links");

        String originalWindow = driver.getWindowHandle();

        driver.findElement(By.id("simpleLink")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
        driver.close();

        driver.switchTo().window(originalWindow);

        // API Link
        driver.findElement(By.id("created")).click();

        WebElement response = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));

        Assert.assertTrue(response.getText().contains("201"));

        System.out.println("Links Verified Successfully");
    }

    // ===================== TEARDOWN =====================

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}