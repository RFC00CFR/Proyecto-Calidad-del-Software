package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
public static void main(String[] args) {

 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roberto\\Downloads\\Nueva carpeta\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
String baseUrl = "https://demo.prestashop.com/";
String expectedTitle = "PrestaShop Live Demo";
String actualTitle = "";

driver.get(baseUrl);

actualTitle = driver.getTitle();

 if (actualTitle.contentEquals(expectedTitle)){
System.out.println("Test Passed!");
} else {
System.out.println("Test Failed");
}
//driver.close();
}
}
