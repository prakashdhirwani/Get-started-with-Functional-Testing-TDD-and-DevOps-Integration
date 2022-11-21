package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SwiggyLandingPage 
{
	WebDriver driver;
	public SwiggyLandingPage(WebDriver driver1)
	{
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	//FIND FOOD
	@FindBy(how=How.ID, using = "location")
    public WebElement location;
	
	@FindBy(how=How.XPATH, using ="//span[@class='_2W-T9']")
	public WebElement place;
	
	@FindBy(how=How.XPATH, using = "//span[text()='FIND FOOD']")
    public WebElement findfood;
	
	
	public void enterLocation(String Location) throws InterruptedException
	{
		location.sendKeys(Location);
	}
	
	public void selectLocation() throws InterruptedException
	{
		place.click();
	}
	
	public void clickFindFood() throws InterruptedException
	{
		Thread.sleep(1000);
		findfood.click();
	}
	
	

}
