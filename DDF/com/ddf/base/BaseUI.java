package com.ddf.base;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//v1 - browser invoke and other basic functions
public class BaseUI{

	public WebDriver driver;

	//Exercise 
	// Complete the function to invoke - firefox & edge browsers
	public void invokeBrowser(String browserName) {
		//if(browserName.equals(anObject))
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src//test//resources//drivers//chromedriver.exe");
			
			driver=new ChromeDriver();
		}
	}

	public void openURL(String websiteURL) {
		//we are using this function so that we can easily extend the functionality
		driver.get(websiteURL);
	}

	public void tearDown() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void elementClick(String xpath) {
		//try catch block
		//logging - click is successful 
		driver.findElement(By.xpath(xpath)).click();
	}

	public void enterText(String xpath, String data) {
		//used to enter text - give more specifics 
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	}
}

