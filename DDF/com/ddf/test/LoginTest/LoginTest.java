package com.ddf.test.LoginTest;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ddf.base.BaseUI;

public class LoginTest extends BaseUI {

	@Test
	public void testOne() throws InterruptedException, DocumentException{
		
		invokeBrowser("chrome");
		openURL("https://www.rediff.com/");
	 File inputFile = new File(System.getProperty("user.dir") +"\\src"+"\\xmlFile.xml");									
			    SAXReader saxReader = new SAXReader();					
			    Document document = saxReader.read(inputFile);							
			 String signIn = document.selectSingleNode("//users/signin").getText();
			 String userName = document.selectSingleNode("//users/username").getText();
		
	
		 elementClick("signIn");	
//
//		    String signUpButton = document.selectSingleNode("//menu/signup").getText();			
//		    String quizButton = document.selectSingleNode("//menu/quiz").getText();	
	
		
		enterText("userName","U S E R N A M E");

	
		Thread.sleep(2000);
		tearDown();
	}
	
	//Call a different browser - firefox
	//@Test(dependsOnMethods="testOne") 
	public void testTwo() {
		invokeBrowser("chrome");
		
		
		tearDown();
	}
	
	//Exercise - Call a different browser - Edge
	//@Test(dependsOnMethods="testTwo")
	public void testThree() {
		invokeBrowser("chrome");
		openURL("https://shopping.rediff.com/");
		tearDown();
	}
}