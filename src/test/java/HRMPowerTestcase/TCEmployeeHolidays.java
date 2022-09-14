package HRMPowerTestcase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import HRMPowerObject.LoginPage;

public class TCEmployeeHolidays extends BaseClass {

	@Test(priority = 1)
	public void logintest() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.setUseName(username);
		logger.info("username passed");
		System.out.println("Entered the username");
		lp.setPassword(password);
		logger.info("password passed");
		System.out.println("Entered the password");
		lp.clicklogin();
		logger.info("Login Successfully");
		System.out.println("Login Successfully");
	}

	@Test(priority = 2)

	public void navigateToEmployeeHolidays() throws InterruptedException, IOException {
		Thread.sleep(5000);

		HRMPowerObject.EmployeeHolidayObject EmpHoliday = new HRMPowerObject.EmployeeHolidayObject(driver);
		EmpHoliday.clicksidebarmenu_btn();
		Thread.sleep(3000);
		EmpHoliday.clickHolidaymenu();
		EmpHoliday.clickEmployeeHoliday();

		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(".\\Screenshot\\" + sdf.format(d) + ".png"));

		System.out.println("Employee view the holidays successfully");
		Thread.sleep(2000);
		// Screenshot
		// Screenshot screenshot = new AShot().takeScreenshot(driver);
		// ImageIO.write(screenshot.getImage(), "png", new
		// File("/Project/Screenshot/exa.png"));

	}

	@Test(priority = 3)
	public void takeScreenshot() {
		// take screenshot of the page
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("Screenshot/fullpage.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterTest
	public void quitDriver() {
		driver.quit();
	}

	@AfterSuite
	public void quitDriver1() {
		driver.quit();
	}

}
