package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RestaurantMenuPage 
{
	WebDriver driver;
	public RestaurantMenuPage (WebDriver driver1)
	{
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	//Checkout
	@FindBy(how=How.XPATH, using = "//div[text()='ADD']")
    public WebElement AddItem;
	
	@FindBy(how=How.XPATH, using = "//button[@class='_1gPB7']")
    public WebElement checkoutButton;
	
	@FindBy(how=How.XPATH, using = "//div[@class='styles_itemName__hLfgz']/h3")
    public WebElement foodItem;
	
	@FindBy(how=How.XPATH, using = "//button[@class='icon-close-thin VVWx4']")
    public WebElement customizeSection;
	
	@FindBy(how=How.XPATH, using ="//div[@class='_3coNr']/span[@class='mmytI']")
	public WebElement paybillbutton;
	
	//_3coNr
	//mmytI
	public String addItemToCart() throws InterruptedException
	{
		String temp=foodItem.getText();
		AddItem.click();
		Thread.sleep(2000);
		if(customizeSection.isDisplayed()) 
		{
			paybillbutton.click();
		}
		return temp;
	}
	
	public void checkoutClick()
	{
		checkoutButton.click();
	}
	
}
