package New_Page_TestCase;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import New_PageObject.BaseTestClass;
import New_PageObject.LandingPage;
import New_PageObject.MoneyPage;
import New_PageObject.MyPorfolioPage;
import New_PageObject.PageBaseClass;
import New_PageObject.PortFolioLoginPage;


public class MyPorfolioTest extends BaseTestClass{
	
	LandingPage landingPage;
	MoneyPage moneyPage;
	PortFolioLoginPage portfolioLoginPage;
	MyPorfolioPage myporfolioPage;
	
//	@Test
	public void openPorfolio(){
		
		
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		myporfolioPage = portfolioLoginPage.doLogin("kamath.s2020@rediffmail.com", "Welcome1$");
		//myporfolioPage.verifyMoneyBiz();
		//myporfolioPage.getTitle("Rediff Moneywiz | My Portfolio(s)");
			}
	
	//@Test(dataProvider="verifyLoginTestData", groups={"Regression", "LoginTest" })
	public void verifyLogin(){
		
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		portfolioLoginPage.enterUser("kamath.s2020@rediffmail.com");
		portfolioLoginPage.submitUserName();
		//below one line added - 5th may 2021
		//portfolioLoginPage.enterPassword(testData.get("Password"));
		portfolioLoginPage.verifyPasswordField();
		
	}
	
	@Test
	public void addPortfolioTest(){

		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		myporfolioPage = portfolioLoginPage.doLogin("kamath.s2020@rediffmail.com", "Welcome1$");
		myporfolioPage.verifyMoneyBiz();
		myporfolioPage.clickCreatePortfolio();
		waitForPageLoad();
		myporfolioPage.enterPortfolioName("New_Portfolio-13oct2021");
		myporfolioPage = myporfolioPage.submitPortfolio();
		waitForPageLoad();
		myporfolioPage.isPorfolioExists("New_Portfolio-13oct2021");
	}
	
	
	
	public void deletePortfolio(){
		System.out.println("In Delete portfolio - starting");
		
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		myporfolioPage = portfolioLoginPage.doLogin("kamath.s2020@rediffmail.com", "Welcome1$");
		waitForPageLoad();
		myporfolioPage.verifyMoneyBiz();
		myporfolioPage = myporfolioPage.selectPortfolio("New Portfolio");
		myporfolioPage = myporfolioPage.deletePortFolio();
		waitForPageLoad();
		myporfolioPage.isPorfolioDeleted("New Portfolio");
		System.out.println("In Delete portfolio - Ending");
	}
	


}
