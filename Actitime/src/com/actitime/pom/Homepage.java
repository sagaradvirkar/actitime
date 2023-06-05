package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	//declaration
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasktab;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reporttab;
	
	@FindBy (xpath = "//div[.='Users']")
	private WebElement usertab;
	
	@FindBy (xpath = "//div[.='logoutLink']")
	private WebElement logoutlink;
	
	
	//initialization
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//utilization

	public WebElement getTasktab() {
		return tasktab;
	}


	public WebElement getReporttab() {
		return reporttab;
	}


	public WebElement getUsertab() {
		return usertab;
	}


	public WebElement getLogoutlink() {
		return logoutlink;
	}

	
	
}

	

