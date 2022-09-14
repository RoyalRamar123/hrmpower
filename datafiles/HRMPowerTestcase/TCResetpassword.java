package HRMPowerTestcase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HRMPowerObject.ResetPassword;
import HRMPowerUtilities.ReadConfig;
import HRMPowerUtilities.XLUtility;

public class TCResetpassword extends BaseClass{
	
	ReadConfig readconfig = new ReadConfig();
	public String baseurl = readconfig.getApplicationURL();
	
	
    @Test  (priority=0, dataProvider ="ResetData")
    public void reset(String Email) throws InterruptedException, IOException {
    	
    	
    	ResetPassword rst = new ResetPassword(driver);
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	rst.reset.click();
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	rst.Email.sendKeys(Email);
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	rst.ClickContinue();
    	
    	Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File(".\\ProjectScreenShot\\"+sdf.format(d)+".png"));
    	Thread.sleep(3000);
    	String otp=rst.OTP.getText();
    	String messageotp = "Check your email for OTP";
    	
    	if(otp.equals(messageotp)) {
     		System.out.println(otp);
     		AssertJUnit.assertEquals(otp, messageotp);
     	}else
     	{
     		System.out.println("Expected message is not what you have?" + otp + "Expected message is" + messageotp);
     	}
		/*
		 * if(InvalidEmail.equals(messagealert)) { System.out.println(InvalidEmail);
		 * AssertJUnit.assertEquals(InvalidEmail, messagealert); }
		 * 
		 * Thread.sleep(3000); rst.cancelButton.click();
		 */
    	
    	//driver.navigate().back();
		/*
		 * WebElement alert = driver.findElement(By.className("error_msg_para"));
		 * alert.getText(); System.out.println(alert.getText());
		 */   	
		
		/*
		 * HRMPowerObject.Emails otpmailread = new HRMPowerObject.Emails(); BaseClass
		 * baseClass = new BaseClass(); String mailFolderName = "Inbox"; String
		 * emailSubjectContent = "forgot password link"; String emailContent =
		 * "Your OTP Number "; int lengthOfOTP = 6;
		 * 
		 * 
		 * Thread.sleep(4000);
		 * 
		 * 
		 * String otp_value = baseClass.OutlookMailReader(mailFolderName,
		 * emailSubjectContent, emailContent, lengthOfOTP);
		 * System.out.println(otp_value);
		 * 
		 * String array1[] = otp_value.split(" ");
		 * System.out.println(array1[array1.length-1]);
		 * 
		 * Thread.sleep(4000); rst.otp_field(array1[array1.length-1]);
		 */
    }
    
    @DataProvider(name="ResetData")
    public String[][] getData() throws IOException{
    	String path =".\\datafiles\\Reset.xlsx";
    	XLUtility xlutil=new XLUtility(path);
	    int totalrows = xlutil.getRowCount("Sheet1");
	    int totalcols = xlutil.getcellCount("Sheet1",0);
	   
	    String ResetData[][] = new String[totalrows][totalcols]; //index excel start from 1
	    for(int i=1;i<=totalrows;i++) //cell start with -1
	    {
	    	for(int j=0;j<totalcols;j++) //cell start with -0
	    	{
	    		ResetData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
	    		
	    	}
	    	
	    }
	return ResetData;
		
    }
    
   @Test(priority=1, dataProvider="InvalidData")
    public void alertValidation(String Email) throws IOException, InterruptedException {
    	ResetPassword a = new ResetPassword(driver);
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	a.cancelButton.click();
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	a.Email.sendKeys(Email);
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	a.Continue.click();
    	Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File(".\\RegisterScreenShot\\"+sdf.format(d)+".png"));
        
        String Email1 = a.alertEmail.getText();
        String alertEmail = "Please enter the email id";
        if(Email1.equals(alertEmail)) {
     		System.out.println(Email1);
     		AssertJUnit.assertEquals(Email1, alertEmail);
     	}else
     	{
     		System.out.println("Expected message is not what you have?" + Email1 + "Expected message is" + alertEmail);
     	}
        
		/*
		 * Thread.sleep(3000); a.cancelButton.click();
		 * 
		 * 
		 * 
		 * String enteredEmail = a.invalidEmail.getText(); String invalidEmail =
		 * "Please enter the registered email id.";
		 * if(enteredEmail.equals(invalidEmail)) { System.out.println(enteredEmail);
		 * AssertJUnit.assertEquals(enteredEmail, invalidEmail); }else {
		 * System.out.println("Expected message is not what you have?" + enteredEmail +
		 * "Expected message is" + invalidEmail); }
		 */
        
    }
    
    @DataProvider(name="InvalidData")
    public String[][] getData1() throws IOException{
    	String path =".\\datafiles\\Reset2.xlsx";
    	XLUtility xlutil=new XLUtility(path);
	    int totalrows = xlutil.getRowCount("Email");
	    int totalcols = xlutil.getcellCount("Email",0);
	   
	    String ResetData[][] = new String[totalrows][totalcols]; //index excel start from 1
	    for(int i=1;i<=totalrows;i++) //cell start with -1
	    {
	    	for(int j=0;j<totalcols;j++) //cell start with -0
	    	{
	    		ResetData[i-1][j] = xlutil.getCellData("Email", i, j);
	    		
	    	}
	    	
	    }
	return ResetData;
		
    }
    
   
}
