package HRMPowerObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeHolidayObject {
	WebDriver driver;

	WebDriver ldriver;

	public EmployeeHolidayObject (WebDriver rdriver) {
		ldriver = rdriver;
     	PageFactory.initElements(rdriver, this);
}
	@FindBy(id = "sidebarmenu_btn")
    @CacheLookup
    public WebElement sidebarmenu_btn;
	

	@FindBy(id ="holiday_menus")
	@CacheLookup
	public WebElement Holidays;
	
	@FindBy(xpath ="/html/body/div[1]/div/div[2]/div/div[2]/ul/div[2]/ul/a[2]/li")
	@CacheLookup
	public WebElement EmployeeHolidays;
	
	
	public void clicksidebarmenu_btn() {
		 sidebarmenu_btn.click();
	}
	
	public void clickHolidaymenu() {
		Holidays.click();
	}
	
	public void clickEmployeeHoliday() {
		EmployeeHolidays.click();
	}
}
