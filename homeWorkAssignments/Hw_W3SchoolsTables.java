package com.excelr.mavenlearning.homeWorkAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw_W3SchoolsTables {
	
	@FindBy(how = How.XPATH, using = "//input[@id='search2']")
	private WebElement searchBox;
	
	@FindBy(how = How.XPATH, using = "//div[@class='gsc-results-wrapper-overlay gsc-results-wrapper-visible']/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]//a")
	private WebElement htmlTables;
	
	@FindBy(how = How.XPATH, using = "//div[@id='main']/div[3]/a")
	private WebElement tryItYourself;
	
	@FindBy(how = How.XPATH, using = "//iframe[@id='iframeResult']")
	private WebElement frameelement;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/");
		
		Hw_W3SchoolsTables w3 = PageFactory.initElements(driver, Hw_W3SchoolsTables.class);
		
		w3.searchBox.sendKeys("tables");
		w3.searchBox.sendKeys(Keys.ENTER);
		
		w3.htmlTables.click();
		w3.tryItYourself.click();
		
		List<String> allWindows = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(allWindows.get(1));
		
		driver.switchTo().frame(w3.frameelement);		
		
		List<WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		System.out.println(rows.size());
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		driver.quit();
	}


}
