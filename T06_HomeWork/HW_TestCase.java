package com.excelr.mavenlearning.T06_HomeWork;

import org.openqa.selenium.WebDriver;

public class HW_TestCase {
	public static void main(String[] args) {
		WebDriver driver = HW_BrowserFactory.getAnyBrowser("edge");
		
		try {
			Thread.sleep(7000);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		driver.quit();
	}
}
