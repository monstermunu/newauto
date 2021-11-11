package tsd.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



import BaseTest.TestBase;
import tsd.page.tsdpage;
public class tsdactions extends TestBase  {
	tsdpage loginpageobj=null;
	public  tsdactions()
	{
		//this.driver=driver;
		this.loginpageobj= new tsdpage();
		PageFactory.initElements(TestBase.getDriver(), loginpageobj);
	}
	
	public void selectproducts() throws InterruptedException
	{
		loginpageobj.acceptall.click();
		//Thread.sleep(1000);
	    JavascriptExecutor js= (JavascriptExecutor)TestBase.getDriver();
	    js.executeScript("window.scrollBy(0,1000)");
		Actions action = new Actions (TestBase.getDriver());
		action.moveToElement(loginpageobj.bikini);
		loginpageobj.bikini.click();
		//Thread.sleep(1000);
		loginpageobj.bikini_wishlist.click();
		//Thread.sleep(1000);
		loginpageobj.Home.click();
		 js.executeScript("window.scrollBy(0,1000)");
		loginpageobj.toppant.click();
		//Thread.sleep(1000);
		loginpageobj.toppant_wishlist.click();
		loginpageobj.Home.click();
		loginpageobj.singleshirt.click();
		//Thread.sleep(1000);
		loginpageobj.singleshirt_wishlist.click();
		//Thread.sleep(1000);
		loginpageobj.Home.click();
		//Thread.sleep(3000);
		
		loginpageobj.Home.click();
		loginpageobj.wn_dress.click();
		loginpageobj.wn_dress_wishlist.click();
		loginpageobj.Home.click();
   /*
	   Moved to View wishtable 	
		loginpageobj.Wishlist.click();
	*/	
		
		/*
		Moved to method searchlowestpriceitem
		
		List <WebElement> col	=	TestBase.getDriver().findElements(By.xpath("//*[@id=\"yith-wcwl-form\"]/table//tr"));
	    String[] split =null;
	    String xpathstring = null; 
	    TreeMap<Float , String > pricemap = new TreeMap ();
	    for(int i = 1 ; i<=4 ; i++)
	    {
	    xpathstring = 	"//*[@id=\"yith-wcwl-form\"]/table//tr["+i+"]//td[4]";
	    WebElement wd = driver.findElement(By.xpath(xpathstring));
	    String Price = wd.getText().replace("£","").trim();
	    if (Price.contains(" "))
	    {
	     split = Price.split("\\s+");
	     Price = split[1];
	    }
	    Float pricevalue = Float.parseFloat(Price);
	    pricemap.put(pricevalue, xpathstring);
	    
	    }
	    Set<Float> keys = pricemap.keySet();
	    Float lowestprice = 0F;
	    for (Float key: keys )
	    {
	    	System.out.println(key);
	    	lowestprice = key;
	    	break;
	    }
	    // pricemap.get 
	    Iterator <Map.Entry<Float,String>> i = pricemap.entrySet().iterator();
	    Map.Entry<Float, String> entry = null;
	    String lowestitem = null ; 
	    while(i.hasNext())
	    {
	    	entry = i.next();
	    	 System.out.print(entry.getKey() + "=>" + entry.getValue() + "\t");
	    	 lowestitem = entry.getValue();
	    	 break;
	    }
	    String xpathwishlist = lowestitem.replace("td[4]", "td[6]");
	    TestBase.getDriver().findElement(By.xpath(xpathwishlist)).click();
	    */
	   
		/* move to verifycart function 
		loginpageobj.Cartlink.click();
	    
	    List <WebElement> cartrow=TestBase.getDriver().findElements(By.xpath("//table [starts-with(@class , 'shop_table shop_table_responsive cart woocommerce-cart-form__contents')]/tbody/tr"));
        if (cartrow.size() == 2 )
        {
         Assert.assertTrue(true);	
        }
        else
        {
          Assert.assertTrue(false);	
        } */
	}
	
  public void viewWisshtable()
  {
	  loginpageobj.Wishlist.click();
  }
  
  public void searchlowestpriceitem()
  {
	  List <WebElement> col	=	TestBase.getDriver().findElements(By.xpath("//*[@id=\"yith-wcwl-form\"]/table//tr"));
	  int size = col.size(); 
	  String[] split =null;
	    String xpathstring = null; 
	    TreeMap<Float , String > pricemap = new TreeMap ();
	    for(int i = 1 ; i<=4 ; i++)
	    {
	    xpathstring = 	"//*[@id=\"yith-wcwl-form\"]/table//tr["+i+"]//td[4]";
	    WebElement wd = driver.findElement(By.xpath(xpathstring));
	    String Price = wd.getText().replace("£","").trim();
	    if (Price.contains(" "))
	    {
	     split = Price.split("\\s+");
	     Price = split[1];
	    }
	    Float pricevalue = Float.parseFloat(Price);
	    pricemap.put(pricevalue, xpathstring);
	    
	    }
	    Set<Float> keys = pricemap.keySet();
	    Float lowestprice = 0F;
	    for (Float key: keys )
	    {
	    	System.out.println(key);
	    	lowestprice = key;
	    	break;
	    }
	    // pricemap.get 
	    Iterator <Map.Entry<Float,String>> i = pricemap.entrySet().iterator();
	    Map.Entry<Float, String> entry = null;
	    String lowestitem = null ; 
	    while(i.hasNext())
	    {
	    	entry = i.next();
	    	 System.out.print(entry.getKey() + "=>" + entry.getValue() + "\t");
	    	 lowestitem = entry.getValue();
	    	 break;
	    }
	    String xpathwishlist = lowestitem.replace("td[4]", "td[6]");
	    TestBase.getDriver().findElement(By.xpath(xpathwishlist)).click();
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
  }
  
     public void verifycart()
     {
    	 loginpageobj.Cartlink.click();
 	    
 	    List <WebElement> cartrow=TestBase.getDriver().findElements(By.xpath("//table [starts-with(@class , 'shop_table shop_table_responsive cart woocommerce-cart-form__contents')]/tbody/tr"));
         if (cartrow.size() == 2 )
         {
          Assert.assertTrue(true);	
         }
         else
         {
           Assert.assertTrue(false);	
         }
         TestBase.getDriver().close();
     }
	
}
