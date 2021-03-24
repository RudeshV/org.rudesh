package org.rudesh.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecutableClass extends BaseClass{
	public static void main(String args[]) throws IOException {
		File f = new File("D:\\Selenium\\org.rudesh\\Excel\\StudentDetails.xlsx");
FileInputStream f1 = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(f1);
		Sheet sheetName = book.getSheet("Rudesh");
		Row cr1 = sheetName.createRow(10);
		Row r1 = sheetName.getRow(10);
		Cell cl = r1.createCell(0);
		cl.setCellValue("Rudesh Veenu Acharya");
		FileOutputStream f2 = new FileOutputStream(f);
		book.write(f2);
		}
	}