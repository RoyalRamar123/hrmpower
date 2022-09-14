package HRMPowerObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchEmployeeObjects {
	
	WebDriver driver;

	WebDriver ldriver;

	public SearchEmployeeObjects(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

} 
	@FindBy(id = "sidebarmenu_btn")
    @CacheLookup
    public WebElement sidebarmenu_btn;
	
	
	@FindBy(id = "employee_menus")
	@CacheLookup
	public WebElement EmployeeMenu;
	
	@FindBy(linkText = "Search Employee")
	@CacheLookup
	public WebElement SearchEmployee;
	
	@FindBy(how =How.NAME,using ="firstName")
	@CacheLookup
	public WebElement txtfirstName;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div/div[3]/div[2]/div/div/div/input")
	@CacheLookup
	public WebElement txtdatepicker;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/section/div/section/div/div[2]/div/select/option[80]")
	@CacheLookup
    public WebElement txtyear;
	
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/div/section/div/div[1]/h3")
	@CacheLookup
    public WebElement txtmonth;
    
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/div/section/table/tbody/tr[5]/td[3]/div/button")
 	@CacheLookup
     public WebElement txtdate;
 	
 	@FindBy(how = How.XPATH, using = "//body/div[3]/section[1]/button[1]/*[1]")
 	@CacheLookup
    public WebElement datepickerclose;
    
    @FindBy(how = How.NAME, using = "email")
	@CacheLookup
	public WebElement txtemail;
	
    @FindBy(how = How.ID, using = "phoneNumber")
	@CacheLookup
	public WebElement txtphonenumber;
	
	@FindBy(how = How.NAME, using = "employeestatus")
	@CacheLookup
	public WebElement txtstatus;  
	
    @FindBy(how = How.ID, using = "drop-down_search")
	@CacheLookup
	public WebElement txtdesignation;
    
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div/div[3]/div[6]/div/div/div[2]/span[1]/i")
	@CacheLookup
	public WebElement searchs_bottom;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div/div[4]/table/tbody/tr")
   	@CacheLookup
   	public WebElement txtupadte;
	

	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[3]/div[6]/div[1]/div[1]/div[2]/span[2]")
	@CacheLookup
	public WebElement clear;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div/div[4]/table/tbody/tr/td[9]/a/i")
	@CacheLookup
	public WebElement deletebtn;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div/div[6]/div/div/div/div[2]/div/button[1]")
	@CacheLookup
	public WebElement yesbtn;

	
	public void clicksidebarmenu_btn() {
		 sidebarmenu_btn.click();
	}
	
	public void clickEmployeemenu() {
		EmployeeMenu.click();
	}
	
	public void clickSearchEmployee() {
		SearchEmployee.click();
	}
	
	public void setFirstName(String firstName) {
		txtfirstName.sendKeys (firstName);
	}
    public void setDateOfBirth(String dateOfBirth) { 
   	 txtdatepicker.click(); 
	}
   
   public void setDateOfBirthyy(String yyyy) { 
   	 txtyear.click();
	}
   
   public void setDateOfBirthmm(String mm) { 
		 txtmonth.click();
	}
   
   public void setDateOfBirthdd(String dd) { 
   	 txtdate.click(); 
	}
   
   public void setDateOfBirthdd() { 
    	datepickerclose.click(); 
	}
	
  public void setEmail(String email) {
		txtemail.sendKeys(email);
	}
	
	public void setPhoneNumber(String mobileNumber) {
		txtphonenumber.sendKeys(mobileNumber);
	}
	
	public void setEmployeestatus(String Employeestatus) {
		txtstatus.sendKeys(Employeestatus);
	}
	
	public void setDesignation(String designation) {
		txtdesignation.sendKeys(designation);
	}
	
	
	public void clicksearch() {
		searchs_bottom.click();
	}
	
	public void clickupdateemployee() {
		txtupadte.click();
	}
	
	public void clickclear() {
		clear.click();
	
}
	public void clickupdelete() {
		deletebtn.click();
	}

	public void clickyes() {
		yesbtn.click();
	}

}
