package OrangeHRMSTests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GetAllFAQFromJavaNotes {
	
	
	

	public static void main(String[] args) throws IOException {
		
	
				File f = new File("C:\\brahma\\Practise\\SelniumPractiseNew\\NovSeleniumBatchWorkSpace\\JavaNovBatchProject\\src\\FileHandlingBasics\\TestData.txt");

				
				FileReader fr = new FileReader(f);
				BufferedReader br =  new BufferedReader(fr);
//				br.readLine();
				while(br.readLine()!=null)
				{
					System.out.println("all lines from notepad ="+  br.readLine());
					
					
				}
				
	}

}
