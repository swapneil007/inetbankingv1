package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="uid") WebElement Userid;
	@FindBy(name="password") WebElement Password;
	@FindBy(name="btnLogin") WebElement LoginBtn;
	@FindBy(name="btnReset") WebElement ResetBtn;
	
   public LoginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
	
   public void setUsername(String Uname)
   {
	   Userid.clear();
	   Userid.sendKeys(Uname);
   }
   
   public void setPassword(String pwd)
   {
	   Password.clear();
	   Password.sendKeys(pwd);
   }
   
   public void click_Login()
   {
	   LoginBtn.click();
   }
   
}
