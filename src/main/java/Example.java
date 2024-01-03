import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        String link = "https://www.example.com/";
        driver.navigate().to(link);
        String title = driver.getTitle();
        System.out.println("Title: " + title);
        driver.quit();
    }
}
