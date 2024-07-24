package com.NovemberProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Driven {
	static void DrivenTest() throws IOException {
		File f = new File(
				"T:\\GreensTechnology\\eclipse-workspace\\NovemberProject\\Excel\\Suresh_Invoice-September&October-2022.xls");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new HSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("August-2022");
		Row row = sheet.getRow(35);
		Cell cell = row.getCell(2);
		CellType ct = cell.getCellType();
		if (ct.equals(CellType.STRING)) {
			String strCellValue = cell.getStringCellValue();
			System.out.println(strCellValue);
		}
		else if (ct.equals(CellType.NUMERIC)) {
			double numCellValue = cell.getNumericCellValue();
			int value = (int) numCellValue;
			System.out.println(value);
		}
	}

	public static void main(String[] args) throws Exception {
		DrivenTest();
	}

}
