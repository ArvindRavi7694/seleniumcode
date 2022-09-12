package com.excelr.mavenlearning.T06_HomeWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class C1_FullScreen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ExcelR_OnlineClasses\\Tools\\BrowersExes\\chromedriver_win32_V103.0.5060.134\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://elearning.excelr.com/");
		driver.manage().window().fullscreen();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// driver.close(); //closes only current tab.
		driver.quit();	   //closes all the tabs i.e. the whole window.
	}
}
