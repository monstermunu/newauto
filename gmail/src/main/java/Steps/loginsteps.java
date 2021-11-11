package Steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseTest.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tsd.actions.tsdactions;

public class loginsteps {
	
	tsdactions lg ; 
	
	@Given("I login to {string}")
	public void i_login_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 TestBase base = new TestBase();
		 base.setUp();
		 lg = new tsdactions();
	}

	@Given("I add four products to my wishlist")
	public void i_add_four_products_to_my_wishlist() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		//loginactions lg = new loginactions();
		try {
			lg.selectproducts();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("I view my whishlist table")
	public void i_view_my_whishlist_table() {
	    // Write code here that turns the phrase above into concrete actions
	   lg.viewWisshtable();
	}

	@Then("I find total four seleted items in my wish list")
	public void i_find_total_four_seleted_items_in_my_wish_list() {
	    // Write code here that turns the phrase above into concrete actions
		 List <WebElement> col	=	TestBase.getDriver().findElements(By.xpath("//*[@id=\"yith-wcwl-form\"]/table//tr"));
		  int size = col.size(); 
		  if (size == 5 )
	         {
	          Assert.assertTrue(true);	
	         }
	         else
	         {
	           Assert.assertTrue(false);	
	         }
	}

	@When("I search for lowest price product")
	public void i_search_for_lowest_price_product() {
	    // Write code here that turns the phrase above into concrete actions
	    lg.searchlowestpriceitem();
	}

	@When("I am able to add the lowest price item to the cart")
	public void i_am_able_to_add_the_lowest_price_item_to_the_cart() {
       //Covered as part of previous action
	}

	@Then("I am able to verify the item in the cart")
	public void i_am_able_to_verify_the_item_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		lg.verifycart();
	}
}
