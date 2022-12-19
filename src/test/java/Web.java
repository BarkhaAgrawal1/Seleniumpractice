import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web {
    @Test
    public void Ele() {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\deepa\\Documents\\Barkha new intellij\\Seleniumfinal practice" +
                "\\src\\main\\resources\\Browers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.whiteboxqa.com/");
            driver.manage().window().maximize();


        }
    }

