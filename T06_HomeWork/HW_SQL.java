package com.excelr.mavenlearning.T06_HomeWork;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_SQL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ExcelR_OnlineClasses\\Tools\\BrowersExes\\chromedriver_win32_V103.0.5060.134\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/sql/default.asp");

//		List<WebElement> allSQl_Links = driver
//				.findElements(RelativeLocator.with(By.xpath("//a[contains(text(),'SQL')]"))
//						.above(By.xpath("//h2[text()=' Database']")).below(By.xpath("//h2[text()='Tutorial']")));
//		System.out.println(allSQl_Links.size());

//		 for (int index = 0; index < allSQl_Links.size(); index++) {
//		 allSQl_Links.get(index).click();
//		 System.out.println(index + " - " + driver.getTitle());
//		 allSQl_Links =
//		 driver.findElements(RelativeLocator.with(By.xpath("//a[contains(text(),'SQL')]"))
//		 .above(By.xpath("//h2[text()=' Database']")).below(By.xpath("//h2[text()='
//		 Tutorial']")));
//		 }

		List<WebElement> allSQl_Links = driver
				.findElements(By.xpath("//h2[text()=' Database']//preceding-sibling::a[contains(text(),'SQL')]"));
		System.out.println(allSQl_Links.size());
		int i = 0;
		for (int index = 0; index < allSQl_Links.size(); index++) {
			allSQl_Links.get(index).click();
			System.out.println(i++ + " - " + driver.getTitle());
			allSQl_Links = driver
					.findElements(By.xpath("//h2[text()=' Database']//preceding-sibling::a[contains(text(),'SQL')]"));

		}

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.quit();

	}

}
