package HRMPowerObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectObject {
	
	WebDriver driver;
	
	WebDriver ldriver;

	public ProjectObject (WebDriver rdriver) {
	ldriver = rdriver;
   	PageFactory.initElements(rdriver, this);
	}
   	   @FindBy(id = "sidebarmenu_btn")
	   WebElement sidebarmenu_btn;
	   
	   @FindBy(xpath = "//*[@id=\"project_page\"]/a")
	   WebElement projectpage;
	   
	   @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/div[3]/span[3]")
	   WebElement AddProject;
	   
	   @FindBy(id = "name")
	   WebElement ProjectName;
	   
	   @FindBy(id = "drop-down")
	   WebElement ClientDropdown;
	   
	   @FindBy(id = "input-1")
	   WebElement ExpectedDate;
	   
	   @FindBy(xpath="//*[@id=\"select-17\"]")
	   WebElement year;
	   
	   
	   @FindBy(xpath="//*[@id=\"month-16\"]")
	   WebElement month;
	   
	   @FindBy(xpath="//*[@id=\"expectedcompletiondate_modal_calendar\"]/table/tbody/tr[6]/td[2]/div")
	   WebElement date;
	   
	   @FindBy(xpath="//*[@id=\"month-26\"]")
	   public WebElement month2;
	   
	   @FindBy(xpath="//*[@id=\"modal-close-button\"]/svg")
	   WebElement close;
	   
	  @FindBy(xpath="//*[@id=\"input-6\"]")
	  WebElement StartDate;
	  
	  @FindBy(id = "input-11")
	  WebElement CompletedDate;
	  
	  @FindBy (name="description")
	  WebElement Description;
	  
	  @FindBy(xpath="//*[@id=\"completedate_modal_calendar\"]/table/tbody/tr[2]/td[3]/div/button")
	  public WebElement completeddate;
	  
	  @FindBy(xpath="//*[@id=\"startdate_modal_calendar\"]/div/div[1]/button[1]/svg")
	  public WebElement arrow;
	  
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/main/div[2]/div[2]/div[6]/div[2]/div/button")
	  public WebElement save;
	  
	  
		 public void clicksidebarmenu_btn() {
			 	sidebarmenu_btn.click();
		 }
	 	 
	 	 public void clickprojectpage() {
	 		projectpage.click();
		  }
	 	  
	 	  public void clickAddproject() {
	 		 AddProject.click();
	 	  }
	 	 
	 	  public void setProjectname(String projectName) {
	 		 ProjectName.sendKeys(projectName);
	 	  }	
	 	  
	 	  public void SetClientdropdown(String client) {
	 		 ClientDropdown.sendKeys(client);;
	 	  }
	 	  
	 	  public void  clickExpecteddate() {
	 		 ExpectedDate.click();
	 	  }
	 	  
	 	  public WebElement clickyeardate() {
	 		 year.click();
			return year;
			
	 		 
	 	  }
	 	  
	 	  public void clickmonth() {
	 		 month.click();
	 	  }
	 	  
	 	  public void clickdate() {
	 		 date.click();
	 	  }
	 	  
	 	  public void clickclose() {
	 		 close.click();
	 	  }
	 	  public void clickStartdate() {
	 		 StartDate.click();
	 	  }
	 	  
	 	  public void clickmonth2() {
	 		 month2.click();
	 	  }
	 	  public void clickCompleteddate() {
	 		 CompletedDate.click();
	 	  }
	 	  
	 	 public void setDescription(String description) {
	 		Description.sendKeys(description);
	 	  }
	 	 
	 	 public void clickcompleteddate() {
	 		completeddate.click();
	 	 }
	 	 
	 	 public void clicksave() {
	 		save.click();
	 	 }

		public void clickarrow() {
			// TODO Auto-generated method stub
			arrow.click();
		}
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/main/div[2]/div[2]/div[1]/div")
		public WebElement AlertName;
		
		public void getName() {
			AlertName.getText();
		}
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/main/div[2]/div[2]/div[2]/div")
		public WebElement ClientName;
		
		public void getClientName() {
			ClientName.getText();
		}
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/main/div[2]/div[2]/div[3]/div[2]")
		public WebElement Expected;
		
		public void getExpected() {
			Expected.getText();
		}
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/main/div[2]/div[2]/div[4]/div[2]")
		public WebElement Start;
		
		public void getStart() {
			Start.getText();
		}
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/main/div[2]/div[2]/div[5]/div[2]")
		public WebElement Completed;
		
		public void getCompleted() {
			Completed.getText();
		}
		
   }
	   

