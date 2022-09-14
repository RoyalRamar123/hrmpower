package HRMPowerObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterObject {
	
       WebDriver driver;
	
	   WebDriver ldriver;

	   public RegisterObject (WebDriver rdriver) {
	       ldriver = rdriver;
   	       PageFactory.initElements(rdriver, this);
	   }
	   
	   @FindBy(id = "sidebarmenu_btn")
	   public WebElement sidebarmenu_btn;
	   
	   @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/ul/li[8]/span")
	   public WebElement Attendance;
	   
	   @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/ul/div[5]/ul/a[1]/li")
	   public WebElement Register;
	   
	   @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]")
	   public WebElement CloseMenu;
	   
	   @FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[1]/div/div/div[1]/div/input")
	   public WebElement SearchField;
	   
	   @FindBy(className="square-btn-checkinsearch-checkin")
	   public WebElement SuggestionField;
	   
	   @FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[1]/div/div/div[5]/div/span[1]/i")
	   public WebElement Search;
	   
	   @FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[1]/div/div[1]/div/div[3]/button/span[1]")
	   public WebElement ToastClose;
	   
	   @FindBy(name="checkinDate")
	   public WebElement CheckedIn;
	   
	   @FindBy(name="checkoutDate")
	   public WebElement CheckedOut;
	   
	   @FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[3]/select")
	   public WebElement CheckedOutType;
	   
	   @FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div[4]/div/input")
	   public WebElement Notes;
	   
	   @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div/div/div[5]/div/div[2]/div/span/i/button")
	   public WebElement AddButton;
	   
	   
	   @FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[3]/div/div/div/button[1]")
	   public WebElement SaveButton;
	   
	   @FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div[1]/div/div/div[1]/div/div/div/div")
	   public WebElement name;
	   
	   public void clicksidebarmenu_btn() {
			sidebarmenu_btn.click();
		}
	   
	   public void clickAttendance() {
		   Attendance.click();
		}
	   
	   public void clickRegister() {
		   Register.click();
	   }
	   
	   public void clickCloseMenu() {
		   CloseMenu.click();
	   }
	   
	   public void setSearchField(String EmployeeName) {
		   SearchField.sendKeys(EmployeeName);
	   }
	   
	   public void clickSuggestionField() {
		   SuggestionField.click();
	   }
	   
	   public void clickSearch() {
		   Search.click();
	   }
	   
	   public void clickToastClose() {
		   ToastClose.click();
	   }
	   
	   public void setCheckedIn(String Checkedin) {
		   CheckedIn.sendKeys(Checkedin);
	   }
	   
	   public void setCheckedOut(String Checkedout) {
		   CheckedOut.sendKeys(Checkedout);
	   }
	   
	   public void setCheckedOutType(String CheckedType) {
		   CheckedOutType.sendKeys(CheckedType);
	   }
	   
	   public void setNotes(String notes) {
		   Notes.sendKeys(notes);
	   }
	   
	   public void clickAddButton() {
		   AddButton.click();
	   }
	   
	   public void clickSaveButton() {
		   SaveButton.click();
	   }
	   
	   public void clickname() {
		   name.click();
	   }
	   
	   
	   

}
