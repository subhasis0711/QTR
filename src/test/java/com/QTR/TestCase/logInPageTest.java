package com.QTR.TestCase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LoginPage;
import pageObjects.homePage;
import resources.base;

public class logInPageTest extends base{
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));

	}
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username,String Password) throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.getUserNameID().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();
		}

		@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="madhu.sudhan@qualitestgroup.com";
		data[0][1]="P@ssw0rd";
		
		return data;	
	}
	
		
}
