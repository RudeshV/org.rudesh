package org.rudesh.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("D:\\Selenium\\org.rudesh\\Excel\\Credentials.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(1);
		Cell cell = r.getCell(0);
		String s1 = cell.getStringCellValue();
		System.out.println(s1);
		Thread.sleep(5000);
		// chromeBrowser();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lauchUrl("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(s1);
		WebElement userPass = driver.findElement(By.id("pass"));
		Row r1 = sh.getRow(1);
		Cell cell2 = r1.getCell(1);
		String s2 = cell2.getStringCellValue();
		userPass.sendKeys(s2);
		int rowCount = sh.getLastRowNum();
	Row createRow = sh.createRow(++rowCount);
	short cellCount = createRow.getLastCellNum();
	Cell createCell = createRow.createCell(++cellCount);
	FileOutputStream fo = new FileOutputStream(f);
	createCell.setCellValue("Sucessfully Login");
	createCell.setCellValue("Thanks");
	book.write(fo);
		System.out.println("Sucessfully Login");
		
	}

}
