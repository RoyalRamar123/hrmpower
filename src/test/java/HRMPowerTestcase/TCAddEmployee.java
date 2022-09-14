package HRMPowerTestcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.analysis.function.Divide;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import HRMPowerModule.AddEmployee;
import HRMPowerObject.AddEmployeeObject;
import HRMPowerObject.LoginPage;

public class TCAddEmployee extends BaseClass {

	@Test(priority = 1)
	public void logintest() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.setUseName(username);
		lp.setPassword(password);
		lp.clicklogin();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void navigateToAddEmployee() throws InterruptedException {
		HRMPowerObject.AddEmployeeObject addemp = new HRMPowerObject.AddEmployeeObject(driver);
		Thread.sleep(2000);
		addemp.clicksidebarmenu_btn();
		Thread.sleep(2000);
		addemp.clickEmployeemenu();
		Thread.sleep(2000);
		addemp.clickAddEmployee();
	}

	@Test(priority = 3, dataProvider = "AddEmployee")
	public void AddEmployeeObject(String firstName, String lastName, String gender, String dateOfBirth, String address,
			String city, String states, String pincode, String natioanlity, String email, String mobileNumber,
			String marital, String adharNo, String panNo, String bloodGroup, String designation, String dateOfJoining,
			String supervisor, String paycycle, String pfNumber, String compensation, String emplyementType,
			String pfCheckbox, String tdsCheckbox, String ptCheckbox, String companyName, String cdesignation,
			String periodDate, String periodTo, String doucment, String effectiveDate, String expriyDate, String status)
			throws Exception {

		HRMPowerObject.AddEmployeeObject addemp = new HRMPowerObject.AddEmployeeObject(driver);
		Thread.sleep(500);
		addemp.txtfirstName.clear();
		addemp.txtfirstName.sendKeys(firstName);
		logger.info("Firstname : " + firstName);
		addemp.txtlastName.clear();
		addemp.txtlastName.sendKeys(lastName);
		logger.info("Lastname : " + lastName);
		Thread.sleep(2000);
		addemp.rdgender.click();
		logger.info("Gender : " + gender);
		addemp.txtdatepicker.click();
		Thread.sleep(2000);
		addemp.txtyear.click();
		addemp.txtmonth.click();
		addemp.txtdate.click();
		Thread.sleep(2000);
		addemp.textaddress.clear();
		addemp.textaddress.sendKeys(address);
		logger.info("Address : " + address);
		addemp.txtcity.clear();
		addemp.txtcity.sendKeys(city);
		logger.info("City : " + city);
		// addemp.txtstates.clear();
		addemp.txtstates.sendKeys(states);
		logger.info("States : " + states);
		Thread.sleep(2000);
		addemp.txtpincode.clear();
		addemp.txtpincode.sendKeys(pincode);
		logger.info("Pincode : " + pincode);
		// addemp.txtnationality.clear();
		addemp.txtnationality.sendKeys(natioanlity);
		logger.info("Natioanlity : " + natioanlity);
		Thread.sleep(1000);
		addemp.txtemail.clear();
		addemp.txtemail.sendKeys(email);
		logger.info("Email : " + email);
		addemp.txtmobileNumber.clear();
		addemp.txtmobileNumber.sendKeys(mobileNumber);
		logger.info("MobileNumber : " + mobileNumber);
		Thread.sleep(2000);
		addemp.texmarital.click();
		logger.info("Marital : " + adharNo);
		addemp.txtaadharno.clear();
		addemp.txtaadharno.sendKeys(adharNo);
		logger.info("Adharno : " + adharNo);
		addemp.txtpanno.clear();
		addemp.txtpanno.sendKeys(panNo);
		logger.info("Panno : " + panNo);
		// addemp.txtbloodgroup.clear();
		addemp.txtbloodgroup.sendKeys(bloodGroup);
		logger.info("BloodGroup : " + bloodGroup);
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(".\\Screenshot\\" + sdf.format(d) + ".png"));
		logger.info("Basic : " + sdf.format(d) + ".png");
		addemp.nxt_btn.click();
		System.out.println("..............Basic Details Added Successfully.....................");

		// Employment-details
		// addemp.txtdesignation.clear();
		Thread.sleep(5000);
		addemp.txtdesignation.sendKeys(designation);
		logger.info("Designation : " + designation);
		Thread.sleep(2000);
		// addemp.txtemployementdatepicker.clear();
		addemp.txtemployementdatepicker.click();
		Thread.sleep(2000);
		addemp.txtemployementdatepickeryear.click();
		Thread.sleep(2000);
		addemp.txtemployementdatepickermm.click();
		Thread.sleep(2000);
		addemp.txtemployementdatepickerdd.click();
		// addemp.txtemployementdatepickerclose.click();
		addemp.txtreportingTodata.click();
		// addemp.txtreportingTo.clear();
		Thread.sleep(2000);
		addemp.txtreportingTo.sendKeys(supervisor);
		Thread.sleep(3000);
		addemp.reportingTo.click();
		logger.info("Supervisor : " + supervisor);
		Thread.sleep(2000);
		// addemp.txtpayCycle.clear();
		addemp.txtpayCycle.sendKeys(paycycle);
		logger.info("Paycycle : " + paycycle);
		Thread.sleep(2000);
		// addemp.txtpfnumber.clear();
		addemp.txtpfnumber.sendKeys(pfNumber);
		logger.info("PFnumber : " + pfNumber);
		addemp.txtcompensation.clear();
		addemp.txtcompensation.sendKeys(compensation);
		logger.info("Compensation : " + compensation);
		// addemp.txtemplyementType.clear();
		addemp.txtemplyementType.sendKeys(emplyementType);
		logger.info("EmplyementType : " + emplyementType);
		Thread.sleep(2000);
		// addemp.txtpfcheckbox.clear();
		addemp.txtpfcheckbox.click();
		logger.info("PFcheckbox : " + pfCheckbox);
		// addemp.txttdsCheckbox.clear();
		addemp.txttdsCheckbox.click();
		logger.info("TDSCheckbox : " + tdsCheckbox);
		// addemp.txtptcheckbox.clear();
		addemp.txtptcheckbox.click();
		logger.info("PTcheckbox : " + ptCheckbox);
		Date d1 = new Date();
		System.out.println(d1.toString());
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile1, new File(".\\Screenshot\\" + sdf1.format(d1) + ".png"));
		logger.info("Employment : " + sdf1.format(d1) + ".png");
		Thread.sleep(2000);
		addemp.nextbtn.click();
		Thread.sleep(2000);
		System.out.println("..............  Employment details Added Successfully  .....................");
		// previous-company-details
		// addemp.txtcompanyName.clear();
		Thread.sleep(2000);
		addemp.txtcompanyName.sendKeys(companyName);
		logger.info("Companyname   : " + companyName);
		// addemp.txtCDesignation.clear();
		addemp.txtCDesignation.sendKeys(cdesignation);
		logger.info("cdesignation  : " + cdesignation);
		Thread.sleep(2000);
		addemp.txtperioddate.sendKeys(periodDate);
		logger.info("Perioddate  : " + periodDate);
		Thread.sleep(3000);
		addemp.txtperiodTo.sendKeys(periodTo);
		logger.info("Periodto  : " + periodTo);
		Thread.sleep(2000);
		Date d2 = new Date();
		System.out.println(d2.toString());
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile2, new File(".\\Screenshot\\" + sdf1.format(d2) + ".png"));
		logger.info("Previous-company-details : " + sdf1.format(d2) + ".png");
		addemp.pcdnextbtn.click();
		System.out.println(".............. Previous-company-details Added Successfully .....................");
		// document
		// addemp.txtdoucment.clear();
		Thread.sleep(3000);
		addemp.txtdoucment.sendKeys(doucment);
		logger.info("Doucment  : " + doucment);
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/label[2]/i[1]")).click();
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].click();" ,button);
		// Thread.sleep(4000);
		addemp.fileupload.click();
		Runtime.getRuntime().exec("C://autoitfiles//fileupload" + " " + "C:\\Selenium\\Capture.PNG");
		Thread.sleep(4000);
		addemp.txteffectivedate.sendKeys(effectiveDate);
		logger.info("Effectivedate  : " + effectiveDate);
		// addemp.txtexpirydate.clear();
		Thread.sleep(2000);
		addemp.txtexpirydate.sendKeys(expriyDate);
		logger.info("Expriydate  : " + expriyDate);
		Date d3 = new Date();
		System.out.println(d2.toString());
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile3, new File(".\\Screenshot\\" + sdf1.format(d2) + ".png"));
		logger.info("Document : " + sdf1.format(d2) + ".png");

		addemp.dmnextbtn.click();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//button[contains(text(),'Add New')]")).click();
		System.out.println(".............. Employee Added Successfully .....................");

		/*
		 * String exp_title = "Employee Added Successfully"; String act_title =
		 * driver.getTitle(); if (Status.equals("New Employee")) { if
		 * (exp_title.equals(act_title)) {
		 * driver.findElement(By.xpath("//button[contains(text(),'Add New')]")).click();
		 * Assert.assertTrue(true); } else { Assert.assertFalse(false); } } else if
		 * (Status.equals("Existing Employee")) { if (exp_title.equals(act_title)) {
		 * driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		 * Assert.assertTrue(false); } else { Assert.assertTrue(true); } } }
		 */
	}

	@DataProvider(name = "AddEmployee")
	public String[][] getData() throws IOException {
		// get the data from excel
		String path = ".\\datafiles\\Employee.xlsx";

		XLUtility xlutil = new XLUtility(path);
		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getcellCount("Sheet1", 1);

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

	@Test(priority = 5)
	public void takeScreenshot() {
		// take screenshot of the page
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("Screenshot/addemp1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" New Employee Details Added Successfully");
	}

	/*
	 * @Test(priority = 3) public void Errormessage () throws Exception {
	 * 
	 * String actualerrormessge; String expectederrormessage =
	 * "Please provide the First Name ";
	 * 
	 * HRMPowerObject.AddEmployeeObject addemp = new
	 * HRMPowerObject.AddEmployeeObject(driver); addemp.nxt_btn.click();
	 * actualerrormessge=driver.findElement(By.
	 * xpath("//div[contains(text(),'Please provide the First Name')]")).getText();
	 * Assert.assertTrue(actualerrormessge.contains(expectederrormessage));
	 * System.out.println("Error appear successfully"); }
	 * 
	 * 
	 * @DataProvider(name = "Validation") public String[][] getData1() throws
	 * IOException { // get the data from excel String path =
	 * ".\\datafiles\\Employee.xlsx";
	 * 
	 * XLUtility xlutil = new XLUtility(path); int totalrows =
	 * xlutil.getRowCount("Sheet2"); int totalcols = xlutil.getcellCount("Sheet2",
	 * 1);
	 * 
	 * String addempData[][] = new String[totalrows][totalcols]; // index excel
	 * start from 1 for (int i = 1; i <= totalrows; i++) // cell start with -1 { for
	 * (int j = 0; j < totalcols; j++) // cell start with -0 { addempData[i - 1][j]
	 * = xlutil.getCellData("Sheet2", i, j);
	 * 
	 * } } return addempData; }
	 */

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@AfterSuite
	public void quitDriver1() {
		driver.quit();
	}
}
