package com.actitime.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.GenericLibrary.BaseClass;
import com.actitime.GenericLibrary.FileLibrary;
import com.actitime.pom.Homepage;
import com.actitime.pom.TaskPage;

public class CreateCustomer extends BaseClass {

	@Test
	public void createcustomer () throws EncryptedDocumentException, IOException {
		Homepage hp= new Homepage(driver);
		hp.getTasktab().click();
		TaskPage tp = new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewCust().click();
		FileLibrary f1=new FileLibrary();
		String customer = f1.readDataFromExcel("Data", 1, 5);
		tp.getCustname().sendKeys(customer);
		String description = f1.readDataFromExcel("Data", 2, 5);
		tp.getCustdesp().sendKeys(description);
		tp.getCreatebtn().click();
		String expectedresult = customer;
		String actualresult = driver.findElement(By.xpath("(//div[.='"+customer+"'])[2]")).getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualresult, expectedresult);
	}
		
}	
		