package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RestaurantResultsPage 
{
	WebDriver driver;
	public RestaurantResultsPage(WebDriver driver1)
	{
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using = "//div[@class='nA6kb']")
    public WebElement firstRestaurant;
	
	public String selectRestaurant()
	{
		firstRestaurant.click();
		return firstRestaurant.getText();
	}

}
