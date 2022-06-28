package com.utility;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDataProvider {
	
	  XSSFWorkbook wb;
   public excelDataProvider() throws Exception {
	   String path="C:\\Users\\Lenovo\\eclipse-workspace\\Hybrid_framework\\excelData\\testData.xlsx";
	   FileInputStream file=new FileInputStream(path);
	  wb=new XSSFWorkbook(file);
   }
   
	public String getStringData(String SheetName,int row, int cell) {
	  return  wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();	
	}
   
}
