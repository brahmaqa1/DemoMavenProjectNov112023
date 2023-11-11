package Log4jBasics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

	public static void main(String[] args) throws IOException {
		
		String fname= "C:\\brahma\\Practise\\SelniumPractiseNew\\Jul2023WorkSpace\\MavenProjectThroughCommand\\MyCsvFile2.csv";
		FileReader fr = new FileReader(fname);
		BufferedReader br = new BufferedReader(fr);
		
		String line1= br.readLine();
		String line2= br.readLine();
		String line3= br.readLine();
		System.out.println("lin1="+line1);
		System.out.println("lin2="+line2);
		System.out.println("lin3="+line3);
//		lin1=ram,10,Bng, 100
//				lin2=sita,20, CHN,200
//				lin3=null
		
		// get  Ram 10 Bng 100  without comma's frm lin1=ram,10,Bng, 100
		
		String sarr[]  = line1.split(",");
		for(String val: sarr)
		{
			System.out.println("val from array="+ val);
		}
		

	}

}
