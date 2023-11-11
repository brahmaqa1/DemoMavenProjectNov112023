package AllPages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{


	WebDriver driver;//  defaul val = null // instance 
	//  int - default value -0
	// float --> 0.0
	// string --> null
	// class,interface ref var  --> null

	// 1. Define all elements with locators  using @Findby annot

	// Define profileImg with className 
	@FindBy(className = "oxd-userdropdown-img")
	public WebElement profileImg;
	

	//// Define adminMenu xpath
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement adminLinkMenu;

	// Define pimMenu;
	@FindBy(xpath = "//span[text()='PIM']")
	public WebElement pimMenu;

	// system user page  -systemUserTxt;  using xpath 
	@FindBy(xpath="//h5[text()='System Users']")
	public WebElement systemUserTxt;
	
// addUserTxt	
	@FindBy(xpath="//h6[text()='Add User']")
	public WebElement addUserTxt;


	//		addBtn;	 classname,xpath
//	@FindBy(className = "oxd-button oxd-button--medium oxd-button--secondary")// not working
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addBtn;
	

	// clikAddBt //butt   oxd-button oxd-button--medium oxd-button--secondary']

	// addUserTxt using xpath


	// userRoleDropdown; using xpath //label[text()='User Role']/parent::div/following-sibling::div
	// 
	@FindBy(xpath = "//label[text()='User Role']/parent::div/following-sibling::div//i")
	public WebElement userRoleDropdown;	
	

	//adminValInuserRoleDropdown; usin xpath= //div[@role='listbox']//*[text()='Admin']
	//
	@FindBy(xpath = "//div[@role='listbox']//*[text()='Admin']")
	public WebElement adminValInuserRoleDropdown;	

	//Exception in thread "main" org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //label[text()='User Role']/parent::div/following-sibling::div/following-sibling::div[@role='listbox']']//*[text()='Admin'] because of the following error:
	//		SyntaxError: Failed to execute 'evaluate' on 'Document': The string '//label[text()='User Role']/parent::div/following-sibling::div/following-sibling::div[@role='listbox']']//*[text()='Admin']' is not a valid XPath expression.
	//				  (Session info: chrome=114.0.5735.199)
	// note: when we give invalid xpath, it throws 'InvalidSelectorException'

	//employeeNameTxtboxEle xpath =//input[@placeholder='Type for hints...']
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement employeeNameTxtboxEle;	
	
	@FindBy(xpath = "//*[text()='Orange  Test']")
	public WebElement valInEmployeeNameTextbox;	
	 


	//statusArrowBtn;
	@FindBy(xpath = "//label[text()='Status']/parent::div/following-sibling::div//i")
	public WebElement statusArrowBtn;
	
	@FindBy(xpath = "//div[@role='listbox']//*[text()='Enabled']")
	public WebElement EnabledValInuserRoleDropdown;	
	
	@FindBy(xpath = "//div[@role='listbox']//*[text()='Disabled']")
	public WebElement DisabledValInuserRoleDropdown;	
	
	
	//UsernameTxtbox //label[text()='Username']/parent::div/following-sibling::div/input
//	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active oxd-input--error']")/// not working
	@FindBy(xpath = "//label[text()='Username']/parent::div/following-sibling::div/input")/// not working
	public WebElement UsernameTxtbox;


	//PasswordTxtbox;	
	@FindBy(xpath = "//label[text()='Password']/parent::div/following-sibling::div/input")
	public WebElement PasswordTxtbox;

	//ConfirmPasswordTxtbox;	
	@FindBy(xpath = "//label[text()='Confirm Password']/parent::div/following-sibling::div/input")
	public WebElement ConfirmPasswordTxtbox;

	//saveBtn;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement saveBtn;

	//searchBtn;

	////div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Admin']
	@FindBy(xpath = "//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Admin']")
	public WebElement userColData;


	//**************************

	// 2. We have to define constructor  and initialise all elements 
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		System.out.println("driver="+driver);
		this.driver =  driver;
		// referring current class driver refer var =   actual chrome browser obj address
	}


	//3 utilise all elements in resuable methods
	// // check the profile image is displayed in home page
//	if Profile image is displayed- display -Login is succesfull
//	else - Login is not succesfull
	
	public void isProfileImageDisplayed()
	{
		boolean isProfileImgDisplayed= profileImg.isDisplayed();
		
		if(isProfileImgDisplayed)
		{
			System.out.println("Login is succesfull");
		}
		else
		{
			System.out.println("Login is not succesfull");
		}
		
	}


	// Navigate to diff menu options
	// Navigate to Admin menu
	public void navigateToAdminMenu()
	{
		System.out.println("Click admin Link in Home page");
		adminLinkMenu.click();
	}


	// navigateToPIMMenu
	public void navigateToPIMMenu()
	{
		System.out.println("Click 'PIM' Link in Home page");
		pimMenu.click();
	}


	//  verifySystemUserPageDisplayed
	public void verifySystemUserPageDisplayed()
	{
		boolean res= false;
		System.out.println("verifySystemUserPageDisplayed");
		try {
			 res= systemUserTxt.isDisplayed();
			// handle exception
			
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException.Unable to find systemUserTxt .Plz check locator in page ");
		}
		
		
		if(res)
		{
			System.out.println("Pass. System Users page is displayed");
		}
		else
		{
			System.out.println("Fail. System Users page is not displayed");
		}
		
		
	}


	//clickAddBtn
	public void clickAddBtn()
	{
		System.out.println("clickAddBtn  in System user page");
		addBtn.click();		
	}



	//verifyAddUserpageDisplayed
	public void verifyAddUserpageDisplayed()
	{
		System.out.println("verifyAddUserpageDisplayed");
		boolean res = false;
		try {
			 res=  addUserTxt.isDisplayed();	
			// handle Excpetion
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException.Please check locator");
		}
		
		if(res)
		{
			System.out.println("Pass. Add Users page is displayed");
		}
		else
		{
			System.out.println("Fail. Add Users page is not displayed");
		}
		
	}



	// 	selectUserRole("ESS")
	public void selectUserRole(String userRole) throws InterruptedException
	{
		System.out.println("Click user role dropdown");
		userRoleDropdown.click();
		Thread.sleep(3000);
		
		System.out.println("Click "+driver +"  val in user role dropdown");
//		adminValInuserRoleDropdown.click();
		String myxpath ="//div[@role='listbox']//*[text()='" +userRole +"']";
		System.out.println("myxpath="+myxpath);
		System.out.println("driver="+ driver);// null
		
		driver.findElement(By.xpath(myxpath)).click();	
		// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)"
		//because "this.driver" is null
//		at AllPages.HomePage.selectUserRole(HomePage.java:222)
		//
		// null * any method --> java.lang.NullPointerException: 
		
	}





	// type some employee name(Orange test) - in Employee Name txt box
		public void enterEmployeeName(String val) throws InterruptedException
		{
			System.out.println("Select empname="+ val);
			employeeNameTxtboxEle.sendKeys(val);
			
//			valInEmployeeNameTextbox.click();			
			
			try {
				driver.findElement(By.xpath("//*[text()='"+val+"']")).click();
				Thread.sleep(6000);
			} catch (NoSuchElementException e) {
				System.out.println("Fail.NoSuchElementException. Unable to select emp name ="+val);
			}
			
			
		}
	

	// Select some status =Enabled
	//			selectStatus("Enabled")
	//			selectStatus("Disabled");
		public void selectStatus(String status) throws InterruptedException
		{
			System.out.println("click Status dropdown");
			statusArrowBtn.click();
			Thread.sleep(3000);
//			if(status.equals("Enabled"))
//			{
//				EnabledValInuserRoleDropdown.click();
//			}
//			if(status.equals("Disabled"))
//			{
//				DisabledValInuserRoleDropdown.click();
//			}
			System.out.println("Click "+status+" in status dropdown");
			driver.findElement(By.xpath("//div[@role='listbox']//*[text()='"+status+"']")).click();
			
		}


	// Type some value in user name text box  
		///input[@class='oxd-input oxd-input--active oxd-input--error']
		public void enterUserName(String user) throws InterruptedException
		{
			System.out.println("Enter user ="+ user);
			UsernameTxtbox.sendKeys(user);			
		}

	// Type some value in password  text box
	//			EnterValueInPassword("Test@123321")
		public void EnterValueInPassword(String val) throws InterruptedException
		{
			System.out.println("Enter pwd ="+ val);
			PasswordTxtbox.sendKeys(val);
					
		}


	//// Type some value in Confirm password  text box
	//EnterValueInConfirmPassword("Test@123321")
		public void EnterValueInConfirmPassword(String val) throws InterruptedException
		{
			System.out.println("Enter Confirm password ="+ val);
			ConfirmPasswordTxtbox.sendKeys(val);
					
		}

	// clikc on Save button
		public void clickSaveBtn()
		{
			System.out.println("click Save btn");
			saveBtn.click();
		}

		// Verify user name is exist in table or not
		
		public void verifyUserExistInTable(String user)
		{
			////div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='sita']
			WebElement ele = null;
			try {
				 ele = driver.findElement(By.xpath("//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='"+user +"']"));
			} catch (NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Fail.NoSuchElementException. Unable to find the user="+ user);
			}
			
			
			if(ele.isDisplayed())
			{
				System.out.println("Pass.Given user="+ user + " is exist in table");
			}
			else
			{
				System.out.println("Fail.Given user="+ user + " is exist in table");
			}
			
		}
		

	//searchForGivenUser
		
		
		// define 	searchForInvalidUser()  and pass user
			
		// Enter user in UsernameTxtbox
					
//					
//					// click Search button			
			
					
			// check isNoRecordMsgDisplayed
		// createNewUser("Admin","Orange  Test","Enabled","ramarao","admin@123","admin@123")
		public void createNewUser(String userRole, String empName,String status,String userName,String pwd ,String confirmPwd) throws InterruptedException
		{
			
			//Click add +   button
			//				oxd-button oxd-button--medium oxd-button--secondary
			clickAddBtn();		


			// Verify - Add User page is displayed
			verifyAddUserpageDisplayed();

			//Select some value (Admin) in User Role dropdown
			selectUserRole(userRole);


			// or selectUserRole-ESS  -->  
//			hpage.selectUserRole("ESS");// working

			// type some employee name(Orange  Test) - in "Employee Name" txt box
			enterEmployeeName(empName);
			//                       Orange  Test

			// Select some status =Enabled
			selectStatus(status);

			// Type some value in 'user name' text box 
			//  Ramarao123  ramrao9868
			Random  r = new Random();
			int randomno= r.nextInt(1000);		
			String user= userName + randomno;
			enterUserName(user);


			// Type some value in 'password'  text box
			EnterValueInPassword(pwd);

			//// Type some value in 'Confirm password'  text box
			EnterValueInConfirmPassword(confirmPwd);

			Thread.sleep(3000);
			
			// click on Save button
			clickSaveBtn();

			// Verify  new user name is exist in table or not
			verifyUserExistInTable(user);

		}



}
