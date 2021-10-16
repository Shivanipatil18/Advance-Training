//package Simple_POM;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class RediffMailPage {
//
//		WebDriver driver;
//	public RediffMailPage(WebDriver driver) {
//		
//		this.driver=driver;
//	}
//	@FindBy(xpath="//b[contains(text(),'Write mail')]")
//	public WebElement ClickInWriteMail;
//	
//	public void submitBtn()
//	{
//		ClickInWriteMail.click();
//	}
//	
//	public RediffMail_LoginPage ClickInloginPage() 
//	{
//		ClickInWriteMail.click();
//		RediffMail_LoginPage mailloginpage = new RediffMail_LoginPage(driver);
//		PageFactory.initElements(driver, mailloginpage );
//		return mailloginpage ;
//	}
//
//
//
//}
