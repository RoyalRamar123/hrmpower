package HRMPowerObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HRMPowerTestcase.BaseClass;

public class ResetPassword {
	
	WebDriver driver;
	
	WebDriver ldriver;
	 public ResetPassword(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 
	 @FindBy(xpath="//*[@id=\"root\"]/body/div/div/div[2]/div[2]/div/form/div[3]/span/p")
	 public WebElement reset;
	 
	 @FindBy(id = "form2")
	 public WebElement Email;
	 
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/button")
	 public WebElement Continue;
	 
	 @FindBy(className="otp-password-msg")
	 public WebElement otp_field;
	 
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div[1]")
	 public WebElement alertEmail;
	 
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div[2]/b")
	 public WebElement invalidEmail;
	 
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/a")
	 public WebElement cancel;
	 
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div[2]/strong")
	 public WebElement OTP;
	 
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div[1]/b")
	 public WebElement alert;
	 
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/a/button")
	 public WebElement cancelButton;
	 
	 public void ClickReset()
		{
		 reset.click();
		}
	 
	 public void setEmail(String EmailId) {
		 Email.sendKeys(EmailId);
	 }
	 
	 public void ClickContinue() {
		 Continue.click();
	 }
	 
	 public void otp_field(String otp) {
			otp_field.sendKeys(otp);
		}
	 
	 public void getalertEmail() {
		 alertEmail.getText();
	 }
	 
	 public void getinvalidEmail() {
		 invalidEmail.getText();
	 }
	 
	 public void getOTP() {
		 OTP.getText();
	 }
	 
	 public void getalert() {
		 alert.getText();
	 }
	 
	 public void clickcancelButton() {
		 cancelButton.click();
	 }
	}
	
	

