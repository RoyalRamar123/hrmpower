package HRMPowerTestcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HRMPowerUtilities.ReadConfig;

public class TCLoginTest {

	ReadConfig readconfig = new ReadConfig();
	public String baseurl = readconfig.getApplicationURL();

	WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup() throws Exception {

		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String user, String pwd, String exp) throws Exception {
		logger = org.apache.log4j.Logger.getLogger("HRMpower");
		PropertyConfigurator.configure("log4j.properties");
		driver.get(baseurl);
		Thread.sleep(2000);

		WebElement txtEmail = driver.findElement(By.name("userName"));
		txtEmail.clear();
		txtEmail.sendKeys(user);
		logger.info("Email     : " + user);

		WebElement txtpassword = driver.findElement(By.name("password"));
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
		logger.info("Password  : " + pwd);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		//logger.error("Errormessage  : " + "Enter the valid UserName or Password");
		Thread.sleep(2000);
		
		String exp_title = "DashBorad";
		String act_title = driver.getTitle();

		if (exp.equals("Vaild")) {
			if (exp_title.equals(act_title)) {
				
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
		} else if (exp.equals("Invaild")) {
			if (exp_title.equals(act_title)) {
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}

	}

	@DataProvider(name = "LoginData")
	public String[][] getData() throws IOException {
		// get the data from excel
		String path = ".\\datafiles\\Logindata.xlsx";

		XLUtility xlutil = new XLUtility(path);
		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getcellCount("Sheet1", 1);

		String loginData[][] = new String[totalrows][totalcols]; // index excel start from 1
		for (int i = 1; i <= totalrows; i++) // cell start with -1
		{
			for (int j = 0; j < totalcols; j++) // cell start with -0
			{
				loginData[i - 1][j] = xlutil.getCellData("Sheet1", i, j);

			}

		}
		return loginData;
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@AfterSuite
	public void quitDriver1() {
		driver.quit();
	}
}