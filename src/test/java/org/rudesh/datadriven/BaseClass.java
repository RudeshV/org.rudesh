package org.rudesh.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;

	public static void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\org.rudesh\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
}
	
	public static void lauchUrl(String url) {
driver.get(url);
	}
	
	public static void maximize() {
driver.manage().window().maximize();
	}
	
	public static void pageTitle() {
driver.getTitle();
	}
	
	
}
