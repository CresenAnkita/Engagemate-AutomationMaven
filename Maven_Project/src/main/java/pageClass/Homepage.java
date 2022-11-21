package pageClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import base.BaseClass;


public class Homepage extends BaseClass
{
	@FindBy (xpath ="//span[text()='My Activity Actions']") private WebElement ActvityActions;
	@FindBy (xpath ="//button[contains(text(),' Create')]") private WebElement CreateActivity;
	@FindBy (xpath = "//span[contains(@class,'mat-select')]") private WebElement clickActivityType;
    @FindBy (xpath = "//span[@class='mat-option-text']") private List<WebElement> selectActivityType;
    @FindBy (xpath = "//span[text()=' Advisory Board/Expert Meeting ']") private WebElement AdvisoryBoard;
  
   
	public Homepage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);	
	
	}

	public void clickonMyActivityActions() throws InterruptedException
	{
	
		ActvityActions.click();
		
		
	}
	
	public void createActivity() throws InterruptedException
	{
		Thread.sleep(5000);
		CreateActivity.click();
	}
	
	public void clickonActivityType()
	{
		clickActivityType.click();
	}
	
	
	public void selectActivityTYPE()
	{
		
		for(WebElement list:selectActivityType)
		{
			String list1=list.getText();
		    System.out.println(list1);
		    //System.out.println("list is"+list.getSize());
		   
		}
	}
	
	public void clickOptionFromList()
	{
		AdvisoryBoard.click();
		
	}
	
	
	
	
	
	
}
