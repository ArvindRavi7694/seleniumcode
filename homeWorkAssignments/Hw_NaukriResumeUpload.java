package com.excelr.mavenlearning.homeWorkAssignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Hw_NaukriResumeUpload {
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Register now']") 
	private WebElement Register;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Upload Resume']")
	private WebElement UploadResume;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"D:\\ExcelR_OnlineClasses\\Tools\\BrowersExes\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.naukri.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.manage().window().maximize();
		
		Hw_NaukriResumeUpload job = PageFactory.initElements(driver, Hw_NaukriResumeUpload.class);
		
		job.Register.click();
				
		List<String>  allWindowsList = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(allWindowsList.get(1));
		
		job.UploadResume.click();
		
		StringSelection resumepath = new StringSelection("D:\\ExcelR_OnlineClasses\\Notes\\1.html");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(resumepath, null);
		
		
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e1) {
			e1.printStackTrace();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();
		
		
		
	}
}
