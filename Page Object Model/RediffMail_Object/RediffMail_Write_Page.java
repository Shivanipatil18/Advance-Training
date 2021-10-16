package Simple_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RediffMail_PageObject.RediffMail_WritePage;

public class RediffMail_Write_Page {

		WebDriver driver;
	public RediffMail_Write_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	@FindBy(xpath="//b[contains(text(),'Write mail')]")
	public WebElement WriteInClick;
	
	@FindBy(xpath="//input[@id='TO_IDcmp2']")
	public WebElement enterTo;
	
	@FindBy(xpath="//input[@class='rd_inp_sub rd_subject_datacmp2']")
	public WebElement entersubject;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement entermsgbody;
	
	@FindBy(xpath="//a[@class='send_ng_compo rd_btn_cmp_send']")
	public WebElement sendmail;
	
	public void ClickTerm()
	{
		WriteInClick.click();
	
	}
	
	public void ToTextBox(String to)
	{
		enterTo.sendKeys(to);
	}
	
	public void SubjectName(String subject)
	{
		entersubject.sendKeys(subject);
	}
	
	public void MessageBody(String msgbody)
	{
		entermsgbody.sendKeys(msgbody);
	}
	public void sendMail()
	{
		sendmail.click();
	}
	
	public RediffMail_WritePage SendMail()
	{
		sendmail.click();
		RediffMail_WritePage writepage=new RediffMail_WritePage(driver);
		PageFactory.initElements(driver, writepage);
		return writepage;
		
	}
}
