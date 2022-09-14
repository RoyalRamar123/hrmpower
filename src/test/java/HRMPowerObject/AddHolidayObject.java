package HRMPowerObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddHolidayObject {
	
	WebDriver driver;
	
	WebDriver ldriver;
	
	public AddHolidayObject(WebDriver rdriver) {
		ldriver= rdriver;
	    PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id = "sidebarmenu_btn")
    @CacheLookup
    public WebElement sidebarmenu_btn;

	@FindBy(id = "holiday_menus")
	@CacheLookup
	public WebElement holidaymenu;
	
	@FindBy(linkText = "Admin Holiday")
	@CacheLookup
	public WebElement AdminHoliday;
    
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div/div[1]/div[2]/button/strong")
    @CacheLookup
	public WebElement AddHolidaybtn;
	
	@FindBy(how =How.ID,using ="holidayName")
	@CacheLookup
	public WebElement holidayName;
	
	@FindBy(how =How.XPATH,using ="/html/body/div[3]/div[3]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/input")
	@CacheLookup
	public WebElement holidaydatepicker;
	
	@FindBy(how =How.XPATH,using ="/html/body/div[4]/section/div/section/div/div[2]/div/select/option[101]")
	@CacheLookup
	public WebElement holidaydatepickeryear;
	
	@FindBy(how =How.XPATH,using ="/html/body/div[4]/section/div/section/div/div[1]/h3")
	@CacheLookup
	public WebElement holidaydatepickermonth;
	
	@FindBy(how =How.XPATH,using ="/html/body/div[4]/section/div/section/table/tbody/tr[4]/td[6]/div/button")
	@CacheLookup
	public WebElement holidaydatepickerday;
	
	@FindBy(how =How.ID,using ="modal-close-button")
	@CacheLookup
	public WebElement holidaydatepickerclose;
	
	@FindBy(how =How.XPATH,using ="//strong[contains(text(),'SUBMIT')]")
	@CacheLookup
	public WebElement  SUBMIT;
	
	
	@FindBy(how =How.XPATH,using ="//tbody/tr[1]/td[1]")
	@CacheLookup
	public WebElement Update;
	
	@FindBy(how =How.XPATH,using ="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div[2]/table/tbody/tr[2]/td[5]/a/i")
	@CacheLookup
	public WebElement delete;
	
	@FindBy(how =How.XPATH,using ="/html/body/div[1]/div/div[2]/main/div/div[3]/div/div/div/div[2]/div/button[1]")
	@CacheLookup
	public WebElement yesbtn;
	
	
	 public void clicksidebarmenu_btn() {
		 sidebarmenu_btn.click();
	}
	
	public void clickHolidaymenu() {
		holidaymenu.click();
	}
	
	public void clickAdminHoliday() {
		AdminHoliday.click();
	}
	public void clickAddHolidaybtn() {
		AddHolidaybtn.click();
	}
	
	public void setholidayName(String holidayname) {
		holidayName.sendKeys(holidayname);	
	}
	
	public void clickholidayDate(String holidaydatepickeri) {
		holidaydatepicker.click();
	}
	public void setholidayyear(String holidayYear) {
		holidaydatepickeryear.click()	;
	}
	
   public void setholidaymonth(String holidaydate) {
		holidaydatepickermonth.click();	
	}
	
	
	public void setholidayday(String holidaymonth) {
		holidaydatepickerday.click();	
	}
	public void setholidayclose(String holiday) {
		holidaydatepickerclose.click();
	}
	
	public void clickSubmit() {
		SUBMIT.click();
	}
	
	
	public void clickUpadte() {
		Update.click();
	}
    
	public void clickDelete() {
		delete.click();
	}
	
	public void clickYes() {
		yesbtn.click();
	}
	
}
