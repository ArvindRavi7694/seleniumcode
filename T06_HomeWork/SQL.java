package com.excelr.mavenlearning.T06_HomeWork;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SQL {
	
	@FindBy(xpath="//h2[text()=' Database']//preceding-sibling::a[contains(text(),'SQL')]")
	private List<WebElement> allSQl;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ExcelR_OnlineClasses\\Tools\\BrowersExes\\chromedriver_win32_V103.0.5060.134\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/sql/default.asp");

		SQL aa =  PageFactory.initElements(driver, SQL.class);
		System.out.println(aa.allSQl.size());
		for(int index=0; index<aa.allSQl.size(); index++) {
			aa.allSQl.get(index).click();
			System.out.println(index +" - "+driver.getTitle());
		}

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.quit();

	}

}
