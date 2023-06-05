package com.actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.actitime.pom.LoginPage;

public class BaseClass 
{
	FileLibrary f1 = new FileLibrary();
	public static WebDriver driver;
@BeforeSuite
public void databaseconnection() { 
	Reporter.log("Database connected",true);
	
	
}

@BeforeClass
public void LaunchBrowser() throws IOException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String actiurl = f1.readDataFromPropertyFile("url");
	driver.get("actiurl");
	Reporter.log("Browser Launched",true);
	
}

@BeforeMethod
public void login() throws IOException {
	LoginPage lp=new LoginPage(driver);
	String un = f1.readDataFromPropertyFile("username");
	String pw = f1.readDataFromPropertyFile("password");
	lp.getUnbtx().sendKeys(un);
	lp.getPwtbx().sendKeys(pw);
	lp.getLgbtn().click();
	Reporter.log("login done into Actitime");
	
}

@AfterMethod
public void logout() {
	driver.findElement(By.id("LogoutLink")).click();
	Reporter.log("Logout done Successfully",true);
	
}

@AfterClass

public void closebrowser() {
	driver.close();
	Reporter.log("Browser closed",true);
	
}

@AfterSuite
public void databasedisconnection() {
	Reporter.log("Database Disconnected",true);

}

}
