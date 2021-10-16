package firstpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeTest(String browser) 
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Selenium Workspace\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("MicrosoftEdge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\workspace\\Selenium Workspace\\msedgedriver.exe");
			driver =new EdgeDriver();
		}
		driver.get("https://www.google.com/");
	}

	@Test
	public void Check_Test() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		Thread.sleep(2000);
	}
	@AfterClass
	public void After_Test()
	{
		driver.quit();
	}
}
