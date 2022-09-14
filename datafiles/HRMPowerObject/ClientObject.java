package HRMPowerObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientObject {
	WebDriver driver;
	
	WebDriver ldriver;

	public ClientObject (WebDriver rdriver) {
	ldriver = rdriver;
   	PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "sidebarmenu_btn")
	public WebElement sidebarmenu_btn;
	
	@FindBy(xpath="//*[@id=\"client_page\"]/a")
	public WebElement client_page;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/main/div[2]/div/a/span")
	public WebElement AddClient;
	
	@FindBy(name ="Name")
	@CacheLookup
	public WebElement FName;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[2]/div[1]/input")
    public WebElement FFirstName;
	
	@FindBy(name ="SecondName")
	public WebElement FSecondName;
	
	@FindBy(name="email")
	public WebElement Femail;
	
	@FindBy(name="Phonenumber")
	public WebElement FPhonenumber;
	
	@FindBy(name="Address")
	public WebElement FAddress;
	
	@FindBy(name="City")
	public WebElement FCity;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[6]/div[2]/select")
	public WebElement FStates;
	
	@FindBy(name="Pinno")
	public WebElement FPinno;
	
	@FindBy(name="einno")
	public WebElement Feinno;
	
	@FindBy(className="buttonalign")
	public WebElement Fbuttonalign;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[9]/div/div[3]/button/span[1]/svg")
	public WebElement messageclose;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[1]/div")
	public WebElement AlertName;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div/div/div[2]/div[1]/div")
	public WebElement AlertFirstName;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[2]/div[2]/div")
	public WebElement AlertLastName;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[3]/div")
	public WebElement AlertEmail;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[4]/div")
	public WebElement AlertPhoneNumber;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[6]/div[2]/div")
	public WebElement AlertState;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div/div/div[7]/div")
	public WebElement AlertPin;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[8]/div")
	public WebElement AlertEin;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[9]/a/button")
	public WebElement Cancel;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[9]/div/div[3]/button/span[1]")
	public WebElement Alertsave;
	
	@FindBy(id="department")
	public WebElement ClientSearch;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div[2]/div/span[1]")
	public WebElement Search;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div[3]/table")
	public WebElement table;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div[3]/table/tbody/tr")
	public WebElement searchedData;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/main/div[3]/table/tbody")
	public WebElement rowData;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div[3]/table/tbody/tr[1]")
	public WebElement UpdateInaactive;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div[3]/table/tbody/tr[2]")
	public WebElement UpdateActive;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div[2]/div/span[2]")
	public WebElement ResetButton;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div[3]/table/tbody/tr/td[8]/a")
	public WebElement DeleteButton;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div[4]/div[3]/div/div/div/div[2]/div/button[1]")
    public WebElement yesButton;	
	
	public void clicksidebarmenu_btn() {
		sidebarmenu_btn.click();
	}
	
	public void clickclient_page() {
		client_page.click();
	}
	
	public void clickAddClient() {
		AddClient.click();
	}
	
	public void SetClientName(String Name) {
		FName.sendKeys(Name);
		
	}
	
	public void SetFirstName(String FirstName) {
		FFirstName.sendKeys(FirstName);
	}
	
	public void SetSecondName(String LastName) {
		FSecondName.sendKeys(LastName);
	}
	 	
     public void setemail(String Email) {
    	 Femail.sendKeys(Email);
     }
     
     public void setPhonenumber(String PhoneNumber) {
    	 FPhonenumber.sendKeys(PhoneNumber);
     }
     
     public void setAddress(String Address) {
    	 FAddress.sendKeys(Address);
     }
     
     public void setCity(String City) {
    	 FCity.sendKeys(City);
     }
     
     public void setState(String State) {
    	 FStates.sendKeys(State);
    	 
     }
     
     public void SetPinno(String Zip) {
    	 FPinno.sendKeys(Zip);
     }
     
     public void setEin(String Ein) {
    	 Feinno.sendKeys(Ein);
     }
     
     public void clickSubmit() {
    	 Fbuttonalign.click();
     }
     
     public void getAlertName() {
    	 AlertName.getText();
     }
     
     public void getAlertFirstName() {
    	 AlertFirstName.getText();
     }
     
     public void getAlertLastName() {
    	 AlertLastName.getText();
     }
     
     public void getAlertEmail() {
    	 AlertEmail.getText();
     }
     
     public void getAlertPhoneNumber() {
    	 AlertPhoneNumber.getText();
     }
     
     public void getAlertState() {
    	 AlertState.getText(); 
     }
     
     public void getAlertPin() {
    	 AlertPin.getText();
     }
     
     public void getAlertEin() {
    	 AlertEin.getText();
     }
     
     public void clickCancel() {
    	 Cancel.click();
     }
     
     public void SetClientSearch(String Client) {
    	 ClientSearch.sendKeys(Client);
     }
     
     public void clickAlertsave() {
    	 Alertsave.click();
     }
     
     public void clickSearch() {
    	 Search.click();
     }
     public void clicktable() {
    	 table.getText();
     }
     
     public void clicksearchedData() {
    	 searchedData.click();
     }
     
     public void clickRowData() {
    	 rowData.click();
     }
     
     public void ClickResetButton() {
    	 ResetButton.click();
     }
     
     public void ClickUpdateInaactive() {
    	 UpdateInaactive.click();
     }
     
     public void ClickUpdateActive() {
    	 UpdateActive.click();
     }
     
     public void ClickDeleteButton() {
    	 DeleteButton.click();
     }
     
     public void ClickyesButton() {
    	 yesButton.click();
     }
}
