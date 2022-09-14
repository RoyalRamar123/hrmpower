package HRMPowerTestcase;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import HRMPowerObject.LoginPage;
import HRMPowerObject.ProjectObject;
import HRMPowerUtilities.ReadConfig;
import HRMPowerUtilities.XLUtility;


public class TCProject extends BaseClass {
	ReadConfig readconfig = new ReadConfig();
	

	@Test(priority=0)
	public void login() throws InterruptedException  {
		LoginPage lp =new LoginPage(driver);
		Thread.sleep(3000);
		lp.setUseName(username);
		lp.setPassword(password);
		lp.clicklogin();
	}
	
	
	@Test(priority=1)
	public void alertMessage() throws InterruptedException, IOException {
		ProjectObject a = new ProjectObject(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		a.clicksidebarmenu_btn();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		a.clickprojectpage();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		a.clickAddproject();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		a.save.click();
		
		Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File(".\\ProjectScreenShot\\"+sdf.format(d)+".png"));
        
     
        // Alert message for Name
     	String Name = a.AlertName.getText();
     	String alertName = "Enter Project Name";
     	if(Name.equals(alertName)) {
     		System.out.println(Name);
     		AssertJUnit.assertEquals(Name, alertName);
     	}else
     	{
     		System.out.println("Expected message is not what you have?" + Name + "Expected message is" + alertName);
     	}
     	
        // Alert message for Client
     	String Client = a.ClientName.getText();
     	String alertClient = "Enter Project Name";
     	if(Client.equals(alertClient)) {
     		System.out.println(Client);
     		AssertJUnit.assertEquals(Client, alertClient);
     	}else
     	{
     		System.out.println("Expected message is not what you have?" + Client + "Expected message is" + alertClient);
     	}
     	
        // Alert message for ExpectedDate
     	String ExpectedDate = a.Expected.getText();
     	String alertExpectedDate = "Select Expected date";
     	if(ExpectedDate.equals(alertExpectedDate)) {
     		System.out.println(ExpectedDate);
     		AssertJUnit.assertEquals(ExpectedDate, alertExpectedDate);
     	}else
     	{
     		System.out.println("Expected message is not what you have?" + ExpectedDate + "Expected message is" + alertName);
     	}
     	
     // Alert message for  Start date
     	String  Startdate = a.Start.getText();
     	String alertStartdate = "Select Start date";
     	if(Startdate.equals(alertStartdate)) {
     		System.out.println(Startdate);
     		AssertJUnit.assertEquals(Startdate, alertStartdate);
     	}else
     	{
     		System.out.println("Expected message is not what you have?" + Startdate + "Expected message is" + alertStartdate);
     	}
     	
     	 // Alert message for  Completed date
     	String  Completeddate = a.Completed.getText();
     	String alertCompleteddate = "Select Complete date";
     	if(Startdate.equals(Completeddate)) {
     		System.out.println(Completeddate);
     		AssertJUnit.assertEquals(Completeddate, alertCompleteddate);
     	}else
     	{
     		System.out.println("Expected message is not what you have?" + Completeddate + "Expected message is" + alertCompleteddate);
     	}
     	
     	
     	
	}
	@Test(priority=2,dataProvider="ProjectData")
	public void projectTest(String Name, String Client,String Description) throws InterruptedException {
		ProjectObject ps = new ProjectObject(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clicksidebarmenu_btn();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickprojectpage();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickAddproject();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.setProjectname(Name);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.SetClientdropdown(Client);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickExpecteddate();
		/*
		 * Actions a = new Actions(driver);
		 * a.moveToElement(ps.clickyeardate()).build().perform();
		 */
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickyeardate();
		Select drop = new Select(ps.clickyeardate());
		drop.selectByVisibleText("2023");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickmonth();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickdate();
		
		
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickStartdate();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickyeardate();
		Select drop1 = new Select(ps.clickyeardate());
		drop1.selectByVisibleText("2023");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickmonth2();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickdate();
	
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickCompleteddate();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickyeardate();
		Select drop2 = new Select(ps.clickyeardate());
		drop2.selectByVisibleText("2023");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickarrow();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickmonth2();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickcompleteddate();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Select drop21 = new Select(ps.clickyeardate());
		drop21.selectByVisibleText("2023");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ps.clickmonth2();
	
	}
		
	@DataProvider(name ="ProjectData")
	   public String [][] getData() throws IOException
	   {
			//get the data from excel
		    String path =".\\datafiles\\ProjectTestdata.xlsx";
		   
		    XLUtility xlutil=new XLUtility(path);
		    int totalrows = xlutil.getRowCount("Sheet1");
		    int totalcols = xlutil.getcellCount("Sheet1",1);
		   
		    String ProjectData[][] = new String[totalrows][totalcols]; //index excel start from 1
		    for(int i=1;i<=totalrows;i++) //cell start with -1
		    {
		    	for(int j=0;j<totalcols;j++) //cell start with -0
		    	{
		    		ProjectData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
		    		
		    	}
		    	
		    }
		return ProjectData;
	   }
	

}
