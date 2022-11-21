package test_classes;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.LoginPage;
import utility.UtilityClass;

public class LoginTestClass extends BaseClass
{
	LoginPage ln;
	String sheetname ="Sheet2";
	
	//@BeforeMethod
	public void launchBrowser() throws IOException
	{
		
		openBrowser();
		ln= new LoginPage(driver);
	}
	
		@DataProvider
		public Object[][] getTestDataFromExcel()
		{
			Object data [][]=UtilityClass.getTestData(sheetname);
			return data;
		}
		@Test (dataProvider = "getTestDataFromExcel")
		
		public void loginWithMultipleData(String ID,String PWD) throws IOException, InterruptedException
		{
			openBrowser();
			ln= new LoginPage(driver);
			ln.sendUserID(ID);
			ln.sendPWD(PWD);
			ln.clickOnButton();
			ln.logOut();
			Thread.sleep(2000);
		}
		
		
		
		//@AfterMethod
            public void logOut() throws InterruptedException {
			ln.logOut();
			Thread.sleep(2000);
		}
}
