package HRMPowerObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver ;
	
	WebDriver ldriver;
	 public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 
	 @FindBy(className="login_logo")
	 @CacheLookup
	 public WebElement title;
	
	@FindBy(id = "form2")
	@CacheLookup
	public WebElement txtUserName;
	
	@FindBy(id  = "PASSWORD")
	@CacheLookup
	public WebElement txtPassword;
	
	@FindBy(xpath  = "//*[@id=\"root\"]/body/div/div/div[2]/div[2]/div/form/button")
	@CacheLookup
	public WebElement Login_btn ;
	
   public void setUseName(String username)
	{
		txtUserName.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clicklogin()
	{
		Login_btn.click();
	}
	
}
