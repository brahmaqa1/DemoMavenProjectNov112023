package Selenium4Features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotForElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver =  new ChromeDriver();

		//		// open given url ib browser

		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		// Take screen shot of first name text box ele
	File srcfile=	driver.findElement(By.name("firstname")).getScreenshotAs(OutputType.FILE);
		

//		File srcfile = 	driver.findElement(By.name("firstname")).getScreenshotAs(OutputType.FILE);

		File destFile= new File("C:\\brahma\\Practise\\SelniumPractiseNew\\Jul2023WorkSpace\\MavenProjectThroughCommand\\src\\test\\java\\Selenium4Features\\firstNameEleScree.png");
		FileUtils.copyFile(srcfile,destFile) ;// jar --> apache- commons-io 


		//HW Take screen shot for penguin image ?
		
		// HW  take screens shot cars dropdown
		
		//HW  take screens shot or Multi select cars dropdown



		System.out.println("ends ");	


	}

}
