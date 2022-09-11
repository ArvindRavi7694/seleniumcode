package com.excelr.mavenlearning.T06_HomeWork;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class C3_Resize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ExcelR_OnlineClasses\\Tools\\BrowersExes\\chromedriver_win32_V103.0.5060.134\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://elearning.excelr.com/");
		
		Dimension dev = new Dimension(300,720);		
		driver.manage().window().setSize(dev);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Point prt = new Point(600,800);
		driver.manage().window().setPosition(prt);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// driver.close();
		driver.quit();
	}
}
