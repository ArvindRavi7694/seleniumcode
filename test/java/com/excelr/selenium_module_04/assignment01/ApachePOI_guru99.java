package com.excelr.selenium_module_04.assignment01;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApachePOI_guru99 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ExcelR_OnlineClasses\\Tools\\BrowersExes\\chrome-win32_V104.0.5112.102\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/V4/index.php");
		
		try {
			FileInputStream fStream = new FileInputStream("testdata/guru99.xlsx");

			// Create workbook instance referencing the file created above
			XSSFWorkbook workbook = new XSSFWorkbook(fStream);

			// Get your first or desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			XSSFRow row = sheet.getRow(1);
			XSSFCell cell1 = row.getCell(0);
			XSSFCell cell2 = row.getCell(1);

			String emailbox = cell1.toString();
			String passwordbox = cell2.toString();

			System.out.println(emailbox +"    "+passwordbox);
			
			WebElement userID = driver.findElement(By.name("uid"));
			userID.sendKeys(emailbox);
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys(passwordbox);
			
			WebElement loginbtn = driver.findElement(By.name("btnLogin"));
			loginbtn.click();
			
			fStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		driver.switchTo().alert().accept();
		
		driver.quit();
	}
}