package org.textexcelfilereading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class excelfileread {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\Rajesh\\newneonworkspace\\Test.xlsx"));
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			int colcount = sheet.getRow(0).getLastCellNum();
			System.out.println(rowcount);
			System.out.println(colcount);
			for(int i = 1; i<rowcount;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					String val = sheet.getRow(i).getCell(j).getStringCellValue();

					System.out.println(val);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//creating workbook instance that refers to .xls file  


	}

}
