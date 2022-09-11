package com.excelr.mavenlearning.T06_HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW_BrowserFactory {
	private static WebDriver driver = null ;
	
	public static WebDriver getAnyBrowser(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\ExcelR_OnlineClasses\\Tools\\BrowersExes\\chromedriver_win32_V103.0.5060.134\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\\\ExcelR_OnlineClasses\\\\Tools\\\\BrowersExes\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\\\ExcelR_OnlineClasses\\\\Tools\\\\BrowersExes\\\\edgedriver_win64_V103.0.1264.62\\\\msedgedriver.exe");
			driver = new EdgeDriver();
		}		
		return driver;
	}
}
