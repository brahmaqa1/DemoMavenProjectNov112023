package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Log4jBasics2 {


	@Test
	public void CreateOrder()
	{
		// Log msgs in Extent reports
		//		  ExtentReports, ExtentTest
		Logger  log =  Logger.getLogger("Sita");

		// log msgs
		//CreateOrder -started//
//		1.Search for Product
//		2.Add qty  
//		3. Add to cart and Proceed with payment 
		
		log.debug("CreateOrder -started");
		log.debug("1.Search for Product");
		log.debug("2.Add qty  ");
		log.debug("3. Add to cart and Proceed with payment ");

	}

}

