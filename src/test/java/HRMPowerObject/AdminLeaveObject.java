package HRMPowerObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminLeaveObject {
	
	WebDriver driver;
	
	WebDriver ldriver;
	
	public AdminLeaveObject(WebDriver rdriver) {
		ldriver= rdriver;
	    PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "sidebarmenu_btn")
    @CacheLookup
    public WebElement sidebarmenu_btn;

	@FindBy(id = "leave_menus")
	@CacheLookup
	public WebElement Leavemenu;
	
	@FindBy(linkText = "Admin Leave")
	@CacheLookup
	public WebElement AdminLeave;
	
	@FindBy(id = "typedrop-down")
	@CacheLookup
	public WebElement Leavetype;
	
	@FindBy(xpath = "//body/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	public WebElement clickfromdate;
	
	@FindBy(id = "//body/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	public WebElement fromdate;
	
    @FindBy(id = "//body/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	public WebElement clicktoDate;
	
	@FindBy(id = "//body/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	public WebElement toDate;
	
	@FindBy(id = "statusdrop-down")
	@CacheLookup
	public WebElement leaveStatus;
	
	@FindBy(how =How.XPATH,using ="/html/body/div[1]/div/div[2]/main/div/div[2]/div[5]/a/div/span[1]/i")
	@CacheLookup
	public WebElement searchbtn;
	
	@FindBy(how =How.XPATH,using ="/html/body/div[1]/div/div[2]/main/div/div[2]/div[5]/a/div/span[2]/i")
	@CacheLookup
	public WebElement resetbtn;

	@FindBy(how =How.XPATH,using ="/html/body/div[1]/div/div[2]/main/div/div[3]/div[1]/table/tbody/tr[1]/td[5]")
	@CacheLookup
	public WebElement detelebtn;
	
    @FindBy(how =How.XPATH,using ="	/html/body/div[1]/div/div[2]/main/div/div[5]/div/div/div/div[2]/div/button[1]")
    @CacheLookup
    public WebElement yesbtn;
	
    @FindBy(how =How.XPATH,using ="/html/body/div[1]/div/div[2]/main/div/div[5]/div/div/div/div[2]/div/button[2]")
    @CacheLookup
    public WebElement nobtn;
    
    @FindBy(how =How.XPATH,using ="/html/body/div[1]/div/div[2]/main/div/div[5]/div/div/div/div[1]/span/i")
    @CacheLookup
    public WebElement closebtn;
    
    @FindBy(how =How.XPATH,using ="//body/div[3]/div[3]/div[1]/div[1]/h2[1]/span[1]/i[1]")
    @CacheLookup
    public WebElement close_btn;

    public void clicksidebarmenu_btn() {
    	sidebarmenu_btn.click();
    }
   
    public void clickLeavemenu(){
    	Leavemenu.click();
    }
	
    public void clickAdminLeave() {
    	AdminLeave.click();
    }
    
    public void clickLeavetype() {
    	Leavetype.click();
    }
    
    public void clickfromdate() {
    	clickfromdate.click();
    }
    
    public void setfromdate(String fromDate) {
    	fromdate.sendKeys(fromDate);	
	}
	
    public void clicktoDate() {
    	clicktoDate.click();
    }
    
    public void settoDate(String todate) {
    	toDate.sendKeys(todate);	
	}
    
    public void clickleaveStatus() {
    	leaveStatus.click();
    }
    
    public void setleaveStatus(String leavestatus) {
    	leaveStatus.sendKeys(leavestatus);	
	}
	
    public void clicksearchbtn() {
    	searchbtn.click();
    }
     
   public void clickresetbtn() {
    	resetbtn.click();
    }
   
   //detelebtn
    
   public void clickdetelebtn() {
	   detelebtn.click();
   }
  // yesbtn
	
   public void clickyesbtn() {
	   yesbtn.click();
   }
	
   //nobtn
   public void clicknobtn() {
	   nobtn.click();
   }
	
   //
   public void clickclosebtn()
   {
	   closebtn.click();
   }
   
   public void clickclose()
   {
	   close_btn.click();
   }
   

}
