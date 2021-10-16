package Page_object_Repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Login_Page 
{
	WebDriver localdriver;

	public Signin_Login_Page(WebDriver driver)
	{
		this.localdriver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='useremail']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='userpass']")
	public WebElement Password;
	
	@FindBy(xpath="//input[@id='loginsubmit']")
	public WebElement submitbtn;
	
	public void entermailid(String emailid) {
		email.sendKeys(emailid);
	}
	
	public void enterpassword(String password) {
		Password.sendKeys(password);
	}

	public void entersubmitbtn() {
		submitbtn.click();
		
	}

	public Signin_Login_Page clickNext() 
	{
		email.click();
		Signin_Login_Page signinpage = new Signin_Login_Page(localdriver);
		PageFactory.initElements(localdriver, signinpage);
		return signinpage;
	}	

}
