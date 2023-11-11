package ExcelReaderBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader2 {

	
	public static String readDataFromExcel(String xlFile,String sheet, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{		
		FileInputStream fis  = new FileInputStream(xlFile);
		Workbook wb =  WorkbookFactory.create(fis);
		Sheet sh =  wb.getSheet(sheet);
		
		String data = sh.getRow(rowNo).getCell(cellNo).toString();
//		System.out.println("Data from row="+ rowNo +",cell no="+ cellNo + " is ="+data);
		return data;
	}

	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//  Apache POI:

		String xlFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Jul2023WorkSpace\\MavenProjectThroughCommand\\TestData.xlsx";

		String data00 = readDataFromExcel(xlFile,"Sheet1",0,0);
		System.out.println("data00="+data00);

		String data01 =  readDataFromExcel(xlFile,"Sheet1",0,1);
		System.out.println("data01="+data01);
		
		String data02 =  readDataFromExcel(xlFile,"Sheet1",0,2);
		System.out.println("data02="+data02);


	}

}
