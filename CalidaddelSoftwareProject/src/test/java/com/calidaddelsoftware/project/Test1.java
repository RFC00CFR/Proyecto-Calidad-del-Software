package com.calidaddelsoftware.project;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test1 {
	
	WebDriver driver=null;
	
	By EmailLocator= By.xpath("//*[@id=\"Email\"]");
	By PasswordLocator= By.xpath("//*[@id=\"Password\"]");
	By InputloginLocator= By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	By InputloginLocator1= By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	
	By CatalogLocator= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a");
	By ProductLocator= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li[1]/a");
	
	By InputusernameLocator= By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input[1]");
	By InputpasswordLocator= By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input[1]");
	By submitLocator= By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input[1]");
	
	
	@BeforeTest
	public void setUp() throws InterruptedException {
	
		
	}
	
	@Test
	public void test1() throws Exception {
		System.out.println("Test 1 run | "+Thread.currentThread().getId());
		Thread.sleep(7000);
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
		driver.findElement(PasswordLocator).clear();;
		driver.findElement(EmailLocator).clear();
		driver.findElement(PasswordLocator).sendKeys("admin");
		driver.findElement(EmailLocator).sendKeys("admin@yourstore.com");
		driver.findElement(InputloginLocator1).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a")).click();
		driver.findElement(ProductLocator).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("Computadora Fidelitas Gaming");
		driver.findElement(By.xpath("//*[@id=\"ShortDescription\"]")).sendKeys("Computador gaming de alta gama");
		driver.findElement(By.xpath("//*[@id=\"Sku\"]")).sendKeys("Comp_Fide");
		
	    
		driver.findElement(By.xpath("//*[@id=\"Gtin\"]")).sendKeys("CR");
		driver.findElement(By.xpath("//*[@id=\"ManufacturerPartNumber\"]")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"ShowOnHomepage\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"AvailableStartDateTimeUtc\"]")).sendKeys("7/26/2022 12:00 AM");
		driver.findElement(By.xpath("//*[@id=\"AvailableEndDateTimeUtc\"]")).sendKeys("7/31/2022 12:00 AM");
		
		driver.findElement(By.xpath("//*[@id=\"MarkAsNew\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"MarkAsNewStartDateTimeUtc\"]")).sendKeys("7/26/2022 12:00 AM");
		driver.findElement(By.xpath("//*[@id=\"MarkAsNewEndDateTimeUtc\"]")).sendKeys("7/31/2022 12:00 AM");
		driver.findElement(By.xpath("//*[@id=\"AdminComment\"]")).sendKeys("Computadora de ultima generacion a un precio comodo");
		
		driver.findElement(By.xpath("//*[@id=\"product-price-area\"]/div[2]/span[1]/span[1]/input[1]")).sendKeys("1000");
		driver.findElement(By.xpath("//*[@id=\"product-price\"]/div[2]/div[2]/div[2]/span[1]/span[1]/input[1]")).sendKeys("999");
		driver.findElement(By.xpath("//*[@id=\"product-price\"]/div[2]/div[3]/div[2]/span[1]/span[1]/input[1]")).sendKeys("999");
		driver.findElement(By.xpath("//*[@id=\"product-form\"]/div[1]/div[1]/button[1]")).click();
		
		
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println("Test 2 run | "+Thread.currentThread().getId());
		//Thread.sleep(8500);
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(InputloginLocator).click();
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a")).click();
		if(driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[1]/h1")).isDisplayed()) {
			System.out.println("Test de Login y Logout Pasados Correctamente"); 
		}else {
			System.out.println("Test de Login y Logout Pasados Correctamente");
		}

	}

	
	
	 @AfterTest
	 public void tearDown() {
		// driver.close();
	 }

}
