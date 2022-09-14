package HRMPowerTestcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import HRMPowerModule.AddHoliday;
import HRMPowerModule.SearchEmployee;
import HRMPowerObject.LoginPage;

public class TCAddHoliday extends BaseClass {

	@Test(priority = 1)
	public void logintest() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
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
	public void navigateToSearchUser() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HRMPowerObject.AddHolidayObject addHoliday = new HRMPowerObject.AddHolidayObject(driver);
		addHoliday.clicksidebarmenu_btn();
		addHoliday.clickHolidaymenu();
		addHoliday.clickAdminHoliday();
		addHoliday.clickAddHolidaybtn();
	}

	@Test(priority = 3)
	public void AddHolidayObject() throws Exception {

		HRMPowerObject.AddHolidayObject addHoliday = new HRMPowerObject.AddHolidayObject(driver);
		addHoliday.SUBMIT.click();
		logger.info("Holiday Name :" + "Please select Holiday Name");
		// addHoliday.holidayName.sendKeys(holidayname);
		logger.info("Holiday Date :" + "Please select Holiday date");
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile3, new File(".\\Screenshot\\" + sdf3.format(d) + ".png"));
		logger.info("Validation Message : " + sdf3.format(d) + ".png");

	}

	@Test(priority = 4, dataProvider = "AddHolidaydata")
	public void AddHolidayObject(String holidayName, String holidayDatePicker) throws Exception {

		HRMPowerObject.AddHolidayObject addHoliday = new HRMPowerObject.AddHolidayObject(driver);
		addHoliday.holidayName.sendKeys(holidayName);
		logger.info("holiday :" + holidayName);
		addHoliday.holidaydatepicker.click();
		Thread.sleep(2000);
		addHoliday.holidaydatepickeryear.click();
		addHoliday.holidaydatepickermonth.click();
		addHoliday.holidaydatepickerday.click();
		Thread.sleep(2000);
		// addHoliday.holidaydatepickerclose.click();
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile3, new File(".\\Screenshot\\" + sdf3.format(d) + ".png"));
		logger.info("Add Holiday : " + sdf3.format(d) + ".png");
		Thread.sleep(1000);
		addHoliday.SUBMIT.click();
		logger.info("Holiday Added successfully");
	}

	@Test(priority = 5, dataProvider = "AddHolidayupdate")
	public void AddHolidayObjects(String holidayName, String holidayDatePicker) throws Exception {

		HRMPowerObject.AddHolidayObject addHoliday = new HRMPowerObject.AddHolidayObject(driver);
		
		addHoliday.Update.click();
		
		addHoliday.holidayName.clear();
		addHoliday.holidayName.sendKeys(holidayName);
		logger.info("holiday :" + holidayName);
		addHoliday.holidaydatepicker.click();
		Thread.sleep(2000);
		addHoliday.holidaydatepickeryear.click();
		addHoliday.holidaydatepickermonth.click();
		addHoliday.holidaydatepickerday.click();
		Thread.sleep(2000);
		// addHoliday.holidaydatepickerclose.click();

		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile3, new File(".\\Screenshot\\" + sdf3.format(d) + ".png"));
		logger.info("Update Holiday : " + sdf3.format(d) + ".png");
		Thread.sleep(1000);
		
		addHoliday.SUBMIT.click();

		System.out.println("Holiday Updated successfully");
	}

	@Test(priority = 6)
	public void AddHolidayObjectss() throws Exception {
		
		HRMPowerObject.AddHolidayObject addHoliday = new HRMPowerObject.AddHolidayObject(driver);
		
		Thread.sleep(2000);
		addHoliday.delete.click();
		Thread.sleep(2000);
		logger.info("Delete Confirmation :" + "Are you sure want to delete ?");
		Thread.sleep(2000);
		addHoliday.yesbtn.click();
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile3, new File(".\\Screenshot\\" + sdf3.format(d) + ".png"));
		logger.info("Delete Holiday : " + sdf3.format(d) + ".png");
		Thread.sleep(1000);
		logger.info("Delete :" + "Deleted Successfully");
		
	}

	@DataProvider(name = "AddHolidayupdate")
	public String[][] getData1() throws IOException {
		// get the data from excel
		String path = ".\\datafiles\\Holidaydata.xlsx";

		XLUtility xlutil = new XLUtility(path);
		int totalrows = xlutil.getRowCount("Sheet2");
		int totalcols = xlutil.getcellCount("Sheet2", 1);

		String loginData[][] = new String[totalrows][totalcols]; // index excel start from 1
		for (int i = 1; i <= totalrows; i++) // cell start with -1
		{
			for (int j = 0; j < totalcols; j++) // cell start with -0
			{
				loginData[i - 1][j] = xlutil.getCellData("Sheet2", i, j);

			}

		}
		return loginData;
	}

	
	@DataProvider(name = "AddHolidaydata")
	public String[][] getData() throws IOException {
		// get the data from excel
		String path = ".\\datafiles\\Holidaydata.xlsx";

		XLUtility xlutil = new XLUtility(path);
		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getcellCount("Sheet1", 0);

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
	public void quitDriver() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@AfterSuite
	public void quitDriver1() {
		driver.quit();
	}

}

/*
 * //JSON
 * 
 * @DataProvider(name = "Addholiday") public AddHoliday[] getData()
 * {AddHoliday[] AddHolidayArray = null; try (InputStream input = new
 * FileInputStream("data/addholiday.json");) { ObjectMapper objectMapper = new
 * ObjectMapper();
 * 
 * AddHolidayArray = objectMapper.readValue(input, AddHoliday[].class); } catch
 * (Exception e) { logger.info(e.getMessage()); } return AddHolidayArray;
 * 
 * }
 */
