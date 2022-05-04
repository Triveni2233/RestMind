package TestNgProfram;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.image.CropImageFilter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Gmailcom {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriverManager.firefoxdriver().setup();
	 driver = new ChromeDriver();
	 driver.get("http://gmail.com");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
