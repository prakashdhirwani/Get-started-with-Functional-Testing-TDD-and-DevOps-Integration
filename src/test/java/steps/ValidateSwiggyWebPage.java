package steps;

import org.testng.annotations.BeforeMethod;

import com.vimalselvam.cucumber.listener.Reporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.CheckoutPage;
import pageObjects.RestaurantMenuPage;
import pageObjects.RestaurantResultsPage;
import pageObjects.SwiggyLandingPage;
import resources.DriverSetup;

public class ValidateSwiggyWebPage extends DriverSetup
{
	WebDriver driver;
	DriverSetup setup; 
	SwiggyLandingPage obj1;
	RestaurantResultsPage obj2;
	RestaurantMenuPage obj3;
	CheckoutPage obj4;
	String location,restaurant,foodItem,title,billamount;
	@Before
	public void setup()
	{
		setup = new DriverSetup();
	}
	
	@Given("^Swiggy webpage is opened$")
	public void swiggy_webpage_is_opened() throws Throwable 
	{
		Thread.sleep(2000);
	    driver = setup.getDriver();
	    Thread.sleep(2000);
	    obj1 = new SwiggyLandingPage(driver);
		obj2 = new RestaurantResultsPage(driver);
		obj3 = new RestaurantMenuPage(driver);
		obj4 = new CheckoutPage(driver);
	    Thread.sleep(5000);
	}

	@Then("^Enter \"([^\"]*)\" in search textbox$")
	public void enter_in_search_textbox(String arg1) throws Throwable 
	{
		Thread.sleep(2000);
		location = arg1;
		obj1.enterLocation(arg1);
	}

	@Then("^Select location and click go$")
	public void select_location_and_click_go() throws Throwable 
	{
		Thread.sleep(2000);
		obj1.selectLocation();
	}

	@Then("^Click on first Restuarant$")
	public void click_on_first_Restuarant() throws Throwable 
	{
		Thread.sleep(4000);
	    restaurant = obj2.selectRestaurant();
	}

	@When("^Click on Add for first food item of the Restuarant$")
	public void click_on_Add_for_first_food_item_of_the_Restuarant() throws Throwable 
	{
		Thread.sleep(4000);
	    foodItem = obj3.addItemToCart();
	}

	@When("^Click on Checkout button$")
	public void click_on_Checkout_button() throws Throwable 
	{
	    Thread.sleep(2000);
	    obj3.checkoutClick();
	  
	}

	@Then("^Validate text on checkout page$")
	public void validate_text_on_checkout_page() throws Throwable 
	{
		Thread.sleep(4000);
	    title = obj4.validateText();
	    billamount=obj4.returnbill();
	    if(title.equals("SECURE CHECKOUT"))
	    {
	    	System.out.println("Checkout Page Validation Successful");
	    }
	    else
	    {
	    	System.out.println("Checkout Page Validation Unsuccessful");
	    }
	}
	
	@After
	public void closure()
	{
		driver.close();
		System.out.println("*************************************************");
		System.out.println("Location -> "+location);
		System.out.println("Restaurant -> "+restaurant);
		System.out.println("Food Item -> "+foodItem);
		System.out.println("Checkout Page Title -> "+title);
		System.out.println("Total Bill -> "+billamount);
	}

}
