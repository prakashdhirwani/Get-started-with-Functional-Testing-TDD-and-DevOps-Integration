package resources;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup 
{
	WebDriver driver;

    String url="https://www.swiggy.com/";

    public WebDriver getDriver()
    {
          System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.navigate().to(url);
          driver.manage().window().maximize();
          driver.manage().deleteAllCookies();
          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        return driver;

    }

}
