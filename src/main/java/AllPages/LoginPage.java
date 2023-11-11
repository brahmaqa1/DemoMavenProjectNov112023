package AllPages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{


	// 1. define elements with locators(name, id, class, xpath, cssSelector, 
	//		linktext, partial linktext
	//		 tagname..)

	//	@FindBy(locName="loc value") // @FindBy is annonation -used to find ele with given loc name = loc value

	// Define userNameTxtbox with name 	
	@FindBy(name="username")
	public WebElement UsernameTxtBox;

	//Define pwdTxtbox using name
	@FindBy(name="password")
	public WebElement pwdTxtbox;

	//login	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement loginBtn;

	// HW  Forgot your password?
	
//	@FindBy(className = "oxd-text oxd-text--p oxd-alert-content-text")// not working
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	public WebElement InvalidcredentialsTxtMsg;


	// 2. We have to define constructor  and initialise all elements  and pass driver ref var

	public LoginPage(WebDriver driver) //  1 PC
	{
		//// intialise all elments 
		PageFactory.initElements(driver, this);
		// can be used to initalise all elements with locators of current class
	}
	
	//3. define reusable method and utlise all defined elements
	// for each step , i will define seperate method 
	// Enter user name in user name text box
	public void enterUserName(String user)
	{
		System.out.println("Enter user="+ user);
		UsernameTxtBox.sendKeys(user);
	}


	// Enter pwd in pwd text box
	public void enterPassword(String pwd)
	{
		System.out.println("Enter pwd="+ pwd);
		pwdTxtbox.sendKeys(pwd);
	}

	// Click login btn
	public void clickLoginBtn()
	{
		System.out.println("Click Login button");
		loginBtn.click();
	}


	// Define loginToAppl() and pass username, pwd
	public void loginToAppl(String user,String pwd)
	{
		enterUserName(user);
		enterPassword(pwd);
		clickLoginBtn();		
	}
	
	
	//// Verify 'Invalid credentials' msg is displayed
	public void verifyInValidCrednetialsMsg()
	{
		boolean displayed = false;
		try
		{
			 displayed=  InvalidcredentialsTxtMsg.isDisplayed();
			 //  throws NoSuchElementException
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("NoSuchElementException.Fail. InvalidcredentialsTxtMsg is not displayed ");
		}		
		
		if(displayed)
		{//  false
			System.out.println("Pass.Invalid credentials' msg is displayed");
		}
		else
		{
			System.out.println("Fail.'Invalid credentials' msg is not displayed");
		}
		
		
	}
	


}
