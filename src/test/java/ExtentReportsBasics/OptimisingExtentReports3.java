package ExtentReportsBasics;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OptimisingExtentReports3 extends MyTestListner
{
//	ExtentReports exRepo;
//	ExtentTest exTest;
//	
//	@BeforeTest
//	public void generateReport()
//	{
//		// create extent -reports1.html file
//				String reportsFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Jul2023WorkSpace\\MavenProjectThroughCommand\\src\\test\\java\\ExtentReportsBasics\\MyExtentReports3.html"; 
//				// Create object for -ExtentReports class and pass file name
////				ExtentReports exRepo =  new ExtentReports(reportsFile);		
//				 exRepo =  new ExtentReports(reportsFile);
//	}
//	
	
	@Test
	public void testB()
	{
		System.out.println("stmt-1 from testA");
		//		ExtentReports - prededfined class in extentreports.jar
		//		ExtentTest   -prededfined class  "     "

		// create extent -reports1.html file
//		String reportsFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Jul2023WorkSpace\\MavenProjectThroughCommand\\src\\test\\java\\ExtentReportsBasics\\MyExtentReports.html"; 
//		// Create object for -ExtentReports class and pass file name
//		ExtentReports exRepo =  new ExtentReports(reportsFile);		

		//  to start test and display Test name in Report -TC01: Login
//		ExtentTest exTest = exRepo.startTest("TC01: Login Test");
//		 exTest = exRepo.startTest("testA: TC04: Login Test");

		//Log diff msgs in reports(pass,fail, info, warning..etc)
		//log pass msgs in extent report
		Reporter.log("TestB() --> 1.Open Browser");
		Reporter.log("TestB() --> 2.Enter url");

		
		exTest.log(LogStatus.PASS, "1.Open Browser");
		exTest.log(LogStatus.PASS, "2.Enter url");
		//  1.Open Browser
		//2.Enter url

		// Log fail  msg in extent reports		
		//3.enter user name
//		// 4.enter password
//		exTest.log(LogStatus.FAIL, "3.enter user name");
//		exTest.log(LogStatus.FAIL, " 4.enter password");


		//HW  send  some'info' msg in extent reports
		
		//HW send some 'warning' msg  in extent reports

		// to end test  and  pass extent ref var - check results
//		exTest.end
//		exRepo.endTest(exTest);
//		
//		// to view reports -flush(); 
//		// if we dont write  this line, results file will not be created
//		exRepo.flush();

	}
	
	
	
//	
//	@AfterTest
//	public void endReport()
//	{
//		exRepo.endTest(exTest);
//		
//		// to view reports -flush(); 
//		// if we dont write  this line, results file will not be created
//		exRepo.flush();
//	}
	


}
