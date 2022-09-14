package HRMPowerTestcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import HRMPowerModule.AddEmployee;
import HRMPowerModule.AddHoliday;
import HRMPowerModule.EmployeeLeave;
import HRMPowerObject.LoginPage;

public class TCLeaveEmployee extends BaseClass {

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
	public void navigateToSearchUser() throws InterruptedException {

		HRMPowerObject.EmployeeleaveObjects addleave = new HRMPowerObject.EmployeeleaveObjects(driver);
		Thread.sleep(2000);
		addleave.clicksidebarmenu_btn();
		Thread.sleep(2000);
		addleave.clickLeave();
		Thread.sleep(2000);
		addleave.clickEmployeeLeave();
		Thread.sleep(2000);
		addleave.clickAddLeavebtn();

	}

	@Test(priority = 3, dataProvider = "LeaveEmployee")
	public void EmployeeleaveObjects(String requestFrom, String requesTo, String leaveType, String reasonForLeave)
			throws InterruptedException, IOException {

		HRMPowerObject.EmployeeleaveObjects addLeave = new HRMPowerObject.EmployeeleaveObjects(driver);
		Thread.sleep(3000);
		addLeave.clickrequestFrom.click();
		addLeave.requestFrom.sendKeys(requestFrom);
		addLeave.requestTO.click();
		addLeave.requestTO.sendKeys(requesTo);
		addLeave.leaveType.sendKeys(leaveType);
		addLeave.reasonforLeave.sendKeys(reasonForLeave);
		addLeave.submit.click();
		// addLeave.close_btn.click();

		Date d1 = new Date();
		System.out.println(d1.toString());
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile1, new File(".\\Screenshot\\" + sdf1.format(d1) + ".png"));
		logger.info("Employment : " + sdf1.format(d1) + ".png");
		//addLeave.toast_message.click();
		Thread.sleep(2000);
        //addLeave.clickAddLeavebtn();
		addLeave.reset_btn.click();

	}
	
	
	@Test(priority = 4, dataProvider = "updateleave")
	  public void EmployeeleaveObjectss (String requestFrom, String requesTo, String leaveType, String reasonForLeave) throws Exception {
		HRMPowerObject.EmployeeleaveObjects addLeave = new HRMPowerObject.EmployeeleaveObjects(driver);
		Thread.sleep(3000);
		addLeave.editLeave.click();
		addLeave.clickrequestFrom.click();
		addLeave.requestFrom.clear();
		addLeave.requestFrom.sendKeys(requestFrom);
		addLeave.requestTO.click();
		addLeave.requestTO.clear();
		addLeave.requestTO.sendKeys(requesTo);
		addLeave.leaveType.sendKeys(leaveType);
		addLeave.reasonforLeave.sendKeys(reasonForLeave);
		addLeave.reasonforLeave.clear();
		addLeave.submit.click();
		Thread.sleep(2000);
		addLeave.reset_btn.click();
	 }
	
	@Test(priority =5)
	public void EmployeeleaveObjectsss () throws Exception {
	HRMPowerObject.EmployeeleaveObjects addLeave = new HRMPowerObject.EmployeeleaveObjects(driver);
	
	
	
	}
	
	
	
	
	
	@DataProvider(name = "LeaveEmployee")
	public String[][] getData() throws IOException {
		// get the data from excel
		String path = ".\\datafiles\\Leave.xlsx";

		XLUtility xlutil = new XLUtility(path);
		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getcellCount("Sheet1", 0);

		String addempData[][] = new String[totalrows][totalcols]; // index excel start from 1
		for (int i = 1; i <= totalrows; i++) // cell start with -1
		{
			for (int j = 0; j < totalcols; j++) // cell start with -0
			{
				addempData[i - 1][j] = xlutil.getCellData("Sheet1", i, j);

			}
		}
		return addempData;
	}


	@DataProvider(name = "updateleave")
	public String[][] getData11() throws IOException {
		// get the data from excel
		String path = ".\\datafiles\\Leaveupdate data.xlsx";
        XLUtility xlutil = new XLUtility(path);
		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getcellCount("Sheet1", 0);

		String addempData[][] = new String[totalrows][totalcols]; // index excel start from 1
		for (int i = 1; i <= totalrows; i++) // cell start with -1
		{
			for (int j = 0; j < totalcols; j++) // cell start with -0
			{
				addempData[i - 1][j] = xlutil.getCellData("Sheet1", i, j);

			}
		}
		return addempData;
	}
	
	
	
	
	
	
	
	
	
	/*
	 * @DataProvider(name = "LeaveEmployee") public EmployeeLeave[] getData()
	 * {EmployeeLeave[] EmployeeLeaveArray = null; try (InputStream input = new
	 * FileInputStream("data/employeeleave.json");) { ObjectMapper objectMapper =
	 * new ObjectMapper();
	 * 
	 * EmployeeLeaveArray = objectMapper.readValue(input, EmployeeLeave[].class); }
	 * catch (Exception e) { logger.info(e.getMessage()); } return
	 * EmployeeLeaveArray;
	 * 
	 * }
	 */
}
