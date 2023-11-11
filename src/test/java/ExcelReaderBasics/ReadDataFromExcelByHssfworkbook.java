package ExcelReaderBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelByHssfworkbook {

	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		String xlFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Jul2023WorkSpace\\MavenProjectThroughCommand\\TestData.xlsx";
		

//		HSSFWorkbook  - Predefined class -  to read  from  .xls  format 
//		XSSFWorkbook  -Predefined class  --to read from    .xlsx format
		
		FileInputStream  fis = new FileInputStream(xlFile);
		
		XSSFWorkbook xssfwb =  new XSSFWorkbook(fis) ;
		XSSFSheet xssfSh =   xssfwb.getSheet("Sheet1");
		
		// read data from row no, cell no = 0,0 
		String data00 = xssfSh.getRow(0).getCell(0).toString();
		System.out.println("data00="+ data00);
		// data00=ProductName
		
		// HW read data from  row no, cell no = 0,1
		
		
		// HW read data from  row no, cell no = 0,2
		
		
		// HW read data from  row no, cell no =1,0
		
//		HW read data from  row no, cell no =1,1
		
		
		
		
		

	}

}
