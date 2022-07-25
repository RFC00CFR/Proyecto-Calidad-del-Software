package com.calidaddelsoftware.project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test3 {
	   
		@Test
		public void Ptesting1(){
			//inicializa el driver y da informacion del url
			String baseUrl = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
		    System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	        driver.get(baseUrl);
	        
	        //acceso al usuario
	        driver.findElement(By.xpath("//button[@type=\"submit\" and @class=\"button-1 login-button\"]")).click();
	        
	    	//acceder al apartado de promociones
	        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("/html/body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[5]")).click();
	        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[5]/ul/li[1]/a/p")).click();
	        
	        //elegir segundo descuento con las indicaciones de la web basica
	        driver.findElement(By.xpath("//*[@id=\"discounts-grid\"]/tbody/tr[1]/td[7]/a")).click();
	        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	        
	         //cambiar nombre
	         driver.findElement(By.id("Name")).clear();
	         driver.findElement(By.id("Name")).sendKeys("30$ discount");
	         //cambiar tipo
	         
	         WebElement CamMenuDesc=  driver.findElement(By.id("DiscountTypeId"));
	         Select CamselectMDesc= new Select(CamMenuDesc);
	         CamselectMDesc.selectByIndex(1);
	         
	         // no usar porcentaje
	         driver.findElement(By.id("UsePercentage")).click();
	         
	         //indicar cantidad de descuento
	         driver.findElement(By.xpath("//*[@id=\"pnlDiscountAmount\"]/div[2]/span[1]/span/input[1]")).sendKeys("30");
	        
	         //sin cupon
	         driver.findElement(By.id("RequiresCouponCode")).click();
	        
	         //actualizar fecha de uso
	         driver.findElement(By.xpath("//*[@id=\"StartDateUtc\"]")).clear();
	         driver.findElement(By.xpath("//*[@id=\"StartDateUtc\"]")).sendKeys("7/4/2022 12:00 AM");
	         
	         driver.findElement(By.xpath("//*[@id=\"EndDateUtc\"]")).clear();
	         driver.findElement(By.xpath("//*[@id=\"EndDateUtc\"]")).sendKeys("7/29/2022 12:00 AM");
	        
	         //acumulable
	         driver.findElement(By.id("IsCumulative")).click();
	       
	         //descuento limites
	         WebElement CamMenuLim=  driver.findElement(By.id("DiscountLimitationId"));
	         Select CamselectMLim= new Select(CamMenuLim);
	         CamselectMLim.selectByIndex(1);
	         driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	         driver.findElement(By.xpath("//*[@id=\"pnlLimitationTimes\"]/div[2]/span[1]/span/span[2]/span[1]/span")).click();
	       
	         //comentarios de administracion
	         driver.findElement(By.id("AdminComment")).sendKeys("Cambio de descuento");
	         driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	        
	         //guardar
	         driver.findElement(By.xpath("//*[@id=\"discount-form\"]/div[1]/div/button[1]")).click();

	         // Se cierra el driver
	         driver.close();
	         
	         //imprime en consola el numero de thread usado
		     System.out.println("Este es el test 2  /   Using thread:"+Thread.currentThread().getId());

		}
		
		@Test
		public void Ptesting2(){
			//inicializa el driver y da informacion del url
	    	String baseUrl = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
		    System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	        driver.get(baseUrl);

	        //acceso
	        driver.findElement(By.xpath("//button[@type=\"submit\" and @class=\"button-1 login-button\"]")).click();
	        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

	        //ingreso a seccion de promociones
	        driver.findElement(By.xpath("/html/body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[5]")).click();
	        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[5]/ul/li[1]/a/p")).click();
	        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  
	        //agregar promo
	        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/a")).click();
	        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

	        //agregar datos
	        	//nombre
	        	driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("10% Promotion 2022");
	        	
	        	//tipo
	        	WebElement MenuDesc=  driver.findElement(By.xpath("//*[@id=\"DiscountTypeId\"]"));
	        	Select selectMDesc= new Select(MenuDesc);
	        	selectMDesc.selectByIndex(5);
	        	
	        	//Porcentaje
	        	driver.findElement(By.xpath("//*[@id=\"UsePercentage\"]")).click();
	        	
	        	//Cantidad
	        	driver.findElement(By.xpath("//*[@id=\"pnlDiscountPercentage\"]/div[2]/span[1]/span/input[1]")).sendKeys("10");
	        	
	        	//cupon
	        	driver.findElement(By.xpath("//*[@id=\"RequiresCouponCode\"]")).click();
	        	
	        	//codigo
	        	driver.findElement(By.xpath("//*[@id=\"CouponCode\"]")).sendKeys("1N2022");
	        	
	        	//fecha de uso
	        	driver.findElement(By.xpath("//*[@id=\"StartDateUtc\"]")).sendKeys("7/10/2022 12:00 AM");
	        	driver.findElement(By.xpath("//*[@id=\"EndDateUtc\"]")).sendKeys("7/17/2022 12:00 AM");
	        	
	        	//acumulativo
	        	driver.findElement(By.xpath("//*[@id=\"IsCumulative\"]")).click();
	        	
	        	//limite
	        	WebElement MenuLimit=  driver.findElement(By.xpath("//*[@id=\"DiscountLimitationId\"]"));
	        	Select selectLim= new Select(MenuLimit);
	        	selectLim.selectByIndex(1);
	        	
	        	//comentario
	        	driver.findElement(By.xpath("//*[@id=\"AdminComment\"]")).sendKeys("Descuento de 10% en la compra");
	        	
	       //guardar
	       driver.findElement(By.xpath("//*[@id=\"discount-form\"]/div[1]/div/button[1]")).click();
	       
	       // Se cierra el driver
	       driver.close();
	        
	       //imprime en consola el thread usado
	       System.out.println("Este es el test 1  /   Using thread:"+Thread.currentThread().getId());
		
		}
		
}
