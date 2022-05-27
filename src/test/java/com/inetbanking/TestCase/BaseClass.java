package com.inetbanking.TestCase;




import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.Utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig rd=new ReadConfig();
	public String base_url=rd.geturl();
	public String userName=rd.getUname();
	public String Passwd=rd.getPwd();
	public String title=" Guru99 Bank Manager HomePage ";
	public static WebDriver driver;
	public static Logger logger;
	
	
	@Parameters("browsers")
	@BeforeClass
	public void setup(String br)
	{
		
	    logger=Logger.getLogger("ebanking");
	    PropertyConfigurator.configure("log4j.properties");
	    
	    
	    if(br.equals("chrome"))
	    {
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    }
	    else if(br.equals("gecko"))
	    {
	    	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		    driver=new FirefoxDriver();
	    }
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
