package com.icici.loans.carloans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver=new FirefoxDriver();
		driver.get("https://www.bestbuy.com");
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\Desktop\\drive\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("https://www.amazon.in");
	}

}
