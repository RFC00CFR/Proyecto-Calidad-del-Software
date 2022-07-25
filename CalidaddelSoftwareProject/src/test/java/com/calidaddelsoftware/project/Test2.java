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

//Gerson Fernandez

public class Test2 {
	
private WebDriver driver;
	
	//Localizadores para realizar el LOG IN//
	By paginicialLocator = By.xpath("/html/body/div[6]/div/div/div/div/div[1]/h1");
	By emailLocator = By.name("Email");
	By passwordLocator = By.name("Password");
	By logInButtonLocator = By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	
	//--------------------------------------------------------------------------------------------------------------------------//
	
	//Localizadores para Customers
	By MenuBarsLocator = By.xpath("//*[@id=\"nopSideBarPusher\"]/i");
	By CustomersLocator = By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a");
	By CustomersLocator2 = By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a");
	//Localizadores para Buscar y Editar//
	By CustomerEmailLocator = By.name("SearchEmail");
	By CustomerFNameLocator = By.name("SearchFirstName");
	By CustomerLNameLocator = By.id("SearchLastName");
	By SearchCustomerButtonLocator = By.xpath("//*[@id=\"search-customers\"]");
	By CustomerEditButtonLocator = By.xpath("//*[@id=\"customers-grid\"]/tbody/tr/td[7]/a");
	By EditCustomerInfoButtonLocator = By.xpath("//*[@id=\"customers-grid\"]/tbody/tr/td[7]/a");
	By FirstNameEditLocator = By.xpath("//*[@id=\"FirstName\"]");
	By LastNameEditLocator = By.xpath("//*[@id=\"LastName\"]");
	By SaveChangesCustomerEditLocator= By.xpath("/html/body/div[3]/div[1]/form/div[1]/div/button[1]");
	//Localizadores para Crear Customers//
	By AddNewCustomerButtonLocator = By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a");
	By AddEmailLocator = By.xpath("//*[@id=\"Email\"]");
	By AddPasswordLocator = By.xpath("//*[@id=\"Password\"]");
	By AddFNameLocator = By.xpath("//*[@id=\"FirstName\"]");
	By AddLNameLocator = By.xpath("//*[@id=\"LastName\"]");
	By SaveNewCustomerButtonLocator = By.xpath("/html/body/div[3]/div[1]/form/div[1]/div/button[1]");
	
	@BeforeTest
	public void setUp() throws InterruptedException {
	
		
	}
	
	@Test
	
		public void SearchandEditCustomer() throws Exception {
			
	        System.out.println(" Prueba de Buscar y Editar un Cliente | "+Thread.currentThread().getId());	
	       
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
			
			driver.findElement(emailLocator).clear();
			driver.findElement(emailLocator).sendKeys("admin@yourstore.com");
			
			driver.findElement(passwordLocator).clear();
			driver.findElement(passwordLocator).sendKeys("admin");
			
			driver.findElement(logInButtonLocator).click();
			
			driver.findElement(CustomersLocator).click();
			driver.findElement(CustomersLocator2).click();
			
			driver.findElement(CustomerEmailLocator).sendKeys("victoria_victoria@nopCommerce.com");
		
			driver.findElement(SearchCustomerButtonLocator).click();
			driver.findElement(CustomerEditButtonLocator).click();
			driver.findElement(FirstNameEditLocator).clear();
			driver.findElement(FirstNameEditLocator).sendKeys("Usuario ");
			driver.findElement(LastNameEditLocator).clear();
			driver.findElement(LastNameEditLocator).sendKeys("Test1");
			driver.findElement(SaveChangesCustomerEditLocator).click();
			
	}
	
	
	@Test
	public void CreateCustomer() throws InterruptedException {
		
        System.out.println(" Prueba de Crear un Cliente | "+Thread.currentThread().getId());
        Thread.sleep(7500);
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.findElement(emailLocator).clear();
		driver.findElement(emailLocator).sendKeys("admin@yourstore.com");
		
		driver.findElement(passwordLocator).clear();
		driver.findElement(passwordLocator).sendKeys("admin");
		
		driver.findElement(logInButtonLocator).click();
		
		driver.findElement(CustomersLocator).click();
		driver.findElement(CustomersLocator2).click();
		
		driver.findElement(AddNewCustomerButtonLocator).click();
		driver.findElement(AddEmailLocator).sendKeys("pruebasPararellTesting@grupo4.com");
		driver.findElement(AddPasswordLocator).sendKeys("PruebaParallel");
		driver.findElement(AddFNameLocator).sendKeys("Usuario");
		driver.findElement(AddLNameLocator).sendKeys("Test2");
		driver.findElement(SaveNewCustomerButtonLocator).click();
	}
		

	 @AfterTest
	 public void tearDown() {
		// driver.close();
	 }
	
	
	
	 
		
	
	

}
