package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OptimisingLog4jBasics1 extends TestBase
{

	@Test
	public void LoginTC1()
	{
		System.out.println("1.Open chrome browser");
		System.out.println("2.Enter user name");
		System.out.println("3.Enter pwd");
		System.out.println("4.click login button");
		System.out.println("5.Verify Home page is displayed");
		
		// Testng :send msgs in testNG reports 
		//  2. index.html 2. emailable-report.html
//		Reporter.log("");
		Reporter.log("1.Open chrome browser");
		Reporter.log("2.Enter user name");
		Reporter.log("3.Enter pwd");
		Reporter.log("4.click login button");
		Reporter.log("5.Verify Home page is dispalyed");
		
		// Log msgs in Extent reports
//		  ExtentReports, ExtentTest

	// to log msgs in logger files -Logger.getLogger("Ram");
//		Logger log =  Logger.getLogger("Ram");
		
		// log msgs - debug()
		
		
//		("LoginTC1 -started");
//		("1.Open chrome browser");
//		("2.Enter user name");
//		("3.Enter pwd");
//		("4.click login button");
//		("5.Verify Home page is dispalyed");	
		log.debug("LoginTC1 -started");
		log.debug("1.Open chrome browser");
		log.debug("Debug--> 2.Enter user name");
		log.info("info -> 2.Enter user name");
		log.error("error -> 2.Enter user name");
		
		
		
	}

}
