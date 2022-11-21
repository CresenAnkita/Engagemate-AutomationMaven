package pageClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

import utility.UtilityClass;

public class LoginPage {

		@FindBy (xpath ="//input[@id='userId']") WebElement userID;
		@FindBy (id = "userPwd") private WebElement Password;
		@FindBy (id = "loginBtn")private WebElement btn;
		@FindBy (xpath ="(//button[@type='button'])[3]")WebElement navbarLogOut;
		@FindBy (xpath ="//b[text()=' LOG OUT ']")WebElement logout;

		
		public LoginPage(WebDriver driver)
		{
		PageFactory.initElements(driver,this);	
		
		}
		public void sendUserID(String USERID ) throws IOException
		
		{
			userID.sendKeys(USERID);
			
	     }
	
		public void sendPWD(String PASSWORD) throws IOException
		{
			Password.sendKeys(PASSWORD);
		}
		
		public void clickOnButton()
		{
			btn.click();
		}
		
		public void logOut() throws InterruptedException {
			navbarLogOut.click();
			logout.click();
			}
		
		
		
		

}
