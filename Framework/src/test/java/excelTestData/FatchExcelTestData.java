package excelTestData;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class FatchExcelTestData {
	
	public static void main(String[] args) throws IOException  {
		
		//create a file class object from java.io and pass the file path in the parameter to open the xlsx file :
	try {	
		String filePath = "/Users/moamin/eclipse-workspace02/Framework/src/test/resources/Excel_testData/Demo_CustomerDataForFrameWork.xlsx";
		
		File file = new File(filePath);
		
		//create a FileinputStream class object :

		FileInputStream inputStream = new FileInputStream(file);
		
	//	FileOutputStream outputStream = new FileOutputStream(file);
		
		
		
		//Creating instamce for XSSFWorkbook 
		XSSFWorkbook testWB = new XSSFWorkbook(inputStream);
		
		//creating XSSFSheet object to get to the exact sheet 
		XSSFSheet sheet = testWB.getSheet("Registration");
		
		
		//get all the row number :
		int rowCount = sheet.getLastRowNum()- sheet.getFirstRowNum();
		
		
		System.out.println(rowCount);
		
		String email = sheet.getRow(3).getCell(2).getStringCellValue();
		String pass = sheet.getRow(3).getCell(3).getStringCellValue();
//		System.out.println(email +" ; "+ pass);
		
		
		//sheet.createRow(15).set
		
		sheet.getRow(6).createCell(15).setCellValue("passed");
		
		sheet.getRow(7).createCell(15).setCellValue("passed");
		
		sheet.getRow(5).createCell(15).setCellValue("passed");
		
	
		FileOutputStream output = new FileOutputStream(file);
		
		testWB.write(output);
		
		output.close();
		
		System.out.println("Editing is Successfull");
		
		
	}
	
	catch (Exception e) {
		
		e.printStackTrace();
		
	}
		
		
	}

}
