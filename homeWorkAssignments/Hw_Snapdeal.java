package com.excelr.mavenlearning.homeWorkAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Hw_Snapdeal {
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Computers & Gaming']")
	private WebElement CnG;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Storage']")
	private WebElement Storage;

	@FindBy(how = How.XPATH, using = "//*[@id='csf-Left-Wrapper']/div[2]/div[4]//button[normalize-space()='View More']")
	private WebElement View;

	@FindBy(how = How.XPATH, using = "//label[@for='Capacity_s-8GB']")
	private WebElement EightGB;

	@FindBy(how = How.XPATH, using = "//label[@for='Capacity_s-16GB']")
	private WebElement SixteenGB;

	@FindBy(how = How.XPATH, using = "//*[@id='content_wrapper']/div[9]/div[2]/div[2]/div[7]/div[1]/div/a[1]/span")
	private WebElement FilterSixteenGB;

	@FindBy(how = How.XPATH, using = "//*[@id='content_wrapper']/div[9]/div[2]/div[2]/div[7]/div[1]/div/a/span")
	private WebElement FilterEightGB;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\ExcelR_OnlineClasses\\Tools\\BrowersExes\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");

		Hw_Snapdeal snap = PageFactory.initElements(driver, Hw_Snapdeal.class);
		snap.CnG.click();
		snap.Storage.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement capacity = driver.findElement(
				By.xpath("//*[@id='csf-Left-Wrapper']/div[2]/div[4]//div[@class='filter-type-name lfloat']"));
		js.executeScript("arguments[0].scrollIntoView();", capacity);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		snap.View.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		snap.EightGB.click();
		snap.SixteenGB.click();

		WebElement Filters = driver.findElement(By.xpath("//div[@class='filters-top-selected']"));
		js.executeScript("arguments[0].scrollIntoView();", Filters);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		snap.FilterSixteenGB.click();
		snap.FilterEightGB.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();
	}

}
