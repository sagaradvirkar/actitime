package com.actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class is a generic class which contains all the methods.
 * @author sagar advirkar
 *
 */
public class FileLibrary {
/**
 * This Method is a Generic Method which is used to read data from property file.
 * @param key
 * @return
 * @throws IOException
 */
	
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commonData.property");
		Properties p=new Properties();
		p.load(fis);
		 String value=p.getProperty(key);
		 return value;
		 
	}
	/**
	 * this method is a generic method which is used to read data from Excel sheet
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}