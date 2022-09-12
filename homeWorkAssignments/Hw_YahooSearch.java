package com.excelr.mavenlearning.homeWorkAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw_YahooSearch {

	@FindBy(how = How.ID, using = "yschsp")
	private WebElement search;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in.search.yahoo.com/?fr2=inr");

		Hw_YahooSearch hoo = PageFactory.initElements(driver, Hw_YahooSearch.class);
		hoo.search.sendKeys("text");

		List<WebElement> searchList = driver.findElements(By.xpath("//*[@id='sbq-wrap']//ul/li"));
		System.out.println(searchList.size());

		WebElement firstword = driver.findElement(By.xpath("//ul[@class='sa-tray-list-container']/li[1]/span"));
		String firstW = firstword.getText();
		int fcount = firstW.length();
		System.out.println(firstW+" - "+fcount);

		WebElement secondword = driver.findElement(By.xpath("//ul[@class='sa-tray-list-container']/li[2]/span"));
		String secondW = secondword.getText();
		int scount = secondW.length();
		System.out.println(secondW +" - "+scount);

		WebElement thirdword = driver.findElement(By.xpath("//ul[@class='sa-tray-list-container']/li[3]/span"));
		String thirdW = thirdword.getText();
		int thcount = thirdW.length();
		System.out.println(thirdW+" - "+thcount);

		WebElement fourthword = driver.findElement(By.xpath("//ul[@class='sa-tray-list-container']/li[4]/span"));
		String fourthW = fourthword.getText();
		int focount = fourthW.length();
		System.out.println(fourthW+" - "+focount);

		WebElement fifthword = driver.findElement(By.xpath("//ul[@class='sa-tray-list-container']/li[5]/span"));
		String fifthW = fifthword.getText();
		int ficount = fifthW.length();
		System.out.println(fifthW+" - "+ficount);

		WebElement sixthword = driver.findElement(By.xpath("//ul[@class='sa-tray-list-container']/li[6]/span"));
		String sixthW = sixthword.getText();
		int sicount = sixthW.length();
		System.out.println(sixthW+" - "+sicount);

		WebElement seventhword = driver.findElement(By.xpath("//ul[@class='sa-tray-list-container']/li[7]/span"));
		String seventhW = seventhword.getText();
		int secount = seventhW.length();
		System.out.println(seventhW+" - "+secount);

		WebElement eightword = driver.findElement(By.xpath("//ul[@class='sa-tray-list-container']/li[8]/span"));
		String eightW = eightword.getText();
		int ecount = eightW.length();
		System.out.println(eightW+" - "+ecount);

		WebElement ninthword = driver.findElement(By.xpath("//ul[@class='sa-tray-list-container']/li[9]/span"));
		String ninthW = ninthword.getText();
		int ncount = ninthW.length();
		System.out.println(ninthW+" - "+ncount);

		WebElement tenthword = driver.findElement(By.xpath("//ul[@class='sa-tray-list-container']/li[10]/span"));
		String tenthW = tenthword.getText();
		int tecount = tenthW.length();
		System.out.println(tenthW+" - "+tecount);
		
		ArrayList<Integer> words = new ArrayList();
		words.add(fcount);
		words.add(scount);
		words.add(thcount);
		words.add(focount);
		words.add(ficount);
		words.add(sicount);
		words.add(secount);
		words.add(ecount);
		words.add(ncount);
		words.add(tecount);
		
		
//		driver.quit();
	}

}
