package Simple_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RediffMail_PageObject.RediffMail_WritePage;

public class RediffMail_LoginPage {

	WebDriver driver;
	public RediffMail_LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	@FindBy(xpath="//input[@id='login1']")
	public WebElement UsernameTextBox;

	@FindBy(xpath="//input[@id='password']")
	public WebElement PasswordTextBox;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement SigninBtn;

	public void setUserName( String mailid) {
		UsernameTextBox.sendKeys(mailid);
	}
	public void setPassword( String password) {
		PasswordTextBox.sendKeys(password);
	}
	public void submitBtn()
	{
		SigninBtn.click();
	}
	
	public  RediffMail_Write_Page Submitlogin() {
		SigninBtn.click();
		RediffMail_Write_Page writepage = new RediffMail_Write_Page(driver);
		PageFactory.initElements(driver,writepage);
		return writepage;
	}
	


}
