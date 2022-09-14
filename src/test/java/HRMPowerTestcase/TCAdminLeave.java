package HRMPowerTestcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import HRMPowerModule.AdminLeave;
import HRMPowerObject.LoginPage;

public class TCAdminLeave extends BaseClass {
	
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
		Thread.sleep(6000);
		HRMPowerObject.AdminLeaveObject adminleave = new HRMPowerObject.AdminLeaveObject(driver);
		adminleave.sidebarmenu_btn.click();
		adminleave.Leavemenu.click();
		Thread.sleep(6000);
		adminleave.AdminLeave.click();
		logger.info("Navigated To admin Leave Page.\r\n");
		}		
			
    @Test(priority = 3, dataProvider = "AdminLeave")
     public void AdminLeaveObject(AdminLeave model) throws InterruptedException, IOException {
    
    	HRMPowerObject.AdminLeaveObject adminleave = new HRMPowerObject.AdminLeaveObject(driver);
        Thread.sleep(2000);
    	adminleave.setleaveStatus(model.getSelectLeavetype());
        logger.info("Leavetype =" + model.getSelectLeavetype());
        adminleave.setfromdate(model.getFromDate());
        logger.info("FromDate =" + model.getFromDate());
        adminleave.settoDate(model.getToDate());
        logger.info("ToDate =" + model.getToDate());
        adminleave.setleaveStatus((model.getSelectLeaveStatus()));
        logger.info("Status =" + model.getSelectLeaveStatus());
        adminleave.clicksearchbtn();
        logger.info("Search Successfully");
        adminleave.clickresetbtn();
        Thread.sleep(2000);
        }
	
	
	/*  @DataProvider(name = "AdminLeave") 
		public AdminLeave[] getData() {AdminLeave[] AdminLeaveArray = null; 
	     try (InputStream input = new FileInputStream("data/employeeleave.json");)
			  {
			   ObjectMapper objectMapper = new ObjectMapper();
			  
			   AdminLeaveArray = objectMapper.readValue(input, AdminLeave[].class);
			  } catch (Exception e) { logger.info(e.getMessage());
			  } 
	         return AdminLeaveArray;
			  
			 }*/
	  
	  
	  @DataProvider(name = "AdminLeave")
	   public String [][] getData() throws IOException 
	   {
			//get the data from excel
		    String path =".\\datafiles\\Testdata.xlsx";
		    
		    XLUtility xlutil=new XLUtility(path);
		    int totalrows = xlutil.getRowCount("Sheet2");
		    int totalcols = xlutil.getcellCount("Sheet2",1);
		    
		    String leaveData[][] = new String[totalrows][totalcols]; //index excel start from 1
		    for(int i=1;i<=totalrows;i++) //cell start with -1 
		    {
		    	for(int j=0;j<totalcols;j++) //cell start with -0
		    	{
		    		leaveData[i-1][j] = xlutil.getCellData("Sheet2", i, j);
		    		
		    	}
		    	
		    }
		return leaveData;
	   }


}
