package OrangeHRMSTests;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;

public class CreateNewUserTc03 
{
	
	@Test
	public void CreateNewUserTc03() throws InterruptedException
//	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		// open browser		
		// open url in browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//		//open chrome browser
		WebDriver driver =  new ChromeDriver();
		// open url = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// .implicitlyWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		//  access logiPAge class variables + Methods	
		// 	loginToAppl
		LoginPage  lpage=  new LoginPage(driver);
//		lpage.enterUserName("Admin");		
//
//		// enter_Password -admin123
//		lpage.enterPassword("admin123");
//
//		// clickLoginBtn'
//		lpage.clickLoginBtn();

		// or 
		// logintoAppl  pass user, pwd
		lpage.loginToAppl("Admin", "admin123");

		// Verify Home page is displayed or not
		HomePage hpage = new HomePage(driver);
		hpage.isProfileImageDisplayed();


		//  Navigate to admin menu
		hpage.navigateToAdminMenu();

		// Verify System user page is displayed or not
		hpage.verifySystemUserPageDisplayed();

/*
		//Click add +   button
		//				oxd-button oxd-button--medium oxd-button--secondary
		hpage.clickAddBtn();
		


		// Verify - Add User page is displayed
		hpage.verifyAddUserpageDisplayed();

		//Select some value (Admin) in User Role dropdown
		hpage.selectUserRole("Admin");


		// or selectUserRole-ESS  -->  
//		hpage.selectUserRole("ESS");// working

		// type some employee name(Orange  Test) - in "Employee Name" txt box
		hpage.enterEmployeeName("Orange  Test");
		//                       Orange  Test

		// Select some status =Enabled
		hpage.selectStatus("Enabled");

		// Type some value in 'user name' text box 
		//  Ramarao123  ramrao9868
		Random  r = new Random();
		int randomno= r.nextInt(1000);		
		String user= "ramarao" + randomno;
		hpage.enterUserName(user);


		// Type some value in 'password'  text box
		hpage.EnterValueInPassword("admin@123");

		//// Type some value in 'Confirm password'  text box
		hpage.EnterValueInConfirmPassword("admin@123");

		Thread.sleep(3000);
		
		// click on Save button
		hpage.clickSaveBtn();

		// Verify  new user name is exist in table or not
		hpage.verifyUserExistInTable(user);
*/		
		// or 
		
//		hpage.createNewUser("Admin","Orange  Test","Enabled","ramarao","admin@123","admin@123");
		hpage.createNewUser("ESS","Orange  Test","Disabled","Sita","admin@123","admin@123");
		hpage.createNewUser("Admin","Orange  Test","Enabled","Rajaram","admin@123","admin@123");



	}


}
