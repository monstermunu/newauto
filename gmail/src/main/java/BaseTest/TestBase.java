package BaseTest;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static String browser;

	//@BeforeSuite
	public void setUp() {

		if (driver == null) {}
			
			try {
				//fis = new FileInputStream("C:\\chromedriver\\Config.properties");
				fis=new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

						
				browser = config.getProperty("browser");
						
			config.setProperty("browser", browser);
									
			//System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");   
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
					TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 5);
		}

	
	 public static WebDriver getDriver() {
	        return driver;
	    }
	
	
	
	static WebElement dropdown;

	
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}}
		public void closewindow() {

			if (driver != null) {
				driver.close();
				driver=null;
			}
		
	}
}
