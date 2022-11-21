package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage 
{
	WebDriver driver;
	public CheckoutPage(WebDriver driver1)
	{
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using = "//span[@class='_2EQ3T']")
    public WebElement title;
	
	@FindBy(how=How.XPATH, using ="//div[@class='_3ZAW1']")
	public WebElement bill;
	
	public String validateText()
	{
		String titletext = title.getText();
		return titletext;
	}
	
	public String returnbill()
	{
		return bill.getText();
	}

}
