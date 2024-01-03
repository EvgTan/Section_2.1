import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task2 {
    WebDriver driver;

    @BeforeMethod
    public void precondition() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String link = "https://www.example.com/";
        driver.navigate().to(link);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void loginSuccessfulTest(){
        String userName = "testuser";
        String password = "testpass";
        String title = "Welcome - Example.";
        WebElement userNameField = driver.findElement(By.id("userName"));
        userNameField.click();
        userNameField.clear();
        userNameField.sendKeys(userName);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//button[.='Login']"));
        loginButton.click();
        Assert.assertEquals(title, driver.getTitle());
    }

    @AfterMethod
    public void postcondition() {
        driver.quit();
    }
}
