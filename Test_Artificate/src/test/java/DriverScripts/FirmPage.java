package DriverScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import PageObjects.FirmElements;

public class FirmPage extends FirmElements{
	public FirmPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void login() throws InterruptedException{
		FirmElements f1  = PageFactory.initElements(driver, FirmElements.class);
		FirmElements.username.sendKeys("managing.editor@gowi.rs");
		FirmElements.password.sendKeys("meditor");
		FirmElements.log_button.click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		FirmElements.Firm.click();
		FirmElements.Createnew.click();
		FirmElements.radio.click();
		System.out.println("test");
		FirmElements.add.click();
		System.out.println("test");
		FirmElements.check.click();
		FirmElements.frimname.sendKeys("Test Firm 30/08");
		FirmElements.address.sendKeys("14th wall st");
		FirmElements.jurisdiction.sendKeys("ind");
		Actions act = new Actions(driver);
		act.moveToElement(FirmElements.jdp ).click().build().perform();;
		FirmElements.practicearea.sendKeys("test");
		act.moveToElement(FirmElements.pdp).click().build().perform();

		
	}
}
