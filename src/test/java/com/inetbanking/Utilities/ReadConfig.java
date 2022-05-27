package com.inetbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	public ReadConfig()
	{
		
		File src=new File("./Configurations/config.properties");
		
		try {
			FileInputStream fin=new FileInputStream(src);
			
			pro=new Properties();
			pro.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String geturl()
	{
		String url=pro.getProperty("base_url");
		return url;
		
	}
	
	public String getUname()
	{
		String Uname=pro.getProperty("userName");
		return Uname;
	}
	
	public String getPwd()
	{
		String pwd=pro.getProperty("Passwd");
		return pwd;
	}

}
