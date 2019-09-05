package Testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {
	
	public static WebDriver driver = null;
	 
	 @BeforeSuite
	 public void initialize(){
	 
	 System.setProperty("webdriver.chrome.driver","P:\\driver\\New folder\\chromedriver.exe");
	 driver = new ChromeDriver(); 
     driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.get("https://lamda-admin-dev.ase-si-group-ext.p.azurewebsites.net/");
	 
	 }
	 
	/* @AfterSuite
	 public void TeardownTest()
	    {
	        TestBase.driver.quit();
	    }*/
}
