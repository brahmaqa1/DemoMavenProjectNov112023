package AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemUsersPage 
{
	WebDriver driver;
	
	//1	
	@FindBy(xpath="//label[text()='Username']/../following-sibling::div/input")
	public WebElement UsernameTxtbox;
	
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchBtn;
	
	
	@FindBy(xpath="//span[text()='(1) Record Found']")
	public WebElement RecordFoundTxt;
	
	//p[text()='The selected record will be permanently deleted. Are you sure you want to continue?']
	@FindBy(xpath="//p[text()='The selected record will be permanently deleted. Are you sure you want to continue?']")
	public WebElement deleteRecordTxt;
	
	
	
	//div[@class='orangehrm-modal-footer']/button/i
	@FindBy(xpath="//div[@class='orangehrm-modal-footer']/button/i")
	public WebElement yesDeleteBtn;
	
	
	
	//2 Define constr
	public SystemUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	
	//3 .
	// EnterValueInUserName
	public void EnterValueInUserName(String val)
	{
		System.out.println("Search with  user="+val);
		UsernameTxtbox.sendKeys(val);
	}
	

	/// click Search button
	public void ClickSearch()
	{
		System.out.println("click Search button");
		searchBtn.click();
	}
	
			
		// Verify  '(1) Record Found'  msg is displayed
	
	public void verify1RecordFoundMsg()
	{		
		System.out.println("Verify  '(1) Record Found'  msg is displayed");
		boolean res = false;
		try {
			 res=  RecordFoundTxt.isDisplayed();	
		} 
		catch (NoSuchElementException e) 
		{
			System.out.println("NoSuchElementException.Fail. '(1) Record Found'  msg is  not displayed");
		}
				
		if(res)
		{
			System.out.println("Pass.'(1) Record Found'  msg is displayed");
			
		}
		else
		{
			System.out.println("Fail. '(1) Record Found'  msg is  not displayed");
		}
		
	}
	
	
	// Select given user name 
	public void selectCheckboxForGivenUser(String user) throws InterruptedException
	{
		//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Alice']/preceding::input[1]
		//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Alice']/parent::div/preceding-sibling::div//input
		
		try {
			Thread.sleep(4000);
			System.out.println("select user ="+ user);
//			driver.findElement(By.xpath("//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='" + user+"']/preceding::input[1]")).click();
//			driver.findElement(By.xpath("//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='"+user+"']/parent::div/preceding-sibling::div//input")).click();
			//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Anthony.Nolan']/parent::div/preceding-sibling::div/div
			driver.findElement(By.xpath("//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='"+user+"']/parent::div/preceding-sibling::div/div")).click();
			
		} 
		catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException. Please check user="+ user + " is avaialble");
		}	
		
	}
	
	//				// Click delete image icon
	public void clickDeleteImageForUser(String user) throws InterruptedException
	{
		//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Alice']/parent::div/following-sibling::div[4]//i[contains(@class,'trash')]
		try {
			Thread.sleep(4000);
//			driver.findElement(By.xpath("div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='"+user+"']/parent::div/following-sibling::div[4]//i[contains(@class,'trash')]")).click();
			//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Anthony.Nolan']/parent::div/following-sibling::div[4]//i[contains(@class,'trash')]/..
//			driver.findElement(By.xpath("div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='"+user+"']/parent::div/following-sibling::div[4]//i[contains(@class,'trash')]/..")).click();
			
			String myxpath="//div[@role='rowgroup'][@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='" +user+"']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']";
			System.out.println("click Delete image icon for user="+ user);
			driver.findElement(By.xpath(myxpath)).click();	
			
		} 
		catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException. Please check user="+ user + " is avaialble");
		}	
	}

	//				
	//				// Verify the msg -The selected record will be permanently deleted. Are you sure you want to continue?
	public void verifyDeleteRecordMsgDisplayed()
	{
		boolean res= false;
		
		try {
			Thread.sleep(5000);
			res= deleteRecordTxt.isDisplayed();
		} catch (Exception e) {
			System.out.println("");
			
		}
				
		if(res)
		{
			System.out.println("The selected record will be permanently deleted. Are you sure you want to continue? is displayed");
			
		}
		else
		{
			System.out.println("System.out.println(\"The selected record will be permanently deleted. Are you sure you want to continue? is  not displayed\");");
			
		}
			
	}		

	//				
	//				// Click Yes Delete button
	public void clickYesDeleteBtn()
	{
		System.out.println("clickYesDeleteBtn");
		yesDeleteBtn.click();
	}	

	//				
	//				// Verify Record should not be available in table  or No recods found
	//searchForGivenUser
				

	
	

}
