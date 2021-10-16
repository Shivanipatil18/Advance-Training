package Page_object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Portfolio_Page {

	WebDriver localdriver;

	public Portfolio_Page(WebDriver driver)
	{
		this.localdriver = driver;
		//PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='createPortfolio']")
	public WebElement createportfolio;

	@FindBy(xpath="//input[@id='create']")
	public WebElement portcleartext;
	
	@FindBy(xpath="//input[@id='create']")
	public WebElement myportfolioname;
	
	
	@FindBy(xpath="//input[@id='createPortfolioButton']")
	public WebElement createportbutton;
	
	public void clickTerms()
	{
		createportfolio.click();
	}
	
	public void ProtfolioClear() 
	{
			portcleartext.clear();
	}
	
	public void setmyPortfolioName( String portname) {
		myportfolioname.sendKeys(portname);
	}
	
	public void createPortfolioButton() {
		createportbutton.click();
	}
	
	public Portfolio_Page clickNext() {
		createportfolio.click();
		
		Portfolio_Page createportfolio = new Portfolio_Page(localdriver);
		PageFactory.initElements(localdriver, createportfolio);
		return createportfolio;
}
	
}