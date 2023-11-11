package ExtentReportsBasics;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class MyTestListner implements ITestListener
{
	public static ExtentReports exRepo;
	public static ExtentTest exTest;
	
	
	@Override
	public void onStart(ITestContext context) 
{
		//		ITestListener.super.onStart(context);
		//exRep =  new ExtentReports(ResFile);
		// Reports will be created only once time
		String reportsFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Jul2023WorkSpace\\MavenProjectThroughCommand\\src\\test\\java\\ExtentReportsBasics\\MyExtentReportsOne.html";
		
		// create date class obj 
		Date d = new Date();
System.out.println("d="+d);
	     //Fri Oct 27 08:54:07 IST 2023
			// Remove spaces and :  -->  Replace space  by--> emptval
			//                           Replace  : --> UnderScore

	//replace space by _
	                       //

	//replace : by _

		String sdate = d.toString();
		sdate= sdate.replace(" ", "");
		sdate= sdate.replace(":", "_");// FriOct2708_54_07IST2023

		
//		String reportsFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Jul2023WorkSpace\\MavenProjectThroughCommand\\src\\test\\java\\ExtentReportsBasics\\MyExtentReport"+sdate+ ".html";
		
		// Create object for -ExtentReports class and pass file name
//		ExtentReports exRepo =  new ExtentReports(reportsFile);		
		 exRepo =  new ExtentReports(reportsFile);
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
		//  gets executed for each @Test Method
//		exTest = exRepo.startTest("testA: TC01: Login Test");

		// get Test Method name in run time
		String TestMethodName= result.getName();
		System.out.println("TestMethodName="+TestMethodName);
		
		exTest = exRepo.startTest(TestMethodName);
		
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
// at end - we have to endtest and 
			exRepo.endTest(exTest);
		
		// to view reports -flush(); 
		// if we dont write  this line, results file will not be created
		exRepo.flush();
		
	}
	
}
