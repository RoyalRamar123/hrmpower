package HRMPowerTestcase;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import HRMPowerObject.LoginPage;

public class Login extends BaseClass{
	
	
	@Test
	public void loginDDT()
	{
		LoginPage lp =new LoginPage(driver);
		lp.setUseName(username);
		lp.setPassword(password);
		lp.clicklogin();
		
	}
}
	
	