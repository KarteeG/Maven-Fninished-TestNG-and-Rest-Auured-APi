package com.datadriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void read_Particular_Data() throws IOException {

		File f = new File("E:\\Data Driven Working\\test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);
		}
		w.close();
	}

	public static void all_Data() throws Throwable {
		File f = new File("E:\\\\Data Driven Working\\\\test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String cellValue = cell.getStringCellValue();
					System.out.println(cellValue);
				} else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int value = (int) numericCellValue;
					System.out.println(value);
				}
			}
			w.close();
		}

	}

	public static void particular_Row_Data() throws Throwable {
		File f = new File("E:\\\\Data Driven Working\\\\test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(9);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			} else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int vlaue = (int) numericCellValue;
				System.out.println(vlaue);
			}
		}
		w.close();
	}


	public static void particularColoumnData() throws Throwable {
		File f = new File("E:\\\\\\\\Data Driven Working\\\\\\\\test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(1);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			} else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int vlaue = (int) numericCellValue;
				System.out.println(vlaue);
			}
		}
		w.close();
		


	}

	public static void main(String[] args) throws Throwable {

		System.out.println("Particular Data:-");
		read_Particular_Data();
		System.out.println("-------------------------------------");
		System.out.println("All Data:-");
		all_Data();
		System.out.println("-------------------------------------");
		System.out.println("Particular Row Data:-");
		particular_Row_Data();
		System.out.println("-------------------------------------");
		System.out.println("Particular Coloum Data:-");
		particularColoumnData();
		System.out.println("-------------------------------------");

	}

}
