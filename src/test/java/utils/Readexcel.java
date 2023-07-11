package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.units.qual.Length;

public class Readexcel {

	public static void main(String[] args) throws IOException {

		String fileLocation = "./test-data/First_data.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		XSSFSheet sheet = wbook.getSheetAt(0);

		// XSSFRow row=sheet.getRow(1);
		/*
		 * XSSFCell cell = row.getCell(i); String value = cell.getStringCellValue();
		 * System.out.println(value);
		 */
		int physicalrownunber = sheet.getPhysicalNumberOfRows();
		System.out.println("total no of rows"+physicalrownunber);
		int lastrownumber = sheet.getLastRowNum();
		System.out.println("no of rows"+lastrownumber);
		short lastcellnumber=sheet.getRow(0).getLastCellNum();
		System.out.println("no of cells"+lastcellnumber);

		for (int i = 0; i <=lastrownumber ; i++) {

			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < 2; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft=new DataFormatter();
				String value= dft.formatCellValue(cell);
				//String value = cell.getStringCellValue();
				System.out.println(value);
			}
		}
		wbook.close();

	}

}
