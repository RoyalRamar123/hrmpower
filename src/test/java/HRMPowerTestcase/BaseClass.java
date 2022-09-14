package HRMPowerTestcase;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import HRMPowerUtilities.ReadConfig;




public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public String baseurl = readconfig.getApplicationURL();
	public String username = readconfig.getusername();
	public String password = readconfig.getpassword();
	public static WebDriver driver;

	public static Logger logger;

	@Parameters("browser")
	@Test
	public void setup() {
		 logger = org.apache.log4j.Logger.getLogger("HRMpower");
		 PropertyConfigurator.configure("log4j.properties");

			System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get(baseurl);
	}

	/*
	 * @AfterClass public void terdown() { driver.quit(); }
	 */


}

