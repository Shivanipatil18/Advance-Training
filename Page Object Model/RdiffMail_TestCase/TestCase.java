package Simple_POM_TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Simple_POM.RediffMail_LoginPage;
import Simple_POM.RediffMail_Write_Page;
import Simple_POM.Rediff_Page;

public class TestCase {

	@Test
	public void Login() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\worksoft\\all files\\workspace\\Selenium Workspace\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);

	driver.get("https://rediff.com");

	Rediff_Page rediffpage = new Rediff_Page(driver);
	PageFactory.initElements(driver, rediffpage);
	rediffpage.clickSigninBtn();
	
//	RediffMailPage mailpage = new RediffMailPage(driver);
//	PageFactory.initElements(driver, mailpage);
//	mailpage.submitBtn();
	
	RediffMail_LoginPage loginpage = new RediffMail_LoginPage(driver);
	PageFactory.initElements(driver, loginpage);
	loginpage.setUserName("patilshivani111@rediffmail.com");
	loginpage.setPassword("Pwd@123");
	loginpage.submitBtn();
	
	RediffMail_Write_Page writepage = new RediffMail_Write_Page(driver);
	PageFactory.initElements(driver, writepage);
	writepage.ClickTerm();
	writepage.ToTextBox("sp.patil6400@gmail.com");
	writepage.SubjectName("Rediff Mail");
	writepage.MessageBody("Welcome!!");
	writepage.sendMail();
	
	driver.quit();
	
	}
}
