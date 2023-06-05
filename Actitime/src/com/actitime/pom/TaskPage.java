package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	//declaration
	
	@FindBy (xpath ="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy (xpath ="//div[.='+ New Customer']")
	private WebElement newCust;
	
	@FindBy (xpath ="//input[@placeholder='Enter Customer Name']")
	private WebElement custname;
	
	@FindBy (xpath ="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesp;
	
	@FindBy (xpath ="//div[.='Create Customer']")
	private WebElement createbtn;
	
	//initialization
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewCust() {
		return newCust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesp() {
		return custdesp;
	}

	public WebElement getCreatebtn() {
		return createbtn;
	}
	
}	



