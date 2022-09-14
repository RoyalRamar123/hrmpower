package HRMPowerObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {

   public static final String success_message = null;

	WebDriver driver;

	WebDriver ldriver;

	public AddEmployee (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath ="/html/body/div[1]/div/div[2]/div/nav/div[1]/div[2]/ul/li[1]/a/span")
	@CacheLookup
	public WebElement Employeemenu;
	
	
	@FindBy(xpath ="/html/body/div[1]/div/div[2]/div/nav/div[1]/div[2]/ul/li[1]/div/ul/li[1]/a")
	@CacheLookup
	public WebElement AddEmployee;
	
	@FindBy(how = How.NAME, using = "firstName")
	@CacheLookup
	public WebElement firstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	@CacheLookup
	public WebElement lastName;
	
	
	@FindBy(how = How.NAME, using = "gender")
	@CacheLookup
	public WebElement gender;
	
	@FindBy(how = How.ID, using = "input-1")
	@CacheLookup
	public WebElement Datepicker;
	
	@FindBy(how = How.NAME, using = "addressLine1")
	@CacheLookup
	public WebElement AddressLine1;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	public WebElement city;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
