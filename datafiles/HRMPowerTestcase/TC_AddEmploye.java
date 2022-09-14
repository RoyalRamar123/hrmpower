package HRMPowerTestcase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HRMPowerObject.LoginPage;
import HRMPowerUtilities.XLUtility;

public class TC_AddEmploye extends BaseClass {

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
	
	@Test(priority=3)
	public void EmployeeAlert() throws InterruptedException {
		HRMPowerObject.AddEmployeeObject alert = new HRMPowerObject.AddEmployeeObject(driver);
		alert.nxt_btn.click();
		Thread.sleep(3000);
		String firstAlert = alert.FirstAlert.getText();
		String alertname = "Please provide the First Name";
		if(firstAlert.equals(alertname)) {
			System.out.println(firstAlert);
		}else {
			System.out.println("Check the code" + firstAlert + "Alert message is" + alertname);
		}
	}

	@Test(priority = 4, dataProvider = "AddEmployee")
	public void AddEmployeeObject(String firstName, String lastName, String gender, String dateOfBirth, String address,
			String city, String states, String pincode, String natioanlity, String email, String mobileNumber,
			String Marital, String adharno, String panno, String bloodgroup, String designation, String DateOfJoining,
			String supervisor, String paycycle, String pfnumber, String compensation, String emplyementType,
			String pfcheckbox, String tdsCheckbox, String ptcheckbox, String companyname, String cdesignation,
			String perioddate, String periodTo, String doucment, String effectivedate, String expriydate, String Status)
			throws Exception {

		HRMPowerObject.AddEmployeeObject addemp = new HRMPowerObject.AddEmployeeObject(driver);
		Thread.sleep(1000);
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
		logger.info("Marital : " + adharno);
		addemp.txtaadharno.clear();
		addemp.txtaadharno.sendKeys(adharno);
		logger.info("Adharno : " + adharno);
		addemp.txtpanno.clear();
		addemp.txtpanno.sendKeys(panno);
		logger.info("Panno : " + panno);
		// addemp.txtbloodgroup.clear();
		addemp.txtbloodgroup.sendKeys(bloodgroup);
		logger.info("BloodGroup : " + bloodgroup);

		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(".\\Screenshot\\" + sdf.format(d) + ".png"));
		logger.info("Basic : " + sdf.format(d) + ".png");
		addemp.nxt_btn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		System.out.println(".............. Basic Details Added Successfully .....................");

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
		addemp.txtpfnumber.sendKeys(pfnumber);
		logger.info("PFnumber : " + pfnumber);
		addemp.txtcompensation.clear();
		addemp.txtcompensation.sendKeys(compensation);
		logger.info("Compensation : " + compensation);
		// addemp.txtemplyementType.clear();
		addemp.txtemplyementType.sendKeys(emplyementType);
		logger.info("EmplyementType : " + emplyementType);
		Thread.sleep(2000);
		// addemp.txtpfcheckbox.clear();
		addemp.txtpfcheckbox.click();
		logger.info("PFcheckbox : " + pfcheckbox);
		// addemp.txttdsCheckbox.clear();
		addemp.txttdsCheckbox.click();
		logger.info("TDSCheckbox : " + tdsCheckbox);
		// addemp.txtptcheckbox.clear();
		addemp.txtptcheckbox.click();
		logger.info("PTcheckbox : " + ptcheckbox);

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
		addemp.txtcompanyName.sendKeys(companyname);
		logger.info("Companyname   : " + companyname);
		// addemp.txtCDesignation.clear();
		addemp.txtCDesignation.sendKeys(cdesignation);
		logger.info("cdesignation  : " + cdesignation);
		Thread.sleep(2000);
		addemp.txtperioddate.sendKeys(perioddate);
		logger.info("Perioddate  : " + perioddate);
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
		Thread.sleep(2000);
		addemp.txteffectivedate.sendKeys(effectivedate);
		logger.info("Effectivedate  : " + effectivedate);
		// addemp.txtexpirydate.clear();
		Thread.sleep(2000);
		addemp.txtexpirydate.sendKeys(expriydate);
		logger.info("Expriydate  : " + expriydate);
		Date d3 = new Date();
		System.out.println(d2.toString());
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile3, new File(".\\Screenshot\\" + sdf1.format(d2) + ".png"));
		logger.info("Document : " + sdf1.format(d2) + ".png");

		addemp.dmnextbtn.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Add New')]")).click();
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

	@DataProvider(name = "AddEmployee")
	public String[][] getData() throws IOException {
		// get the data from excel
		String path = ".\\datafiles\\SingleEmployee.xlsx";

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

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
