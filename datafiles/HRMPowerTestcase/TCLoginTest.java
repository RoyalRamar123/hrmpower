package HRMPowerTestcase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import HRMPowerUtilities.ReadConfig;
import HRMPowerUtilities.XLUtility;
public class TCLoginTest {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseurl = readconfig.getApplicationURL();
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider ="LoginData")
   public void loginTest(String user,String pwd,String exp) throws Exception
   {
	  driver.get(baseurl);
	  Thread.sleep(2000);
      WebElement txtEmail = driver.findElement(By.name("userName"));
      txtEmail.clear();
      txtEmail.sendKeys(user);
      WebElement txtpassword = driver.findElement(By.name("password"));
      txtpassword.clear();
      txtpassword.sendKeys(pwd);
      driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
      Thread.sleep(5000);
      String exp_title ="DashBorad";
      String act_title=driver.getTitle();
      if(exp.equals("Vaild"))
      {
    	  if(exp_title.equals(act_title))
    	  {
    	      driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    	      AssertJUnit.assertTrue(true);
          }
    	  else
    	  {
    		  AssertJUnit.assertFalse(false);
    	  }
      }
    	  else if(exp.equals("Invaild"))
    	  {
    		 if(exp_title.equals(act_title))
    		 {
    			 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    			 AssertJUnit.assertTrue(false);
    	     }
    		 else
    		 {
    			 AssertJUnit.assertTrue(true);
    		 }
       }
   }
   @DataProvider(name ="LoginData")
   public String [][] getData() throws IOException
   {
		//get the data from excel
	    String path =".\\datafiles\\Testdata.xlsx";
	   
	    XLUtility xlutil=new XLUtility(path);
	    int totalrows = xlutil.getRowCount("Sheet1");
	    int totalcols = xlutil.getcellCount("Sheet1",1);
	   
	    String loginData[][] = new String[totalrows][totalcols]; //index excel start from 1
	    for(int i=1;i<=totalrows;i++) //cell start with -1
	    {
	    	for(int j=0;j<totalcols;j++) //cell start with -0
	    	{
	    		loginData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
	    		
	    	}
	    	
	    }
	return loginData;
   }
   @AfterMethod
@AfterClass
    void tearDown() throws Exception
   {
	Thread.sleep(2000);
	driver.close();
   }
}