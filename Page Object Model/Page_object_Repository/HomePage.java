package Page_object_Repository;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class HomePage {

	WebDriver localdriver;
	public HomePage(WebDriver driver)
	{
		this.localdriver = driver;
	
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	public WebElement signInclickbtn;
	
	public void clickSigninBtn()
	{
		signInclickbtn.click();
	}
	public Signin_Login_Page SignInClick() {
		signInclickbtn.click();
		Signin_Login_Page signinpage = new Signin_Login_Page(localdriver);
		PageFactory.initElements(localdriver, signinpage);
		return signinpage;
	}
}
