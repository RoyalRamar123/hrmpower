package HRMPowerTestcase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import HRMPowerUtilities.ReadConfig;
public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	public String baseurl = readconfig.getApplicationURL();
	public String username = readconfig.getusername();
	public String password = readconfig.getpassword();
	public static WebDriver driver;
	public static Logger logger;
	@Parameters("browser")
	@Test
	public void setup() {
		    logger = org.apache.log4j.Logger.getLogger("HRMpower");
			System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get(baseurl);
	}
}
	/*
	 * @AfterClass public void terdown() { driver.quit(); }
	 */
	/*
	 * public String OutlookMailReader(String mailFolderName, String
	 * emailSubjectContent, String emailContent, int lengthOfOTP) {
	 * 
	 * // mailFolderName(Eg- "INBOX"), emailSubjectContent(Eg- Mail for OTP),
	 * 
	 * String hostName = "smtp-mail.gmail.com";// change it according to your mail
	 * 
	 * String username = "roshamu27@gmail.com";// username
	 * 
	 * String password = "iCore@123";
	 * 
	 * int messageCount;
	 * 
	 * int unreadMsgCount;
	 * 
	 * String emailSubject;
	 * 
	 * Message emailMessage;
	 * 
	 * String searchText = null;
	 * 
	 * Properties sysProps = System.getProperties();
	 * 
	 * sysProps.setProperty("mail.store.protocol", "imaps");
	 * 
	 * try {
	 * 
	 * Session session = Session.getInstance(sysProps, null);
	 * 
	 * Store store = session.getStore();
	 * 
	 * store.connect(hostName, username, password);
	 * 
	 * Folder emailBox = store.getFolder(mailFolderName);
	 * 
	 * emailBox.open(Folder.READ_WRITE);
	 * 
	 * messageCount = emailBox.getMessageCount();
	 * 
	 * System.out.println("Total Message Count: " + messageCount);
	 * 
	 * Thread.sleep(4000);
	 * 
	 * unreadMsgCount = emailBox.getNewMessageCount();
	 * 
	 * System.out.println("Unread Emails count:" + unreadMsgCount);
	 * 
	 * for (int i = messageCount; i > (messageCount - unreadMsgCount); i--)
	 * 
	 * {
	 * 
	 * emailMessage = emailBox.getMessage(i);
	 * 
	 * emailSubject = emailMessage.getSubject();
	 * 
	 * if (emailSubject.contains(emailSubjectContent))
	 * 
	 * {
	 * 
	 * System.out.println("OTP mail found");
	 * 
	 * String line;
	 * 
	 * StringBuffer buffer = new StringBuffer(); BufferedReader reader = new
	 * BufferedReader(new InputStreamReader(emailMessage.getInputStream()));
	 * 
	 * while ((line = reader.readLine()) != null) {
	 * 
	 * buffer.append(line);
	 * 
	 * }
	 * 
	 * String messageContent = emailContent; int hh =
	 * buffer.toString().indexOf(messageContent); System.out.println(hh); int
	 * contentsize = messageContent.length() + lengthOfOTP;
	 * 
	 * searchText =
	 * buffer.toString().substring(buffer.toString().indexOf(messageContent),
	 * buffer.toString().indexOf(messageContent) + contentsize);
	 * 
	 * System.out.println("Your OTP is : " + searchText);
	 * 
	 * emailMessage.setFlag(Flags.Flag.SEEN, true);
	 * 
	 * break;
	 * 
	 * }
	 * 
	 * emailMessage.setFlag(Flags.Flag.SEEN, true);
	 * 
	 * }
	 * 
	 * emailBox.close(true);
	 * 
	 * store.close();
	 * 
	 * } catch (Exception mex) {
	 * 
	 * mex.printStackTrace();
	 * 
	 * System.out.println("OTP Not found ");
	 * 
	 * }
	 * 
	 * return searchText;
	 * 
	 * } }
	 */









