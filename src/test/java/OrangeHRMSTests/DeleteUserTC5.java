package OrangeHRMSTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AllPages.HomePage;
import AllPages.LoginPage;
import AllPages.SystemUsersPage;
import Utilities.TestBase;

public class DeleteUserTC5 {

	public static void main(String[] args) throws InterruptedException {
		// open browser		
//		// open url in browser
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//
//		//		//open chrome browser
//		WebDriver driver =  new ChromeDriver();
//		// open url = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//		// .implicitlyWait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		TestBase tb = new TestBase();
		WebDriver driver = tb.openBrowser();

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



		//		// Delete the given user - by selecting Checkbox For GivenUser
		//				
		String username= "Cassidy.Hope";// 
		SystemUsersPage  sysPage =  new SystemUsersPage(driver);
		sysPage.selectCheckboxForGivenUser(username);

		//				// Click delete image icon
		sysPage.clickDeleteImageForUser(username);
		

		//				
		//				// Verify the msg -The selected record will be permanently deleted. Are you sure you want to continue?
		sysPage.verifyDeleteRecordMsgDisplayed();				

		//				
		//				// Click Yes Delete button
		sysPage.clickYesDeleteBtn();
		
		//				
		//	HW 			// Verify given user name  should not be available in table  or No records found
		//searchForGivenUser

		// searchForInvalidUser





	}

}
