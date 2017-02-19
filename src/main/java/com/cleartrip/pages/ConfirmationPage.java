package com.cleartrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {
	
	WebDriver driver;
	
	By bookItinerary = By.id("itineraryBtn");

	By useremail = By.id("username");

	By LoginContinueBtn = By.id("LoginContinueBtn_1");
 
	By selAdultTitle =  By.id("AdultTitle");
	
	By AdultFName = By.id("AdultFname");
	By AdultLName = By.id("AdultLname");
	
	By selChildTitle =  By.id("ChildTitle");
	By ChildFName = By.id("ChildFname");
	By ChildLName = By.id("ChildLname");
	By dob = By.id("ChildDobDay");
	By dom = By.id("ChildDobMonth");
	By doy = By.id("ChildDobYear");
	By mobilenumber = By.id("mobileNumber");
	By travellerBtn = By.id("travellerBtn");
	
	By creditCardNo = By.id("creditCardNumberDisp");
	
	public boolean isPaymentDisplayed(){
		if(driver.findElement(creditCardNo).isDisplayed())
			return true;
		else
			return false;
	}
	
	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickBookItinerary() {
		driver.findElement(bookItinerary).click();
	}
	
	public void setUseremail(String struseremail) {
		driver.findElement(useremail).sendKeys(struseremail);;
	}
	public void clickLoginContinueBtn() {
		driver.findElement(LoginContinueBtn).click();
	}
	public void setSelAdultTitle(int intselAdultTitle) {
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("AdultTitle" + intselAdultTitle))));
		Select title = new Select(driver.findElement(By.id("AdultTitle" + intselAdultTitle)));
		title.selectByIndex(intselAdultTitle);
	}
	public void setAdultFName(String stradultFName, int index) {
		driver.findElement(By.id("AdultFname" + index)).sendKeys(stradultFName);
	}
	public void setAdultLName(String stradultLName, int index) {
		driver.findElement(By.id("AdultLname" + index)).sendKeys(stradultLName);
	}
	public void setSelChildTitle(int index) {
		Select title = new Select(driver.findElement(By.id("ChildTitle" + index)));
		title.selectByIndex(index);
	}
	public void setChildFName(String strchildFName, int index) {
		driver.findElement(By.id("ChildFname" + index)).clear();
		driver.findElement(By.id("ChildFname" + index)).sendKeys(strchildFName);
	}
	public void setChildLName(String strchildLName, int index) {
		driver.findElement(By.id("ChildLname" + index)).clear();
		driver.findElement(By.id("ChildLname" + index)).sendKeys(strchildLName);
	}
	public void setDob(int intdob, int index) {
		Select selDay = new Select(driver.findElement(By.id("ChildDobDay" + index)));
		selDay.selectByIndex(intdob);
	}
	public void setDom(int intdom, int index) {
		Select selMonth = new Select(driver.findElement(By.id("ChildDobMonth" + index)));
		selMonth.selectByIndex(intdom);
	}
	public void setDoy(int intdoy, int index) {
		Select selYear = new Select(driver.findElement(By.id("ChildDobYear" + index)));
		selYear.selectByIndex(intdoy);
	}
	public void setMobilenumber(String strmobilenumber) {
		driver.findElement(mobilenumber).clear();
		driver.findElement(mobilenumber).sendKeys(strmobilenumber);
	}

	public void clicktravellerBtn(){
		driver.findElement(travellerBtn).click();
	}
	
}
