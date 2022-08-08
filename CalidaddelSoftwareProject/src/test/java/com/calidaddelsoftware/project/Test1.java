package com.calidaddelsoftware.project;


import static org.junit.Assert.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




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
	By Logout=By.xpath("/html/body/div[6]/div/div/div/div/div[1]/h1");
	
	
	@Before
	public void setUp() throws InterruptedException {
	
		
	}
	
	@Test
	public void test1() throws Exception {

		
		System.out.println("Test 1 run | "+Thread.currentThread().getId());
		Thread.sleep(1500);
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//titulos esperados en este test
		String esperado = "Products / nopCommerce administration";
		String esperadoCreate = "Add a new product / nopCommerce administration";
		
		driver.findElement(PasswordLocator).clear();;
		driver.findElement(EmailLocator).clear();
		driver.findElement(PasswordLocator).sendKeys("admin");
		driver.findElement(EmailLocator).sendKeys("admin@yourstore.com");
		driver.findElement(InputloginLocator1).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a")).click();
		driver.findElement(ProductLocator).click();
		
		//assert para comprobar que si entro en el apartado de productos
		String actualTitulo= driver.getTitle();
		assertEquals(actualTitulo, esperado);
		
		assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/h1")).isDisplayed());
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a")).click();
		
		//assert para comprobar que si entro en el apartado de crear un nuevo producto
		String actualTitulo0= driver.getTitle();
		assertEquals(actualTitulo0, esperadoCreate);
		
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
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//assert para comprobar que si se hizo el ingreso en el Login correspondiente
		String actualTitulo= driver.getTitle();
		String Titulo= "Your store. Login";
		assertEquals(actualTitulo, Titulo);
		driver.findElement(PasswordLocator).clear();;
		driver.findElement(EmailLocator).clear();
		driver.findElement(PasswordLocator).sendKeys("admin");
		driver.findElement(EmailLocator).sendKeys("admin@yourstore.com");
		driver.findElement(InputloginLocator1).click();
		Thread.sleep(2000);
		//assert para comprobar que el boton de logout esta habilitado
		assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a")).isEnabled());
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a")).click();
		
		if(driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[1]/h1")).isDisplayed()) {
			//assert para comprobar que se realizo el logout correctamente
			assertTrue(driver.findElement(Logout).isDisplayed());
			System.out.println("Test de Login y Logout Pasado Correctamente"); 
		}else {
			System.out.println("Test de Login y Logout no pasaron el test Correctamente");
		}
		
	}

	
	 @After
	 public void tearDown() {
		 driver.close();
	 }

}
