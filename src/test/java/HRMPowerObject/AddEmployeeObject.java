package HRMPowerObject;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddEmployeeObject {

    WebDriver driver;

	WebDriver ldriver;

	public AddEmployeeObject (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup
	@FindBy(id = "sidebarmenu_btn")
    public WebElement sidebarmenu_btn;
	
	@CacheLookup
	@FindBy(id = "employee_menus")
	public WebElement EmployeeMenu;
	
	@CacheLookup
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/ul/div[1]/ul/a[1]/li")
    public WebElement AddEmployeeMenu;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "firstName")
	public WebElement txtfirstName;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "lastName")
	public WebElement txtlastName;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "gender")
    public WebElement rdgender;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div[2]/div[1]/div[2]/div[4]/div[1]/div/div/input")
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
	
	@FindBy(how = How.ID, using = "addressLine1")
	@CacheLookup
	public WebElement textaddress;
	
	@FindBy(how = How.ID, using = "city")
	@CacheLookup
	public WebElement txtcity;
	
	@FindBy(how = How.NAME, using = "States")
	@CacheLookup
	public WebElement txtstates;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "zipcode")
	public WebElement txtpincode;
	
   @FindBy(how = How.NAME, using = "nationality")
	@CacheLookup
	public WebElement txtnationality;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "email")
	public WebElement txtemail;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "mobileNumber")
	public WebElement txtmobileNumber;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "maritalStatus")
	public WebElement texmarital;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "aadharno")
	public WebElement txtaadharno;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "panno")
	public WebElement txtpanno;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "bloodgroup")
	public WebElement txtbloodgroup;
	
    @CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div[2]/div[2]/div/div/div/div/div/button")
	public WebElement nxt_btn ;
    
    
   //Employement-detils
    
    @CacheLookup
	@FindBy(how = How.ID, using = "designation")
	public WebElement txtdesignation;
    
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div[2]/div[1]/div[2]/div[3]/div[1]/div/div/input")
	@CacheLookup
	public WebElement txtemployementdatepicker;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/section/div/section/div/div[2]/div/select/option[101]")
	@CacheLookup
    public WebElement txtemployementdatepickeryear;
	
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/div/section/div/div[1]/h3")
	@CacheLookup
    public WebElement txtemployementdatepickermm;
    
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/div/section/table/tbody/tr[2]/td[2]/div/button")
	@CacheLookup
    public WebElement txtemployementdatepickerdd; 
    
    @CacheLookup
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div[2]/div[1]/div[2]/div[4]/input")
    public WebElement txtreportingTo;
	//input[@id='reportingTo']
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div[2]/div[1]/div[2]/div[4]/input")
	public WebElement Supervisor;
	
	@CacheLookup
    @FindBy(how = How.XPATH, using = "//div[@id='SuperViser0']")
    public WebElement reportingTo;
	
	
    @CacheLookup
    @FindBy(how = How.XPATH, using = "//input[@id='reportingTo']")
    public WebElement txtreportingTodata;
    
    @CacheLookup
    @FindBy(how = How.ID, using = "payCycle")     
    public WebElement txtpayCycle;
    
    @CacheLookup
    @FindBy(how = How.ID, using = "pfnumber")
    public WebElement txtpfnumber;
    
    @CacheLookup
    @FindBy(how = How.ID, using = "compensation")
    public WebElement txtcompensation;
    
    @CacheLookup
    @FindBy(how = How.ID, using = "emplyementType")
    public WebElement txtemplyementType;
    
    @CacheLookup
    @FindBy(how = How.ID, using = "pfcheckbox")   
    public WebElement txtpfcheckbox;
    
    @CacheLookup
    @FindBy(how = How.ID, using = "tdsCheckbox")
    public WebElement txttdsCheckbox;
    
    @CacheLookup
    @FindBy(how = How.ID, using = "ptcheckbox")
    public WebElement txtptcheckbox;
    
    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
    public WebElement nextbtn;
    
    //prior Expericene
    @CacheLookup
    @FindBy(how = How.NAME, using = "companyName")
    public WebElement txtcompanyName;
    
    @CacheLookup
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div[2]/div[1]/div/div[3]/input")
    public WebElement txtCDesignation;
    
    @CacheLookup
    @FindBy(how = How.NAME, using = "periodFrom")
    public WebElement txtperioddate;
    
    @CacheLookup
    @FindBy(how = How.NAME, using = "periodTo")
    public WebElement txtperiodTo; 
    
    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
    public WebElement pcdnextbtn;
    
    @CacheLookup
    @FindBy(how = How.NAME, using = "documentType")
    public WebElement txtdoucment;
    
   @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/label[2]/i[1]")
   @CacheLookup
   public WebElement fileupload;
    
    
    
    @CacheLookup
    @FindBy(how = How.NAME, using = "effectiveDate")
    public WebElement txteffectivedate;
    
    @CacheLookup
    @FindBy(how = How.NAME, using = "expiryDate")
    public WebElement txtexpirydate;
    
    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
    public WebElement dmnextbtn;
    
    @CacheLookup
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div/div/a[1]/button")
    public WebElement newbtn;
    
    public void clicksidebarmenu_btn() {
		 sidebarmenu_btn.click();
	}
	
	public void clickEmployeemenu() {
		EmployeeMenu.click();
	}
	
	public void clickAddEmployee() {
		AddEmployeeMenu.click();
	}
	
	public void setFirstName(String firstName) {
		txtfirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		txtlastName.sendKeys(lastName);
	}
	
	public void setGender(String gender) {
		rdgender.click();
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
    
   public void setAddressLine1(String address) {
		textaddress.sendKeys(address);
	}
	
	public void setCity(String city) {
		txtcity.sendKeys(city);
	}
	
	public void setStates(String states) {
		txtstates.sendKeys(states);
	}
	
	public void setZipcode(String pincode) {
		txtpincode.sendKeys(pincode);
	}
	
   public void setNationality(String natioanlity) {
		txtnationality.sendKeys(natioanlity);
	}
	
	public void setEmail(String email) {
		txtemail.sendKeys(email);
	}
	
	public void setMobilenumber(String mobileNumber) {
		txtmobileNumber.sendKeys(mobileNumber);
	}
	
	public void setMarital(String Marital) {
		texmarital.click();
	}
	
	public void setAdharno(String adharno) {
		txtaadharno.sendKeys(adharno);
	}
	
	public void setPanno(String panno) {
		txtpanno.sendKeys(panno);
	}
	public void setBloodgroup(String bloodgroup) {
		txtbloodgroup.sendKeys(bloodgroup);
	}
	
	public void clickbtn() {
		nxt_btn.click();
	}
	
	//Employment
	
	public void setDesignation(String designation) {
		txtdesignation.sendKeys(designation);
	}
	 public void setDateOfJoining(String DateOfJoining) { 
		 txtemployementdatepicker.click(); 
	}
    
    public void setDateOfJoiningyear(String DateOfJoiningyear) { 
    	txtemployementdatepickeryear.click();
	}
    
    public void setemployementdatepickermm(String DateOfJoiningmm) { 
    	txtemployementdatepickermm.click();
	}
    
    public void setEmployementdatepickerdd(String DateOfJoiningdd) { 
    	txtemployementdatepickerdd.click(); 
	}
    
	/*
	 * public void setEmployementdatepickerclose() {
	 * txtemployementdatepickerclose.click(); }
	 */
	
    
    public void setReportingTo(String supervisor) { 
    	txtreportingTo.sendKeys(supervisor);
    }
    
    public void setReporting(String supervisor) { 
    	reportingTo.sendKeys(supervisor);
    }
    public void setPaycycle(String paycycle) { 
    	txtpayCycle.sendKeys(paycycle); 
    }
	
    public void setPFnumbet(String pfnumber) { 
    	txtpfnumber.sendKeys(pfnumber); 
    }
    
    public void setCompensation(String compensation) { 
    	txtcompensation.sendKeys(compensation); 
    }
   
    public void setEmplyementType(String emplyementType) {  
    	txtemplyementType.sendKeys(emplyementType); 
    }
    
    public void setPfcheckbox(String pfcheckbox) { 
    	txtpfcheckbox.click();
    }
    
    public void setTdsCheckbox(String tdsCheckbox) { 
    	txttdsCheckbox.click();
    }
    
    public void setPtcheckbox(String  ptcheckbox) { 
    	txtptcheckbox.click();
    }
    
    public void clickNextbtn() { 
    	nextbtn.click();
    }
    
    
    public void set(String companyname) { 
    	txtcompanyName.sendKeys(companyname);
    }
    
     public void setdesignation(String cdesignation) { 
    	txtCDesignation.sendKeys(cdesignation);
    }
    
     public void setperioddate(String perioddate) { 
    	 txtperioddate.sendKeys(perioddate);
     }
    
     public void setperiodTo(String periodTo) { 
    	 txtperiodTo.sendKeys(periodTo);
     }
    
    public void clickPCNextbtn() {
	   pcdnextbtn.click();
    }
    
    
    public void setdoucment(String doucment) { 
    	txtdoucment.sendKeys(doucment);
    }
    
    public void setdoucment() { 
    	fileupload.click();
    }
    
    public void seteffectivedate(String effectivedate) { 
    	txteffectivedate.sendKeys(effectivedate);
    }
    
    public void setexpirydate(String expriydate) { 
    	 txtexpirydate.sendKeys(expriydate);
    }
    
   public void clickDMNextbtn() {
	   dmnextbtn.click();
   }
   
   public void clicknewbtn() {
	   newbtn.click();
   }
   
   
}


