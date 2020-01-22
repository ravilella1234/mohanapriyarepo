package com.icici.loans.carloans;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties p;
	public static Properties prop;
	public static Properties envProp;
	public static FileInputStream fis;
	public static String projectPath=System.getProperty("user.dir");
	
	
	public static void init() throws IOException
	{
		//FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\MohanaPriya\\data.properties");
		fis=new FileInputStream(projectPath+"\\data.properties");
		p=new Properties();
		p.load(fis);
		
		fis=new FileInputStream(projectPath+"\\environment.properties");
		prop=new Properties();
		prop.load(fis);
		String e = prop.getProperty("env");
		System.out.println(e);
		
		fis=new FileInputStream(projectPath+"//"+e+".properties");
		envProp=new Properties();
		envProp.load(fis);
		String str = envProp.getProperty("amazonurl");
		System.out.println(str);
		
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox")) 
		{
			driver=new FirefoxDriver();
		}
	}
	
	
	public static void navigateUrl(String url) 
	{
		driver.get(p.getProperty(url));
	}
	

}
