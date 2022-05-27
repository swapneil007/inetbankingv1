package com.inetbanking.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	public void LoginTest()
	{
		driver.get(base_url);
		logger.info("url is opened");
		driver.manage().window().maximize();
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(userName);
		logger.info("set username successfuly");
		lp.setPassword(Passwd);
		logger.info("set password successfuly");
		lp.click_Login();
		logger.info("clicked login button");
		String title1=driver.getTitle();
		if(driver.getTitle().equals(title1))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			Assert.assertFalse(false);
			
			logger.warn("login failed");
		}
		
	}

}
