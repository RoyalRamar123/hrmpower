package HRMPowerTestdata;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import HRMPowerObject.ClientObject;
import HRMPowerObject.LoginPage;
import HRMPowerUtilities.ReadConfig;

public class Client 

{
	WebDriver driver;
	String Name, FirstName, LastName, Email, PhoneNumber, Address, City, State, Zip, Ein;
	//String FirstName, LastName, Email, PhoneNumber, Address, City, State, Zip, Website, Description;
	ReadConfig readconfig = new ReadConfig();
	public String baseurl = readconfig.getApplicationURL();
	public String username = readconfig.getusername();
	public String password = readconfig.getpassword();
	@Parameters("browser")
  @BeforeClass
  public void beforeClass() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(baseurl);
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	  LoginPage lp = new LoginPage(driver);
		Thread.sleep(3000);
		lp.setUseName(username);
		lp.setPassword(password);
		lp.clicklogin();
		ClientObject cs = new ClientObject(driver);
		Thread.sleep(3000);
		cs.clicksidebarmenu_btn();
		Thread.sleep(3000);
		cs.clickclient_page();
		Thread.sleep(3000);
		cs.clickAddClient();
		Thread.sleep(3000);
  }
  
  @Test
  public void ReadFromExcel() throws InterruptedException, Exception
  {
	  //Identify the WebElements
	  
	  WebElement FormName = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
	  WebElement FormFirstName = driver.findElement(By.xpath("(//*[@id=\"department\" or @name='Name'])[2]"));
	  WebElement FormSecondName = driver.findElement(By.xpath("(//*[@id=\"department\" or @name='Name'])[3]"));
	  WebElement Formemail = driver.findElement(By.xpath("(//*[@id=\"department\" or @name='Name'])[4]"));
	  WebElement FormPhonenumber = driver.findElement(By.name("Phonenumber"));
	  WebElement FormAddress = driver.findElement(By.xpath("(//*[@id=\"department\" or @name='Name'])[5]"));
	  Thread.sleep(3000);
	  WebElement FormCity = driver.findElement(By.xpath("(//*[@id=\"department\" or @name='Name'])[6]"));
	  Thread.sleep(3000);
	  Select FormStates = new Select(driver.findElement(By.name("States")));
	  WebElement FormPinno = driver.findElement(By.xpath("(//*[@id=\"department\" or @name='Name'])[7]"));
	  WebElement Formeinno = driver.findElement(By.xpath("(//*[@id=\"department\" or @name='Name'])[8]"));
	  WebElement Formbuttonalign = driver.findElement(By.className("buttonalign"));
	 
	  
	  
	  //Read the Excel
	  File ExcelInput = new File(".\\\\datafiles\\\\client.xlsx");
	  FileInputStream FileInput = new FileInputStream(ExcelInput);
	  XSSFWorkbook GetValues = new XSSFWorkbook(FileInput);
	  XSSFSheet DataSheet = GetValues.getSheet("Sheet1");
	  
	  int RowCount = DataSheet.getLastRowNum()-DataSheet.getFirstRowNum();
	  System.out.println(RowCount);
	  
	  //Loop to Get Multiple Values
	  for(int i = 1; i<RowCount+1; i++)
	  {
		  XSSFRow DataSheetRow = DataSheet.getRow(i);
		  XSSFCell XLName = DataSheetRow.getCell(0);
		  Name = XLName.toString();
		  FormName.click();
		  FormName.clear();
		  FormName.sendKeys(Name);
		  System.out.println(Name);
		  
		  XSSFCell XLFirstName = DataSheetRow.getCell(1);
		  FirstName = XLFirstName.toString();
		  FormFirstName.clear();
		  FormFirstName.sendKeys(FirstName);
		  
		  XSSFCell XLLastName = DataSheetRow.getCell(2);
		  LastName = XLLastName.toString();
		  FormSecondName.clear();
		  FormSecondName.sendKeys(LastName);
		  
		  XSSFCell XLEmail = DataSheetRow.getCell(3);
		  Email = XLEmail.toString();
		  Formemail.clear();
		  Formemail.sendKeys(Email);
		  
		  
		  //XSSFCell XLPhoneNumber = DataSheetRow.getCell(3);
		  String XLPhoneNumber = new DataFormatter().formatCellValue(DataSheetRow.getCell(4));
		  PhoneNumber = XLPhoneNumber.toString();
		  System.out.println(XLPhoneNumber);
		  FormPhonenumber.clear();
		  FormPhonenumber.sendKeys(PhoneNumber);
		  
		  XSSFCell XLAddress = DataSheetRow.getCell(5);
		  Address = XLAddress.toString();
		  FormAddress.clear();
		  FormAddress.sendKeys(Address);
		  
		  XSSFCell XLCity = DataSheetRow.getCell(6);
		  City = XLCity.toString();
		  FormCity.clear();
		  FormCity.sendKeys(City);
		  
		  XSSFCell XLState = DataSheetRow.getCell(7);
		  State = XLState.toString();
		  //FormState.deselectAll();
		  FormStates.selectByVisibleText(State);
		  
		  XSSFCell XLZip = DataSheetRow.getCell(8);
		  Zip = XLZip.toString();
		  System.out.println(Zip);
		  FormPinno.clear();
		  FormPinno.sendKeys(Zip);
		  
		  XSSFCell XLEin = DataSheetRow.getCell(9);
		  Ein = XLEin.toString();
		  Formeinno.clear();
		  Formeinno.sendKeys(Ein);
		    			  
		  Formbuttonalign.click();
		  Thread.sleep(2000);
	  }
	  GetValues.close();
  }

  @AfterClass
  public void afterClass() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.close();
  }

}

