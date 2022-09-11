package com.excelr.mavenlearning.T06_HomeWork;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class C2_Windows_Count_n_Title {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ExcelR_OnlineClasses\\Tools\\BrowersExes\\chromedriver_win32_V103.0.5060.134\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://elearning.excelr.com/");
		
		System.out.println(driver.getTitle());
		
	//	ChromeDriver tab = new ChromeDriver();
	//	tab.get("https://9gag.com/");
		
		//driver.getWindowHandle().size();
		Set<String> sd = driver.getWindowHandles();
		System.out.println(sd.size());		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// driver.close();
		driver.quit();
	//	tab.quit();	
	}
}
