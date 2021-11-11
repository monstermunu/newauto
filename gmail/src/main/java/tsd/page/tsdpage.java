package tsd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class tsdpage 
{
	@FindBy(how=How.XPATH,using="//li[starts-with(@class,'product type-product post-20 status')]")
	public WebElement singleshirt;
	
	@FindBy(how=How.XPATH,using="//li[starts-with(@class,'product type-product post-22 status')]")
	public WebElement bikini;
	
	@FindBy(how=How.XPATH,using="//li[starts-with(@class,'product type-product post-18 status')]")
	public WebElement toppant;

	@FindBy(how=How.XPATH,using="//li[starts-with(@class,'product type-product post-24 status')]")
	public WebElement wn_dress;
	
	@FindBy(how=How.XPATH,using="//a[@data-original-product-id =20]")
	public WebElement singleshirt_wishlist;
	
	@FindBy(how=How.XPATH,using="//a[@data-original-product-id =22]")
	public WebElement bikini_wishlist;
	
	@FindBy(how=How.XPATH,using="//a[@data-original-product-id =18]")
	public WebElement toppant_wishlist;
	
	@FindBy(how=How.XPATH,using="//a[@data-original-product-id =24]")
	public WebElement wn_dress_wishlist;
	
	
	@FindBy(how=How.XPATH,using="//a[@title='Home']")
	public WebElement Home;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"yith-wcwl-form\"]/table/thead/tr/th[4]")
	public WebElement Unitpricerow;
	
	@FindBy(how=How.XPATH,using="//a[text()='Accept all']")
	public WebElement acceptall;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"blog\"]/div[3]/div[1]/div/div/div[3]/div[3]/a/i")
	public WebElement Wishlist;
	@FindBy(how=How.XPATH,using="//*[@id=\"yith-wcwl-form\"]/table/thead/tr/th")
	public WebElement unitpice;
	
	@FindBy(how=How.XPATH,using="(//a[@class='cart-contents'])[1]")
	public WebElement Cartlink;
	
}
//*[@id="blog"]/div[3]/div[1]/div/div/div[3]/div[1]/div/div/a/i
//*[@id="blog"]/div[3]/div[1]/div/div/div[3]/div[3]/a/i
//a[text()='Accept all']
//li[starts-with(@class,'product type-product post-20 status')]
//li[starts-with(@class,'product type-product post-22 status')]
//li[starts-with(@class,'product type-product post-23 status')]
//li[starts-with(@class,'product type-product post-24 status')]
//a[@title='Home']
//a[@data-original-product-id =20]
//a[@data-original-product-id =22]
//a[@data-original-product-id =23]
//a[@data-original-product-id =24]

//*[@id="yith-wcwl-form"]/table/thead/tr/th[4] - unitprice xpath
