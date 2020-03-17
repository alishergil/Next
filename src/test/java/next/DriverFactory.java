package next;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

        public static WebDriver driver;

        public DriverFactory(){
            PageFactory.initElements(driver,this);
        }

        public void openbro(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get("https://www.next.co.uk/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        public void closebro(){
            driver.quit();
        }
    }


