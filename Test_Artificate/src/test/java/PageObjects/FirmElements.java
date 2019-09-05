package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Testbase.TestBase;

public class FirmElements extends TestBase{
	public FirmElements(WebDriver driver ){
		this.driver = driver;
	}
		
		@FindBy(how=How.ID, using="UserName") 
		public static WebElement username;
		
		@FindBy(how=How.ID, using="Password") 
	    public static WebElement password;
	    
		@FindBy(how=How.XPATH, using="//*[@id='content']/div[1]/form/div[4]/div/input") 
	    public static WebElement log_button;
		
		@FindBy(how=How.XPATH, using="//*[@id='navigation']/div/ul/li[2]/a") 
	    public static WebElement Firm;
		
		@FindBy(how=How.XPATH, using="//*[@id='content']/div[1]/p/a") 
	    public static WebElement Createnew;
		
		@FindBy(how=How.XPATH, using="//*[@id='Global']") 
	    public static WebElement radio;
		
		@FindBy(how=How.XPATH, using="//*[@id='content']/div[1]/div/form/div/div[5]/div/input") 
	    public static WebElement add;
		
		@FindBy(how=How.XPATH, using="//*[@id='FirmTenants_4__Assigned']") 
	    public static WebElement check;
		
		@FindBy(how=How.XPATH, using="//*[@id='Name']")
	    public static WebElement frimname;
		
		@FindBy(how=How.XPATH, using="//*[@id='AddressLine1']") 
	    public static WebElement address;
		
		@FindBy(how=How.XPATH, using="//*[@id='JurisdictionName']") 
	    public static WebElement jurisdiction;
		
		@FindBy(how=How.XPATH, using="//*[@id='profile']/form/div[2]/div[8]/div[1]/span/span/div/span/div[1]/p") 
	    public static WebElement jdp;
		
		@FindBy(how=How.XPATH, using="//*[@id='PracticeAreaName']") 
	    public static WebElement practicearea;
		
		@FindBy(how=How.XPATH, using="//*[@id='profile']/form/div[2]/div[10]/div[1]/span/span/div/span/div/p") 
	    public static WebElement pdp;
		
}
