package ExcelReaderBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader3 {

	public static int isSheetExist(String xlFile, String sheetName ) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis = new FileInputStream(xlFile);
		Workbook wb = WorkbookFactory.create(fis);
//		int  indexNo = wb.getSheetIndex("CreateUsersInvialid");
		int  indexNo = wb.getSheetIndex(sheetName);
		System.out.println("Index no=" +indexNo+ " of given sheet="+ sheetName);
		
		if(indexNo >= 0)
		{
			System.out.println("Given sheet=" + sheetName+ " is  available in excel = "+xlFile);
		}
		else
		{
			System.out.println("Given sheet=" + sheetName+ " is not  available in excel = "+xlFile);
		}	
		return indexNo;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		String xlFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Jul2023WorkSpace\\MavenProjectThroughCommand\\TestData.xlsx";
		
		int i =  isSheetExist(xlFile, "Sheet1");// 0
		System.out.println("i="+ i);
		isSheetExist(xlFile, "Sheet2");// 1
		isSheetExist(xlFile, "CreateUsers");//2
		isSheetExist(xlFile, "CreateUsersInvalid");// -1


	}

}
