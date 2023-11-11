package OrangeHRMSTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AllPages.HomePage;
import AllPages.LoginPage;

public class HomePageNavigationsTc02 {

	public static void main(String[] args) {


		// open browser		
		// open url in browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//		//open chrome browser
		WebDriver driver =  new ChromeDriver();
		// open url = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// .implicitlyWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//  access loginPage class variables + Methods		
		LoginPage lpage =  new LoginPage(driver);
		lpage.enterUserName("Admin");
		lpage.enterPassword("admin123");
		lpage.clickLoginBtn();

		// Verify Home page is displayed or not
		HomePage hPage =  new HomePage(driver);
		hPage.isProfileImageDisplayed();

		//  check navigate menu option

		//	navigateToAdminMenu
		hPage.navigateToAdminMenu();// working

		// Verify 'System Users'  msg is displayed
		hPage.verifySystemUserPageDisplayed();

		//  navigate to Pim menu
		//			hPage.navigateToPIMMenu();// working

		//Hw Verify 'Employee Information'  msg is displayed

		//--------------------------
		// HW Navigate to 'Leave' menu option

		// HW  Verify 'Leave List'  msg is displayed
		
		//---------------------------

		// HW Navigate to 'Time' menu option			
		//
		// HW  Verify 'Select Employee'  msg is displayed
		
		//----------------------------------------

		// HW navigate to  all menu options



	}		


}
