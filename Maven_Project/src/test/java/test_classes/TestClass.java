package test_classes;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.AdvisoryBoard;
import pageClass.Homepage;
import pageClass.LoginPage;
import utility.UtilityClass;

public class TestClass extends BaseClass 

{
	LoginPage ln;
	Homepage home;
	AdvisoryBoard ad;
	JavascriptExecutor js;
	BaseClass bs;
	
	String sheetname ="Sheet2";
	@Test (priority=0)
	public void launchBrowser() throws IOException
	{
		openBrowser();
		ln= new LoginPage(driver);
		home=new Homepage(driver);
	    ad= new AdvisoryBoard(driver);
	    js = (JavascriptExecutor) driver;
	bs=new BaseClass();
	}
	
	@Test(priority = 1)
	
	public void logintoApp() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ln.sendUserID(UtilityClass.getDatafromPropertyFile("USERID"));
		ln.sendPWD(UtilityClass.getDatafromPropertyFile("PASSWORD"));
		ln.clickOnButton();
	}
	
	/*
	public void LogintoApplication() throws IOException
	
	{
		ln.sendUserID(UtilityClass.readDataFromExcel(1, 0));
		ln.sendPWD(UtilityClass.readDataFromExcel(1, 1));
		ln.clickOnButton();
		
	}*/
	
	@SuppressWarnings("deprecation")
	@Test (priority =2)
	public void createActvity() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		home.clickonMyActivityActions();
		Thread.sleep(2000);
		home.createActivity();
		Thread.sleep(2000);
		home.clickonActivityType();
		home.selectActivityTYPE();
		home.clickOptionFromList();
		Thread.sleep(3000);
	
	}
	
	@Test (priority =3)
	public void FillActivityDetails() throws IOException, InterruptedException 
	{
		
		ad.sendActivityTitle();
		ad.selectStartDate();
		ad.selectEndDate();
		ad.SelectProjectOrginator();
		ad.selectDesignatedReviewer();
		ad.selectCountryResponsible();
		ad.selectTherapeuticArea();
		ad.selectOtherActivity();
		ad.editActivityDeatails();
		ad.saveActivityID();
		//ad.setVeevaVaultID();
		//ad.purposeObjective();
		ad.clickonActivityDeatils();
		//ad.clickonEventType();
		ad.thirdPartyRepresentative();
		ad.sendThirdPartyName();
		ad.approvalObtained();
		ad.isThereIsVenue();
		ad.editVenueDetails();
		ad.editVEnue();
		ad.otherVenue();
		ad.sendVenueName();
		ad.venueAddress();
		ad.SelectVenueCountry();
		ad.SelectVenueCity();
		ad.SendLoaction();
		ad.saveVenueDetails();
		ad.estimatedBudget();
		ad.selectSpendtype();
		ad.sendAmount();
		ad.clickonAdvisoryBoard();
		ad.advisoryBoardFormYes();
		ad.sendAdvice();
		ad.haveMeetingsYes();
		ad.sendMeetingAddressing();
		ad.anyOtherInformation();
		ad.PartOfMeetingsInformation();
		ad.descriptionOfCriteria();
		ad.sendNoOfadvisors();
		ad.editTevaAttendance();
		ad.sendName();
		ad.sendTitle();
		ad.sendDepartment();
		ad.SendSpecificAction();
		
	}
	
	
	
	
	
	
  
}
