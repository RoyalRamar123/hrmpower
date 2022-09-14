package HRMPowerObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmployeeleaveObjects {
	WebDriver driver;

	WebDriver ldriver;

	public EmployeeleaveObjects (WebDriver rdriver) {
		ldriver = rdriver;
     	PageFactory.initElements(rdriver, this);
}
	
	@FindBy(id = "sidebarmenu_btn")
    @CacheLookup
    public WebElement sidebarmenu_btn;
	
	@FindBy(id ="leave_menus")
	@CacheLookup
	public WebElement Leave;
	
	@FindBy(linkText ="Employee Leave")
	@CacheLookup
	public WebElement employeeLeave;
	
	
	@FindBy(how = How.XPATH, using ="/html/body/div[1]/div/div[2]/main/div/div[2]/div[2]/span[3]")
	@CacheLookup
	public WebElement AddLeavebtn;
	
	@FindBy(how = How.XPATH, using ="//body/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	public WebElement clickrequestFrom;
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div[3]/div/div[2]/div/div/div[1]/div[1]/input")
	@CacheLookup
	public WebElement requestFrom;
	
	@FindBy(how = How.XPATH, using ="//body/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	public WebElement clickrequesto;
	
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div[3]/div/div[2]/div/div/div[2]/div[1]/input")
	@CacheLookup
	public WebElement requestTO;
	
	@FindBy(how = How.NAME, using ="leaveType")
	@CacheLookup
	public WebElement leaveType;
	
	@FindBy(how = How.ID, using ="reasonforleave")
	@CacheLookup
	public WebElement reasonforLeave;
	
	@FindBy(how = How.ID, using="holiday_submit")
	@CacheLookup
	public WebElement submit;

	@FindBy(how = How.NAME, using="searchLeaveType")
	@CacheLookup
	public WebElement selectsearchleave;
	
	@FindBy(how = How.NAME, using="searchLeaveStatus")
	@CacheLookup
	public WebElement selectsearchLeaveStatus;
	
	@FindBy(how = How.NAME, using="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[2]/div[2]/span[1]/i[1]")
	@CacheLookup
	public WebElement search_btn;
	
	@FindBy(how = How.NAME, using="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[2]/div[2]/span[2]/i[1]")
	@CacheLookup
	public WebElement reset_btn;
	
    @FindBy(how =How.XPATH,using ="//body/div[3]/div[3]/div[1]/div[1]/h2[1]/span[1]/i[1]")
    @CacheLookup
    public WebElement close_btn;
    
    @FindBy(how =How.XPATH,using ="/html/body/div[1]/div/div[2]/main/div/div[2]/div[3]/div/div[3]/button/span[1]/svg")
    @CacheLookup
    public WebElement toast_message;
    
    @FindBy(how =How.XPATH,using ="/html/body/div[1]/div/div[2]/main/div/div[3]/table/tbody/tr/td[7]/a[1]/i")
    @CacheLookup
    public WebElement editLeave;
    
    public void clicksidebarmenu_btn() {
		 sidebarmenu_btn.click();
	}

	public void clickLeave() {
		Leave.click();
	}
	
	public void clickEmployeeLeave() {
		employeeLeave.click();
	}
	
	public void clickAddLeavebtn() {
		AddLeavebtn.click();
    }
	
	public void clickrequestFrom() {
		clickrequestFrom.click();
    }
	
	public void setrequestFrom(String requestfrom) {
		requestFrom.sendKeys(requestfrom);	
	}
	
	public void clickrequesto() {
		clickrequesto.click();
    }
	
	public void setrequestTO(String requesTo) {
		requestTO.sendKeys(requesTo);	
	}
	
	public void setleaveType(String leavetype) {
		leaveType.sendKeys(leavetype);	
	}
	
	public void setreasonforLeave(String reasonforleave) {
		reasonforLeave.sendKeys(reasonforleave);	
	}
	
	public void clicksubmit() {
		submit.click();
    }
    public void selectsearchleave1(String searchLeaveType) {
    	selectsearchleave.sendKeys(searchLeaveType);	
	}
    
    public void selectsearchleave(String searchLeaveStatus) {
    	selectsearchLeaveStatus.sendKeys(searchLeaveStatus);	
	}
    
    public void clicksearch() {
    	 search_btn.click();
    }
    
    public void clickreset() {
    	reset_btn.click();
   }
   
    public void clickclose()
    {
 	   close_btn.click();
    }
		
    public void clickclosetoast()
    {
    	toast_message.click();
    }
	
    public void clickceditLeave()
    {
    	editLeave.click();
    }
	
    
}
	
	
























