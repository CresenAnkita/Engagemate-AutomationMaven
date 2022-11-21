package pageClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class AdvisoryBoard extends BaseClass
{

@FindBy (xpath = "//mat-label[text()=' Activity Title']/../../..//input") private WebElement ActivityTitle;
@FindBy (xpath = "//*[@id=\"mat-input-1\"]") private WebElement ActivityStartDate;
@FindBy (xpath ="//div[contains(@class,'mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today')]")private WebElement SelectDate;
@FindBy (xpath ="//*[@id=\"mat-input-2\"]")	private WebElement ActivityEndDate;
@FindBy (xpath ="//span[contains(text(),'Project Originator')]")private WebElement projectOrginator;
@FindBy (xpath ="//input[@placeholder='Project Originator']")private WebElement sendprojectOrginator;
@FindBy (xpath ="//span[contains(text(),' originator1@mailinator.com ')]")private WebElement selectprojectOrginator;

@FindBy (xpath ="//span[contains(text(),'Designated ')]") private WebElement selectDesReviewer;
@FindBy (xpath ="//input[contains(@placeholder,'Designated Reviewer')]")private WebElement sendDesReviewer;
@FindBy (xpath ="//span[starts-with(text(),' harshini.reviewer ')]")private WebElement reviwerSelected;

@FindBy (xpath ="(//span[contains(text(),'Country')])[2]")private WebElement countryselect;
@FindBy (xpath ="//input[contains(@placeholder,'Country Financially Responsible')]")private WebElement sendCountry;

@FindBy (xpath ="//span[contains(text(),'India')]")private WebElement countrySelected;

@FindBy (xpath ="//span[contains(text(),'Area/Product')]")private WebElement therapeuticArea;
@FindBy (xpath ="//span[contains(text(),'ADASUVE')]")private WebElement therapeuticAreaSelected;
@FindBy (xpath ="//span[contains(text(),'other activities?')]")private WebElement otherActivity;
@FindBy (xpath ="//span[contains(text(),' Yes ')]")private WebElement otherActivityselectedYES;
@FindBy (xpath ="//ag-grid-angular[@id='hcpGridRAGRID']//div//em[@class='fa fa-pencil']")WebElement editActDetails;
@FindBy (xpath ="(//span[text()='Activity ID'])[3]")WebElement selectActID;
@FindBy (xpath ="//span[text()=' 2017-000005 ']")WebElement IDselected;
@FindBy (xpath ="//span[text()='Save']")WebElement IDsave;
//@FindBy (xpath ="//mat-label[contains(text(),'Veeva')]")WebElement veevaVaultId;
@FindBy (xpath ="//mat-label[contains(text(),'Objective')]")WebElement purpose;
@FindBy (xpath = "//span[text()='Activity Details']")WebElement actDetails;
@FindBy (xpath ="//span[contains(text(),'Event')]")WebElement evenType;
@FindBy (xpath ="//span[contains(text(),'Virtual')]")WebElement selEvenType;
@FindBy (xpath ="//mat-label[text()='Has an approval been obtained from the Third Party Due Diligence Team?']/../../../../../../../../../..")WebElement clickpage;
@FindBy (xpath ="//span[contains(text(),'Will you')]")WebElement thirdPartyRepresnt;
@FindBy (xpath ="//mat-label[text()='Enter Third Party Representative Name']/../../..//textarea[@rows='1']")WebElement sendName;
@FindBy  (xpath ="//span[contains(text(),'approval ')]") WebElement approval;
@FindBy  (xpath ="//span[contains(text(),' Yes')]") WebElement approvalYes;
@FindBy (xpath ="//span[contains(text(),'there a Venue')]") WebElement venue;
@FindBy (xpath ="//ag-grid-angular[@id='hcpGridVGRID']//div//em[@class='fa fa-pencil']") WebElement editVenue;
@FindBy (xpath ="(//span[text()='Venue Type'])[2]")WebElement venueType;
@FindBy (xpath ="//input[contains(@placeholder,'Venue Type')]")WebElement selectvenue;
@FindBy (xpath ="(//span[contains(text(),'Other')])[3]")WebElement venueSelected;
@FindBy (xpath ="//mat-label[contains(text(),'selected \"Other\" for Venue Type ')]/../../..//textarea[@rows='1']")WebElement otherVenue;
@FindBy (xpath ="//mat-label[contains(text(),'Venue N')]/../../..//input[@type='text']")WebElement venueName;
@FindBy (xpath ="//mat-label[contains(text(),'Address')]/../../..//textarea")WebElement venueAddress;
@FindBy (xpath ="(//span[text()='Venue Country'])[2]")WebElement selectCountry;
@FindBy (xpath ="//input[contains(@placeholder,'Venue Country')]")WebElement Countryselected;
@FindBy (xpath ="//span[contains(text(),'India ')]")WebElement selectedIndia;
@FindBy (xpath ="//mat-label[contains(text(),'Venue City')]/../../..//input[@type='text']")WebElement venueCity;
@FindBy (xpath ="//mat-label[contains(text(),'location')]/../../..//textarea[@rows='1']")WebElement location;
@FindBy (xpath ="//*[@id='hcpGridEBGRD']/div/div[2]/div[2]/div[3]/div[1]/div/div[3]/div/a")WebElement EstimatedBudget;
@FindBy (xpath ="(//span[text()='Spend Type'])[2]")WebElement spendType;
@FindBy (xpath ="//input[contains(@placeholder,'Spend Type')]")WebElement selectMeals;
@FindBy (xpath ="//span[contains(text(),'Meals')]")WebElement selectedMeals;
@FindBy (xpath ="//mat-label[text()='Amount']/../../..//input[@type='text']")WebElement amount;
@FindBy (xpath ="(//span[text()='Advisory Board/Expert Meeting'])[2]")WebElement advisoryBoard;
@FindBy (xpath ="//span[contains(text(),'Advisory Board Form')]")WebElement advisoryBoardForm;
@FindBy (xpath ="//span[contains(text(),' Yes')]")WebElement attachingAdvisoryBoardForm;
@FindBy (xpath ="//mat-label[contains(text(),'List the specific advice to be obtained (answer to key questions) to support the objectives - please attach questions to be answered if appropriate')]/../../..//textarea[@rows='1']")WebElement advice;
@FindBy (xpath ="//span[contains(text(),'meetings')]")WebElement haveMeeting;
@FindBy (xpath ="//mat-label[contains(text(),'You selected \"Yes\" for meetings ')]/../../..//textarea[@rows='1']")WebElement yesHaveMeeting;
@FindBy (xpath ="//span[contains(text(),'information')]")WebElement information;
@FindBy (xpath ="//mat-label[contains(text(),'You selected \"Yes\" for any part of the information ')]/../../..//textarea[@rows='1']")WebElement PartOfMeetings;
@FindBy (xpath ="//mat-label[contains(text(),'Describe the criteria ')]/../../..//textarea[@rows='1']")WebElement criteria;
@FindBy (xpath ="//mat-label[contains(text(),'How many Advisors ')]/../../..//input[@type='text']")WebElement noOfAdvisors;
@FindBy (xpath ="//*[@id=\"hcpGridIPLST\"]/div/div[2]/div[2]/div[3]/div[1]/div/div[3]/div/a/em")WebElement tevaAttendance;
@FindBy (xpath ="//mat-label[text()=' Name']/../../..//input[@type='text']")WebElement name;
@FindBy (xpath ="//mat-label[text()=' Title']/../../..//input[@type='text']")WebElement title;
@FindBy (xpath ="//mat-label[text()=' Department']/../../..//input[@type='text']")WebElement department;
@FindBy (xpath ="//span[text()='Save']")WebElement savee;
@FindBy (xpath ="//mat-label[contains(text(),'Specific action to be taken with the advice.')]/../../..//textarea[@rows='1']")WebElement specificactions;


	public AdvisoryBoard(WebDriver driver) 
	{   
		PageFactory.initElements(driver,this);
	}

	public void sendActivityTitle() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		ActivityTitle.sendKeys("abc");
		
     }
	public void selectStartDate() throws InterruptedException
	{Thread.sleep(2000);
		ActivityStartDate.click();
		SelectDate.click();
	}
	public void selectEndDate() throws InterruptedException
	{
		Thread.sleep(2000);
		ActivityEndDate.click();
		SelectDate.click();
		
	}
	public void SelectProjectOrginator() throws InterruptedException
	{
		Thread.sleep(2000);
		projectOrginator.click();
		sendprojectOrginator.sendKeys("originator1@mailinator.com");
		selectprojectOrginator.click();
		
	}
	
	public void selectDesignatedReviewer() throws InterruptedException
	{
		Thread.sleep(2000);
		selectDesReviewer.click();
		sendDesReviewer.sendKeys("harshini.reviewer");
		reviwerSelected.click();
		
	
	}
	
	public void selectCountryResponsible() throws InterruptedException
	{
		countryselect.click();
		sendCountry.sendKeys("India");
		countrySelected.click();
		Thread.sleep(2000);
	
	}
	public void selectTherapeuticArea() throws InterruptedException
	{
		therapeuticArea.click();
		therapeuticAreaSelected.click();
		Thread.sleep(2000);
	
	}
	
	public void selectOtherActivity() throws InterruptedException
	{otherActivity.click();
	otherActivityselectedYES.click();
	Thread.sleep(2000);
	}
	
	public void editActivityDeatails() throws InterruptedException
	{
		editActDetails.click();
		Thread.sleep(20000);
//		WebDriverWait wait=new WebDriverWait(driver, 40);
//		WebElement selectActID= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "(//span[text()='Activity ID'])[3]")));
		selectActID.click();
		IDselected.click();
	}
	
	public void saveActivityID() throws InterruptedException
	{
		IDsave.click();
		Thread.sleep(5000);
		//Actions action = new Actions(driver);
		//action.moveToElement(veevaVaultId).build().perform();
		//newContactLink.click();
	
//		Actions act = new Actions(driver);
//		act.moveToElement(veevaVaultId);
//		act.perform();
     // Actions act = new Actions(driver);
      //act.sendKeys(Keys.PAGE_DOWN).build().perform();

	}
	
	public void setVeevaVaultID() throws InterruptedException
	{
		 WebElement veevaVaultId= driver.findElement(By.xpath("//mat-label[contains(text(),'Veeva')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();",veevaVaultId);
	        veevaVaultId.sendKeys("ABC");
	}
	public void purposeObjective() throws InterruptedException 
	{	Thread.sleep(2000);
		purpose.sendKeys("ABC");
	}
	
	public void clickonActivityDeatils() throws InterruptedException
	{ Thread.sleep(2000);
		actDetails.click();
	}
	
	public void clickonEventType() throws InterruptedException
	{
		evenType.click();
		selEvenType.click();
		clickpage.click();;
	}
	public void thirdPartyRepresentative() throws InterruptedException
	{
		Thread.sleep(2000);
		thirdPartyRepresnt.click();
		otherActivityselectedYES.click();
		
	}
	public void sendThirdPartyName() throws InterruptedException
	{
		Thread.sleep(2000);
		sendName.sendKeys("ABC");
	}
	public void approvalObtained() throws InterruptedException
	{
		Thread.sleep(2000);
		approval.click();
		Thread.sleep(2000);
		approvalYes.click();
	}
	
	public void isThereIsVenue() throws InterruptedException
	{
		venue.click();
		Thread.sleep(2000);
		approvalYes.click();
	}
	
	public void editVenueDetails() throws InterruptedException
	{
		Thread.sleep(2000);
		editVenue.click();
		
	}
	
	
	public void editVEnue() throws InterruptedException
	{
		Thread.sleep(3000);
		venueType.click();
		selectvenue.sendKeys("Other");
		venueSelected.click();
		Thread.sleep(2000);
	}
	
	public void otherVenue() throws InterruptedException
	{
		otherVenue.sendKeys("ABC");
		Thread.sleep(2000);
	}
	
	public void sendVenueName() throws InterruptedException
	{
		venueName.sendKeys("ABC");
		Thread.sleep(2000);
	}
	public void venueAddress() throws InterruptedException
	{
		venueAddress.sendKeys("ABC");
		Thread.sleep(2000);
	}
	public void SelectVenueCountry() throws InterruptedException
	{
		selectCountry.click();
		Countryselected.sendKeys("India");
		selectedIndia.click();
		Thread.sleep(2000);
	}
	public void SelectVenueCity() throws InterruptedException
	{
		 venueCity.sendKeys("ABC");
		 Thread.sleep(2000);
	}
	public void SendLoaction() throws InterruptedException {
		location.sendKeys("ABC");
		Thread.sleep(2000);
	}
	public void saveVenueDetails() throws InterruptedException {
		IDsave.click();
		Thread.sleep(4000);
	}
	public void estimatedBudget() throws InterruptedException {
		EstimatedBudget.click();
		Thread.sleep(2000);
	}
    public void selectSpendtype() {
		spendType.click();
		selectMeals.sendKeys("Meals");
		selectedMeals.click();
	}
	public void sendAmount() throws InterruptedException {
		Thread.sleep(2000);
		amount.sendKeys("200");
		IDsave.click();
		Thread.sleep(2000);
	}
	public void clickonAdvisoryBoard() throws InterruptedException{
		advisoryBoard.click();
		Thread.sleep(2000);
	}
	public void advisoryBoardFormYes() throws InterruptedException
	{   advisoryBoardForm.click();
		attachingAdvisoryBoardForm.click();
		Thread.sleep(2000);
	}
	public void sendAdvice() throws InterruptedException {
		Thread.sleep(2000);
		advice.sendKeys("ABC");
		Thread.sleep(2000);
	}
	public void haveMeetingsYes() throws InterruptedException {
		haveMeeting.click();
		approvalYes.click();
		Thread.sleep(2000);
	}
	public void sendMeetingAddressing() throws InterruptedException {
		yesHaveMeeting.sendKeys("ABC");
		Thread.sleep(2000);
	}
	public void anyOtherInformation() throws InterruptedException {
		information.click();
		approvalYes.click();
		Thread.sleep(2000);
	}
	public void PartOfMeetingsInformation() throws InterruptedException {
		PartOfMeetings.sendKeys("ABC");
		Thread.sleep(2000);
	}
	public void descriptionOfCriteria() throws InterruptedException
	{ criteria.sendKeys("ABC");
		Thread.sleep(2000);
	}
	public void sendNoOfadvisors() throws InterruptedException {
		noOfAdvisors.sendKeys("5");
		Thread.sleep(2000);
	}
	public void editTevaAttendance() throws InterruptedException {
		tevaAttendance.click();
		Thread.sleep(2000);
	}
	public void sendName() {
		name.sendKeys("Jazz");
	}
	public void sendTitle() {
		title.sendKeys("Dr.");
	}
	public void sendDepartment() throws InterruptedException {
		department.sendKeys("operation");
		savee.click();
		Thread.sleep(2000);
     }
	public void SendSpecificAction() throws InterruptedException {
		specificactions.sendKeys("ABC");
		Thread.sleep(2000);
	}
	
	
}
