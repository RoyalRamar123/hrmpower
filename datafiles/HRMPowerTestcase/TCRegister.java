package HRMPowerTestcase;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HRMPowerObject.LoginPage;
import HRMPowerObject.RegisterObject;
import HRMPowerUtilities.XLUtility;

public class TCRegister extends BaseClass {
	
	@Test(priority=1)
	public void login() {
		LoginPage lp = new LoginPage(driver);
		lp.setUseName(username);
		lp.setPassword(password);
		lp.clicklogin();
	}
	
	@Test(priority=2)
	public void ClickNavigation() throws InterruptedException {
		RegisterObject click = new RegisterObject(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		click.sidebarmenu_btn.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		click.Attendance.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		click.Register.click();
	}
	
	@Test(priority=3, dataProvider="SetName")
	public void Attendance(String EmployeeName) throws InterruptedException, IOException {
		RegisterObject ob = new RegisterObject(driver);
		ob.SearchField.sendKeys(EmployeeName);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ob.SuggestionField.equals(EmployeeName);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement selectMyElement = driver.findElement(By.id("SuperViser0")); 
		selectMyElement.click();

		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		/*
		 * WebElement mySelectElement = driver.findElement(By.id("stylesnew")); Select
		 * dropdown= new Select (mySelectElement) ;
		 * dropdown.selectByVisibleText(EmployeeName);
		 */
		/*/ * WebElement target = ob.name; if(target.equals(EmployeeName)) {
		 * Thread.sleep(3000); ob.name.isSelected(); }else { System.out.println(false);
		 * }
		 */
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ob.Search.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Date d = new Date();
	    System.out.println(d.toString());
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File(".\\RegisterScreenShot\\"+sdf.format(d)+".png"));
	    Thread.sleep(3000);
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@DataProvider(name ="SetName")
	 public String [][] getData() throws IOException
	 {
			//get the data from excel
		    String path =".\\datafiles\\EmployeeName.xlsx";
		   
		    XLUtility xlutil=new XLUtility(path);
		    int totalrows = xlutil.getRowCount("Name");
		    int totalcols = xlutil.getcellCount("Name",1);
		   
		    String ClientAlert[][] = new String[totalrows][totalcols]; //index excel start from 1
		    for(int i=1;i<=totalrows;i++) //cell start with -1
		    {
		    	for(int j=0;j<totalcols;j++) //cell start with -0
		    	{
		    		ClientAlert[i-1][j] = xlutil.getCellData("Name", i, j);
		    		
		    	}
		    	
		    }
		return ClientAlert;
	   }
	
	@Test(priority=4, dataProvider="SetAttendance")
	public void Register(String Checkedin, String Checkedout, String CheckedType, String notes) throws InterruptedException {
		
		
		
		RegisterObject at = new RegisterObject(driver);
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy HH:mm AM/PM");
		Date date = new Date();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		at.CheckedIn.sendKeys(Checkedin);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		at.CheckedOut.sendKeys(Checkedout);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		at.CheckedOutType.sendKeys(CheckedType);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		at.Notes.sendKeys(notes);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		at.AddButton.click();
		
		
		
		
	}
	
	@DataProvider(name ="SetAttendance")
	 public String [][] getData1() throws IOException
	 {
			//get the data from excel
		    String path =".\\datafiles\\EmployeeName.xlsx";
		   
		    XLUtility xlutil=new XLUtility(path);
		    int totalrows = xlutil.getRowCount("Register");
		    int totalcols = xlutil.getcellCount("Register",1);
		   
		    String ClientAlert[][] = new String[totalrows][totalcols]; //index excel start from 1
		    for(int i=1;i<=totalrows;i++) //cell start with -1
		    {
		    	for(int j=0;j<totalcols;j++) //cell start with -0
		    	{
		    		ClientAlert[i-1][j] = xlutil.getCellData("Register", i, j);
		    		
		    	}
		    	
		    }
		return ClientAlert;
	   }

}
