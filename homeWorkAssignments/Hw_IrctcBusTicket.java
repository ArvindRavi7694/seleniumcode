package com.excelr.mavenlearning.homeWorkAssignments;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw_IrctcBusTicket {
	
	@FindBy(how = How.XPATH, using = "//button[text()='OK']")
	private WebElement ok;

	@FindBy(how = How.XPATH, using = "//nav[@class='nav-bar hidden-xs text-right']//a[normalize-space()='BUSES']")
	private WebElement buses;

	@FindBy(how = How.ID, using = "departFrom")
	private WebElement departFrom;

	@FindBy(how = How.ID, using = "goingTo")
	private WebElement goingTo;
	
//	@FindBy(how = How.XPATH, using = "//*[@id='departDate']")
//	private WebElement date;
	
	@FindBy(how = How.ID, using = "//div[@class='form-in-custom3']/button")
	private WebElement submit;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/");

		Hw_IrctcBusTicket ticket = PageFactory.initElements(driver, Hw_IrctcBusTicket.class);

		ticket.ok.click();
		ticket.buses.click();

		List<String> allWindows = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(allWindows.get(1));

		ticket.departFrom.sendKeys("bengalu");
		ticket.departFrom.sendKeys(Keys.ARROW_UP);
		ticket.departFrom.sendKeys(Keys.ARROW_UP);
		ticket.departFrom.sendKeys(Keys.ENTER);
		
		ticket.goingTo.sendKeys("mysore");
		ticket.goingTo.sendKeys(Keys.ARROW_DOWN);
		ticket.goingTo.sendKeys(Keys.ARROW_DOWN);
		ticket.goingTo.sendKeys(Keys.ENTER);
		
		
//		WebElement date = driver.findElement(By.xpath("//*[@id='departDate']"));
//		date.sendKeys(LocalDate.now().plusDays(7));
		
		System.out.println(LocalDate.now().plusDays(7));
//		ticket.date.click();
//		ticket.date.isSelected();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		ticket.submit.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}


//		driver.quit();
	}

}
