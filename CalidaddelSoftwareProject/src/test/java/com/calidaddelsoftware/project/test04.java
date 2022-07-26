package com.calidaddelsoftware.project;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test04 {

	//private WebDriver driver;
	
		WebDriver driver=null;
		//Locators login
		By EmailLocator= By.xpath("//*[@id=\"Email\"]");
		By PasswordLocator= By.xpath("//*[@id=\"Password\"]");
		By InputloginLocator= By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button");
		By InputloginLocator1= By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button");
		// Locators Reports - Products never purchased 
		By ReportLocator= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[9]/a/p");
		By ProdNeverPurchasedLocator= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[9]/ul/li[4]/a/i");
		By ProdNeverSearch= By.xpath("/html/body/div[3]/div[1]/section/div/div/div/div[1]/div/div[1]");
		By Search= By.xpath("/html/body/div[3]/div[1]/section/div/div/div/div[1]/div/div[1]/div[1]");
		By SearchCategoryLocator= By.xpath("//*[@id=\"SearchCategoryId\"]");
		By CategComputLocator = By.xpath("//*[@id=\"SearchCategoryId\"]");
		By CategComputLocator02 = By.xpath("//*[@id=\"SearchCategoryId\"]/option[3]");
		By CalendarStartLocator = By.xpath("//*[@id=\"StartDate\"]");
		By StartDateLocator = By.xpath("//*[@id=\"93d01dea-2a17-45d9-8744-d423f46e6a1f_cell_selected\"]/a");
		By EndDateLocator = By.name("EndDate");
		By RunReportLocator = By.id("search-neversoldreport"); 
		By RunReportLocator02 = By.xpath("//*[@id=\"search-neversoldreport\"]");
		// Locators Reports - Low stock
		By ReportLocator02= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[9]/a/p");
		By LowStockLocator= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[9]/ul/li[2]/a/p");
		By ViewProductLocator= By.xpath("//*[@id=\"products-grid\"]/tbody/tr/td[5]/a");
		By ProductInfoLocator= By.xpath("//*[@id=\"product-info\"]/div[1]");
		By ViewProductIMGconfirmationLocator= By.xpath("//*[@id=\"productpictures-grid\"]/tbody/tr/td[1]/a/img");
			
		
		@BeforeTest
		public void setUp() throws Exception {
		}

		@AfterTest
		public void tearDown() throws Exception {
		}

		@Test
		// Test 01
		// Seccion: Reports > Products never purchased > Search
		public void Test01ReportsProducstNeverPurchased() throws Exception {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://admin-demo.nopcommerce.com/Admin");
			
			driver.findElement(PasswordLocator).clear();
			driver.findElement(EmailLocator).clear();
			driver.findElement(PasswordLocator).sendKeys("admin");
			driver.findElement(EmailLocator).sendKeys("admin@yourstore.com");
			driver.findElement(InputloginLocator1).click();
			//Thread.sleep(1000);
			
			driver.findElement(ReportLocator).click();
			driver.manage().timeouts().implicitlyWait(2 , TimeUnit.SECONDS);
			driver.findElement(ProdNeverPurchasedLocator).click();
			driver.manage().timeouts().implicitlyWait(2 , TimeUnit.SECONDS);
			driver.findElement(SearchCategoryLocator).click();
			driver.findElement(CategComputLocator02).click();
			driver.manage().timeouts().implicitlyWait(2 , TimeUnit.SECONDS);
			driver.findElement(CalendarStartLocator).clear();
			driver.findElement(CalendarStartLocator).sendKeys("1/1/2022");
			driver.findElement(EndDateLocator).clear();
			driver.findElement(EndDateLocator).sendKeys("7/26/2022");
			driver.manage().timeouts().implicitlyWait(4 , TimeUnit.SECONDS);
			driver.findElement(RunReportLocator02).click();
		}

		@Test
		//Test 02
		// Seccion: Reports > Low Stock > View > img check
		public void Test02ReportsProducstNeverPurchased() throws Exception {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://admin-demo.nopcommerce.com/Admin");
			
			driver.findElement(InputloginLocator).click();
			//Thread.sleep(3000);
			
			driver.findElement(ReportLocator02).click();
			driver.manage().timeouts().implicitlyWait(2 , TimeUnit.SECONDS);
			driver.findElement(LowStockLocator).click();
			driver.manage().timeouts().implicitlyWait(4 , TimeUnit.SECONDS);
			driver.findElement(ViewProductLocator).click();
			
			if (driver.findElement(ProductInfoLocator).isDisplayed()) {
				assertTrue(driver.findElement(ViewProductIMGconfirmationLocator).isDisplayed());
				System.out.print("successful access to product details");
			}else {
				System.out.print("product details access error");
			}
		}

	}
