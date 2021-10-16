package Page_Object;

import org.testng.annotations.Test;

import Page_object_Repository.HomePage;
import Page_object_Repository.Portfolio_Page;
import Page_object_Repository.Signin_Login_Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Moneywiz_LoginTest {

	Portfolio_Page createportfolio;

	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Selenium Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://money.rediff.com/index.html");

		// create object for home page
		HomePage homepage = new HomePage(driver);
		PageFactory.initElements(driver, homepage);
		homepage.clickSigninBtn();

		// create object for LoginPage
		Signin_Login_Page loginpage = new Signin_Login_Page(driver);
		PageFactory.initElements(driver, loginpage);

		loginpage.entermailid("sp.patil6400@gmail.com");
		loginpage.enterpassword("pwd1234");
		loginpage.entersubmitbtn();
		
		// Create object for Portfolio Page
		Portfolio_Page portpage = new Portfolio_Page(driver);
		PageFactory.initElements(driver, portpage);

		portpage.clickTerms();
		Thread.sleep(2000);
		portpage.ProtfolioClear();
		Thread.sleep(1000);
		portpage.setmyPortfolioName("New_MyPortfolio2");
		Thread.sleep(2000);
		portpage.createPortfolioButton();
		Thread.sleep(5000);
		System.out.println("Portfolio Create Successfull....");

		System.out.println("End of code");

		driver.quit();
	}
}
