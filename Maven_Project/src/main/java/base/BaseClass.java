package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import utility.UtilityClass;


public class BaseClass {

	public WebDriver driver;
	
	

	public void openBrowser() throws IOException 
	{
	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Cresen\\Desktop\\chromedriver_win32\\chromedriver.exe");  
	
    ChromeOptions option=new ChromeOptions();
    //option.addArguments("incognito");
	//driver= new ChromeDriver(option);
	
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	 
	
	//driver.get(UtilityClass.getDatafromPropertyFile("URL"));
	driver.get("https://tevadevem.cresensolutions.com/activity");
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	
	public WebDriverWait explicitWait()
	{
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait1;
		
	}
//	public Actions actionClass()
//	{
//		 Actions act=new Actions(driver);
//		 return act;
//	}
	
	
	

	
}
