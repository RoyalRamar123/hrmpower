package HRMPowerTestcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import HRMPowerObject.LoginPage;
import HRMPowerUtilities.ReadConfig;
import HRMPowerUtilities.XLUtility;

public class TCClient extends BaseClass {

	ReadConfig readconfig = new ReadConfig();
	String Name, FirstName, LastName, Email, PhoneNumber, Address, City, State, Zip, Ein;
	String xlFilePath = ".\\\\datafiles\\\\client.xlsx";
	String sheetName = "Sheet1";
	XLUtility excel = null;


	@Test(priority=1)
	public void login() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUseName(username);
		lp.setPassword(password);
		lp.clicklogin();
		
	
	}
		
		@Test(priority=2)	
		public void navigate() throws InterruptedException{
		HRMPowerObject.ClientObject cs = new HRMPowerObject.ClientObject(driver);
		Thread.sleep(2000);
		cs.clicksidebarmenu_btn();
		Thread.sleep(2000);
		cs.clickclient_page();
		Thread.sleep(2000);
		cs.clickAddClient();
		Thread.sleep(3000);
	}
		
		@Test(priority=3)
		public void alertMessages() throws InterruptedException, IOException {
			HRMPowerObject.ClientObject am = new HRMPowerObject.ClientObject(driver);
			
			// Click Button Function
			Thread.sleep(2000);
			am.Fbuttonalign.click();
			
			// Alert message for Name
			String name = am.AlertName.getText();
			String alertMessage = "Enter the client name";
			if(name.equals(alertMessage)) {
				System.out.println(name);
				AssertJUnit.assertEquals(name, alertMessage);
			}else
			{
				System.out.println("Expected message is not what you have?" + name + "Expected message is" + alertMessage);
			}
			
			// Alert message for FirstName
			String FirstName = am.AlertFirstName.getText();
			String alertFirstName = "Enter the contact person name";
			if(FirstName.equals(alertFirstName)) {
				System.out.println(FirstName);
				AssertJUnit.assertEquals(FirstName, alertFirstName);
			}else
			{
				System.out.println("Expected message is not what you have?" + FirstName + "Expected message is" + alertFirstName);
			}
			
			// Alert message for LastName
			String LastName = am.AlertLastName.getText();
			String alertLastName = "Enter the contact person name";
			if(LastName.equals(alertLastName)) {
				System.out.println(LastName);
				AssertJUnit.assertEquals(LastName, alertLastName);
			}else
			{
				System.out.println("Expected message is not what you have?" + LastName + "Expected message is" + alertLastName);
			}
			
			// Alert message for AlertEmail
			String AlertEmail = am.AlertEmail.getText();
			String alertAlertEmail = "Email is not Valid";
			if(AlertEmail.equals(alertAlertEmail)) {
				System.out.println(AlertEmail);
				AssertJUnit.assertEquals(AlertEmail, alertAlertEmail);
			}else
			{
				System.out.println("Expected message is not what you have?" + AlertEmail + "Expected message is" + alertAlertEmail);
			}
			
			// Alert message for AlertPhoneNumber
			String AlertPhoneNumber = am.AlertPhoneNumber.getText();
			String alertPhoneNumber = "Enter the phone number";
			if(AlertPhoneNumber.equals(alertPhoneNumber)) {
				System.out.println(AlertPhoneNumber);
				AssertJUnit.assertEquals(AlertPhoneNumber, alertPhoneNumber);
			}else
			{
				System.out.println("Expected message is not what you have?" + AlertPhoneNumber + "Expected message is" + alertPhoneNumber);
			}
			
			// Alert message for AlertState
			String AlertState = am.AlertState.getText();
			String alertState = "Select your state";
			if(AlertState.equals(alertState)) {
				System.out.println(AlertState);
				AssertJUnit.assertEquals(AlertState, alertState);
			}else
			{
				System.out.println("Expected message is not what you have?" + AlertState + "Expected message is" + alertState);
			}
			
			// Alert message for AlertPin
			String AlertPin = am.AlertPin.getText();
			String alertAlertPin = "Enter the pin code";
			if(AlertPin.equals(alertAlertPin)) {
				System.out.println(AlertPin);
				AssertJUnit.assertEquals(AlertPin, alertAlertPin);
			}else
			{
				System.out.println("Expected message is not what you have?" + AlertPin + "Expected message is" + alertAlertPin);
			}
			
			// Alert message for AlertEin
			String AlertEin = am.AlertEin.getText();
			String alertAlertEin = "Enter the ein number";
			if(AlertEin.equals(alertAlertEin)) {
				System.out.println(AlertEin);
				AssertJUnit.assertEquals(AlertEin, alertAlertEin);
			}else
			{
				System.out.println("Expected message is not what you have?" + AlertEin + "Expected message is" + alertAlertEin);
			}
			
			Date d = new Date();
	        System.out.println(d.toString());

	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        // Now you can do whatever you need to do with it, for example copy somewhere
	        FileUtils.copyFile(scrFile, new File(".\\ScreenShot\\"+sdf.format(d)+".png"));
			
			am.Cancel.click();
			Thread.sleep(2000);
			
		}
		
		@Test(priority=4, dataProvider="ClientAlert")
		public void AddClientAlert(String Name, String FirstName,String LastName,String Email,
				 String PhoneNumber,String Address,String City,String State,String Zip,String Ein) throws InterruptedException, IOException {
			
			HRMPowerObject.ClientObject aa = new HRMPowerObject.ClientObject(driver);
			Thread.sleep(3000);
			aa.clickAddClient();
			aa.FName.click();
			aa.FName.clear();
			aa.FName.sendKeys(Name);
			Thread.sleep(3000);
			aa.FFirstName.clear();
	        aa.FFirstName.sendKeys(FirstName);
	        aa.FSecondName.clear();
			aa.FSecondName.sendKeys(LastName);
			aa.Femail.clear();
			aa.Femail.sendKeys(Email);
			aa.FPhonenumber.sendKeys(PhoneNumber);
			aa.FPhonenumber.clear();
			aa.FAddress.sendKeys(Address);
			
			aa.FAddress.clear();
			aa.FCity.sendKeys(City);
			
			aa.FCity.clear();
			Thread.sleep(2000);
			aa.FStates.sendKeys(State);
			
	        aa.FPinno.sendKeys(Zip);
	        
	        aa.Feinno.sendKeys(Ein);
	        Date d1 = new Date();
	        System.out.println(d1.toString());

	        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File(".\\ScreenShot\\"+sdf1.format(d1)+".png"));
	        aa.Fbuttonalign.click();
	        Thread.sleep(3000);
	        aa.Cancel.click();
			
		}
		
		
		 @DataProvider(name ="ClientAlert")
		 public String [][] getData() throws IOException
		 {
				//get the data from excel
			    String path =".\\datafiles\\AlertData.xlsx";
			   
			    XLUtility xlutil=new XLUtility(path);
			    int totalrows = xlutil.getRowCount("Sheet1");
			    int totalcols = xlutil.getcellCount("Sheet1",1);
			   
			    String ClientAlert[][] = new String[totalrows][totalcols]; //index excel start from 1
			    for(int i=1;i<=totalrows;i++) //cell start with -1
			    {
			    	for(int j=0;j<totalcols;j++) //cell start with -0
			    	{
			    		ClientAlert[i-1][j] = xlutil.getCellData("Sheet1", i, j);
			    		
			    	}
			    	
			    }
			return ClientAlert;
		   }

	@Test (priority=5, dataProvider = "ClientData")
	 public void Client(String Name, String FirstName,String LastName,String Email,
	 String PhoneNumber,String Address,String City,String State,String Zip,String Ein)throws Exception {
		
	    HRMPowerObject.ClientObject cs = new HRMPowerObject.ClientObject(driver);
		Thread.sleep(3000);
		
		cs.clickAddClient();
		cs.FName.click();
		cs.FName.clear();
		cs.FName.sendKeys(Name);
		
		Thread.sleep(3000);
		cs.FFirstName.clear();
        cs.FFirstName.sendKeys(FirstName);
        
        cs.FSecondName.clear();
		cs.FSecondName.sendKeys(LastName);
		
		cs.Femail.clear();
		cs.Femail.sendKeys(Email);
		
		cs.FPhonenumber.sendKeys(PhoneNumber);
		
		cs.FPhonenumber.clear();
		cs.FAddress.sendKeys(Address);
		
		cs.FAddress.clear();
		cs.FCity.sendKeys(City);
		
		cs.FCity.clear();
		Thread.sleep(2000);
		cs.FStates.sendKeys(State);
		
        cs.FPinno.sendKeys(Zip);
        
        cs.Feinno.sendKeys(Ein);
        Date d2 = new Date();
        System.out.println(d2.toString());

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(".\\ScreenShot\\"+sdf2.format(d2)+".png"));
        
        cs.Fbuttonalign.click();
        Thread.sleep(3000);
        cs.Alertsave.click();
        Thread.sleep(3000);
        cs.Cancel.click();
        
     }
	
	   @DataProvider(name ="ClientData")
	   public String [][] getData1() throws IOException
	   {
			//get the data from excel
		    String path =".\\datafiles\\client.xlsx";
		   
		    XLUtility xlutil=new XLUtility(path);
		    int totalrows = xlutil.getRowCount("Sheet1");
		    int totalcols = xlutil.getcellCount("Sheet1",1);
		   
		    String ClientData[][] = new String[totalrows][totalcols]; //index excel start from 1
		    for(int i=1;i<=totalrows;i++) //cell start with -1
		    {
		    	for(int j=0;j<totalcols;j++) //cell start with -0
		    	{
		    		ClientData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
		    		
		    	}
		    	
		    }
		return ClientData;
	   }
	
	   
	   @Test(priority=6, dataProvider="SearchData")
	   public void search(String Name, String FirstName,String LastName,String Email,
				 String PhoneNumber,String Address,String City,String State,String Zip,String Ein) throws InterruptedException, IOException {
		   HRMPowerObject.ClientObject search = new HRMPowerObject.ClientObject(driver);
		   Thread.sleep(3000);
		   search.ClientSearch.click();
		   search.ClientSearch.clear();
		   search.ClientSearch.sendKeys(Name);
		   search.Search.click();
		   Thread.sleep(3000);
		   Date d3 = new Date();
	       System.out.println(d3.toString());
	       SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
	       File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(scrFile, new File(".\\ScreenShot\\"+sdf3.format(d3)+".png"));
	       Thread.sleep(3000);
		   search.ResetButton.click();
		   System.out.println(search.table.getText());
           
		   
		   // updating active element
		   Thread.sleep(3000);
		   search.UpdateActive.click();
	       search.FName.clear();
		   search.FName.sendKeys(Name);
		   Thread.sleep(3000);
		   search.FFirstName.clear();
		   search.FFirstName.sendKeys(FirstName); 
		   search.FSecondName.clear();
		   search.FSecondName.sendKeys(LastName);
		   search.Femail.clear();
		   search.Femail.sendKeys(Email);	
		   search.FPhonenumber.clear();
		   search.FPhonenumber.sendKeys(PhoneNumber);
		   search.FAddress.clear();
		   search.FAddress.sendKeys(Address);
		   search.FCity.clear();
		   search.FCity.sendKeys(City);
		   Thread.sleep(2000);
		   search.FStates.sendKeys(State);
		   search.FPinno.clear();
		   search.FPinno.sendKeys(Zip);
		   search.Feinno.clear();
	       search.Feinno.sendKeys(Ein);
	       Date d4 = new Date();
	       System.out.println(d4.toString());
	       SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
	       File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(scrFile1, new File(".\\ScreenShot\\"+sdf4.format(d4)+".png"));
	       search.Fbuttonalign.click();
	       Thread.sleep(3000);
	       search.Alertsave.click();
	       Thread.sleep(3000);
	       search.Cancel.click();
		   
		   
			/*
			 * if(data.equals(client)) { search.rowData.click();
			 * 
			 * }else { System.out.println("Your code is wrong. Kindly change"); }
			 */
	   }
	   
	   @DataProvider(name ="SearchData")
	   public String [][] getData2() throws IOException
	   {
			//get the data from excel
		    String path =".\\datafiles\\SearchData.xlsx";
		   
		    XLUtility xlutil=new XLUtility(path);
		    int totalrows = xlutil.getRowCount("Search");
		    int totalcols = xlutil.getcellCount("Search",1);
		   
		    String ClientData[][] = new String[totalrows][totalcols]; //index excel start from 1
		    for(int i=1;i<=totalrows;i++) //cell start with -1
		    {
		    	for(int j=0;j<totalcols;j++) //cell start with -0
		    	{
		    		ClientData[i-1][j] = xlutil.getCellData("Search", i, j);
		    		
		    	}
		    	
		    }
		return ClientData;
	   }
	   
	   @Test(priority=7, dataProvider = "UpdateData")
	   public void update(String ClientName) throws InterruptedException, IOException {
		   HRMPowerObject.ClientObject update = new HRMPowerObject.ClientObject(driver);
		   Thread.sleep(3000);
		   update.ClientSearch.click();
		   update.ClientSearch.clear();
		   update.ClientSearch.sendKeys(ClientName);
		   update.DeleteButton.click();
		   Date d5 = new Date();
	       System.out.println(d5.toString());
	       SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
	       File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(scrFile2, new File(".\\ScreenShot\\"+sdf5.format(d5)+".png"));
	       update.yesButton.click();
	       Thread.sleep(3000);
	       update.DeleteButton.click();
	       update.yesButton.click();
	   }
	   
	   @DataProvider(name ="UpdateData")
	   public String [][] getData3() throws IOException
	   {
			//get the data from excel
		    String path =".\\datafiles\\Update.xlsx";
		   
		    XLUtility xlutil=new XLUtility(path);
		    int totalrows = xlutil.getRowCount("Sheet1");
		    int totalcols = xlutil.getcellCount("Sheet1",1);
		   
		    String ClientData[][] = new String[totalrows][totalcols]; //index excel start from 1
		    for(int i=1;i<=totalrows;i++) //cell start with -1
		    {
		    	for(int j=0;j<totalcols;j++) //cell start with -0
		    	{
		    		ClientData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
		    		
		    	}
		    	
		    }
		return ClientData;
	   }

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
 * @DataProvider(name ="ClientData") public Object[][] userFormData() throws
 * Exception { Object[][] data = testData(xlFilePath, sheetName); return data; }
 * 
 * public Object[][] testData(String xlFilePath, String sheetName) throws
 * Exception { Object[][] excelData = null; excel = new XLUtility(xlFilePath);
 * int rows = excel.getRowCount(sheetName); int columns =
 * excel.getcellCount(sheetName, 1);
 * 
 * excelData = new Object[rows-1][columns];
 * 
 * for(int i=1; i<rows; i++) { for(int j=0; j<columns; j++) { excelData[i-1][j]
 * = excel.getCellData(sheetName, j, i); }
 * 
 * } return excelData; }
 * 
 * 
 * }
 */
/*
 * @DataProvider(name ="ClientData") public Object[][] getData() throws
 * IOException, InterruptedException { //Read the Excel File ExcelInput = new
 * File(".\\\\datafiles\\\\ClientTestData.xlsx"); FileInputStream FileInput =
 * new FileInputStream(ExcelInput); XSSFWorkbook GetValues = new
 * XSSFWorkbook(FileInput); XSSFSheet DataSheet =
 * GetValues.getSheet("TestData");
 * 
 * int RowCount = DataSheet.getLastRowNum(); int Rowcount =
 * DataSheet.getFirstRowNum(); int totalCount = RowCount - Rowcount; Integer
 * intObj = new Integer(totalCount);
 * 
 * System.out.println(totalCount);
 * 
 * //Loop to Get Multiple Values for(int i = 1; i<RowCount+1; i++) { XSSFRow
 * DataSheetRow = DataSheet.getRow(i); XSSFCell XLName =
 * DataSheetRow.getCell(0); Name = XLName.toString(); System.out.println(Name);
 * 
 * XSSFCell XLFirstName = DataSheetRow.getCell(1); FirstName =
 * XLFirstName.toString();
 * 
 * 
 * XSSFCell XLLastName = DataSheetRow.getCell(2); LastName =
 * XLLastName.toString();
 * 
 * 
 * XSSFCell XLEmail = DataSheetRow.getCell(3); Email = XLEmail.toString();
 * 
 * 
 * 
 * //XSSFCell XLPhoneNumber = DataSheetRow.getCell(3); String XLPhoneNumber =
 * new DataFormatter().formatCellValue(DataSheetRow.getCell(4)); PhoneNumber =
 * XLPhoneNumber.toString(); System.out.println(XLPhoneNumber);
 * 
 * 
 * XSSFCell XLAddress = DataSheetRow.getCell(5); Address = XLAddress.toString();
 * 
 * 
 * XSSFCell XLCity = DataSheetRow.getCell(6); City = XLCity.toString();
 * 
 * 
 * XSSFCell XLState = DataSheetRow.getCell(7); State = XLState.toString();
 * //FormState.deselectAll();
 * 
 * 
 * XSSFCell XLZip = DataSheetRow.getCell(8); Zip = XLZip.toString();
 * System.out.println(Zip);
 * 
 * 
 * XSSFCell XLEin = DataSheetRow.getCell(9); Ein = XLEin.toString();
 * 
 * 
 * 
 * Thread.sleep(2000); } GetValues.close(); return intObj; } }
 */
       /* File ExcelInput = new File(".\\\\\\\\datafiles\\\\\\\\Clientdata.xlsx");
  	  FileInputStream FileInput = new FileInputStream(ExcelInput);
  	  XSSFWorkbook GetValues = new XSSFWorkbook(FileInput);
  	  XSSFSheet DataSheet = GetValues.getSheet("TestData");
  	  
  	  int RowCount = DataSheet.getLastRowNum()-DataSheet.getFirstRowNum();
  	  System.out.println(RowCount);
  	  
  	  //Loop to Get Multiple Values
  	  for(int i = 1; i<RowCount+1; i++)
  	  {
  		  XSSFRow DataSheetRow = DataSheet.getRow(i);
  		  XSSFCell XLclientName = DataSheetRow.getCell(0);
  		  clientName = XLclientName.toString();
  		  cs.SetClientName(clientName);
  		  XSSFCell XLfirstName = DataSheetRow.getCell(1);
  		  firstName = XLfirstName.toString();
  		  cs.SetFirstName(firstName);
  		  XSSFCell XLsecondName = DataSheetRow.getCell(2);
  		  secondName = XLsecondName.toString();
  		  cs.SetSecondName(secondName);
  		  XSSFCell XLEmail = DataSheetRow.getCell(3);
  		  Email = XLEmail.toString();
		  cs.SetSecondName(Email);
  		  //XSSFCell XLPhoneNumber = DataSheetRow.getCell(3);
  		  String XLphonenumber = new DataFormatter().formatCellValue(DataSheetRow.getCell(4));
		  phonenumber = XLphonenumber.toString();
  		  System.out.println(XLphonenumber);
  		  cs.setPhonenumber(phonenumber);
  		  XSSFCell XLaddress = DataSheetRow.getCell(5);
  		  address = XLaddress.toString();
  		  cs.setAddress(address);
  		  XSSFCell XLcity = DataSheetRow.getCell(6);
  		  city = XLcity.toString();
  		  cs.setCity(city);
			
			 * XSSFCell XLstate = DataSheetRow.getCell(7); states = XLstate.toString();
			 * //FormState.deselectAll(); cs.setStates(states);
			 
  		  XSSFCell XLpinno = DataSheetRow.getCell(8);
  		  pinno = XLpinno.toString();
  		  System.out.println(pinno);
  		  cs.SetPinno(pinno);
  		  XSSFCell XLein = DataSheetRow.getCell(9);
  		  ein = XLein.toString();
  		  cs.setEin(ein);
  		  cs.clickSubmit();
  		  Thread.sleep(2000);
  	  }
  	  
    }
		
*/	

/*
 * @DataProvider(name="ClientData") public Object[][] getData() throws
 * IOException{ File ExcelInput = new File(".\\\\datafiles\\\\Clientdata.xlsx");
 * FileInputStream FileInput = new FileInputStream(ExcelInput); XSSFWorkbook
 * GetValues = new XSSFWorkbook(FileInput); XSSFSheet DataSheet =
 * GetValues.getSheet("TestData");
 * 
 * int RowCount = DataSheet.getLastRowNum()-DataSheet.getFirstRowNum();
 * System.out.println(RowCount);
 * 
 * 
 * 
 * }
 */
