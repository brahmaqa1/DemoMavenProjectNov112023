package OrangeHRMSTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;
import Utilities.TestBase;

public class LoginTC01 
{
	
	@Test
	public void LoginTC01()
//	public static void main(String[] args) 
	{

//		// open browser		
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
		
		// 
		TestBase tb = new TestBase();
		WebDriver driver = tb.openBrowser();

		// Enter user name  = Admin
		// Create loginpage class object
		LoginPage  lpage=  new LoginPage(driver);
		lpage.enterUserName("Admin");		

		// enter_Password -admin123
		lpage.enterPassword("admin123");

		// clickLoginBtn'
		lpage.clickLoginBtn();

		// or 

		// logintoAppl  pass user, pwd

		// Verify home page is displayed
		HomePage hPage = new HomePage(driver);
		hPage.isProfileImageDisplayed();

	}

}
