package Simple_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Rediff_Page {
	
	WebDriver driver;
	public Rediff_Page(WebDriver driver)
	{
		this.driver=driver;
	
	}
	
	@FindBy(xpath="//a[contains(text(),'Rediffmail')]")
	public WebElement ClickBtnOnMail;
	
	public void clickSigninBtn()
	{
		ClickBtnOnMail.click();
	}
	public RediffMail_LoginPage  SignInClick() {
		ClickBtnOnMail.click();
		RediffMail_LoginPage  loginpage = new RediffMail_LoginPage (driver);
		PageFactory.initElements(driver, loginpage );
		return loginpage ;
	}

}
