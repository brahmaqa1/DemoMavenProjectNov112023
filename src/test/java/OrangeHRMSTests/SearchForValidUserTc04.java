package OrangeHRMSTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AllPages.HomePage;
import AllPages.LoginPage;
import AllPages.SystemUsersPage;

public class SearchForValidUserTc04 {

	public static void main(String[] args) {
		
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
//			
				// logintoAppl  pass user, pwd
				lpage.loginToAppl("Admin", "admin123");

				// Verify Home page is displayed or not
				HomePage hpage = new HomePage(driver);
				hpage.isProfileImageDisplayed();


				//  Navigate to admin menu
				hpage.navigateToAdminMenu();

				// Verify System user page is displayed or not
				hpage.verifySystemUserPageDisplayed();
				
				
				// Search with valid user		
				// EnterValueInUserName
				SystemUsersPage  sysPage =  new SystemUsersPage(driver);
				sysPage.EnterValueInUserName("Admin123");
						

				/// click Search button
				sysPage.ClickSearch();				
						
					// Verify  '(1) Record Found'  msg is displayed
				sysPage.verify1RecordFoundMsg();	

				

	}

}
