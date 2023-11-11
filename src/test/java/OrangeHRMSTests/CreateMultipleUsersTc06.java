package OrangeHRMSTests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AllPages.HomePage;
import AllPages.LoginPage;
import Utilities.ExcelUtilities;
import Utilities.TestBase;

public class CreateMultipleUsersTc06 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		TestBase  tb = new TestBase();
		WebDriver driver =	tb.openBrowser();

		// 	loginToAppl
		LoginPage  lpage=  new LoginPage(driver);
	
		lpage.loginToAppl("Admin", "admin123");

		// Verify Home page is displayed or not
		HomePage hpage = new HomePage(driver);
		hpage.isProfileImageDisplayed();


		//  Navigate to admin menu
		hpage.navigateToAdminMenu();

		// Verify System user page is displayed or not
		hpage.verifySystemUserPageDisplayed();


		String xlfile = ".\\TestData.xlsx";
		// read first row data and 

		// read 'UserRole' column data from 'CreateUsers' sheet  and store into ArrayList
		ExcelUtilities  xlutil = new ExcelUtilities();
		ArrayList<String>  UserRoleList = xlutil.readColumnData(xlfile, "CreateUsers", "UserRole");	
		System.out.println("UserRoleList="+UserRoleList);

		// 		// read 'EmployeeName' column data from 'CreateUsers' sheet  and store into ArrayList
		ArrayList<String>  EmployeeNameList = xlutil.readColumnData(xlfile, "CreateUsers", "EmployeeName");	
		System.out.println("EmployeeNameList="+EmployeeNameList);


		// 		// read 'Status' column data from 'CreateUsers' sheet  and store into ArrayList
		ArrayList<String> StatusList =	xlutil.readColumnData(xlfile, "CreateUsers", "Status");
		System.out.println("StatusList="+StatusList);

		// 		// read 'Username' column data from 'CreateUsers' sheet  and store into ArrayList
		ArrayList<String> UsernameList =	xlutil.readColumnData(xlfile, "CreateUsers", "Username");


		// 		// read 'Password' column data from 'CreateUsers' sheet  and store into ArrayList
		ArrayList<String> PasswordList =	xlutil.readColumnData(xlfile, "CreateUsers", "Password");


		// 		// read 'ConfirmPassword' column data from 'CreateUsers' sheet  and store into ArrayList
		ArrayList<String> ConfirmPasswordList =	xlutil.readColumnData(xlfile, "CreateUsers", "ConfirmPassword");

		for(int i=0;i<=UserRoleList.size()-1;i++)
		{
//			hpage.createNewUser("Admin","orange","Enabled","sita","sita","sita");
			
			String userRole=  UserRoleList.get(i);
			String empName = EmployeeNameList.get(i);
			String status = StatusList.get(i);
			String userName = UsernameList.get(i);
			String password = PasswordList.get(i);
			String confirmPwd = ConfirmPasswordList.get(i);
			
			
			hpage.createNewUser(userRole,empName,status,userName,password,confirmPwd);
		}
		



	}

}
