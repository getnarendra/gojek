package com.cleartrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	
	By tripType = By.id("RoundTrip");
	By DepartFrom = By.id("FromTag");
	By DepartTo = By.id("ToTag");
	By DepartDate = By.id("DepartDate");
	By ReturnDate = By.id("ReturnDate");
	By SelectAdults = By.id("Adults");
	By SelectChildren = By.id("Childrens");
	By SearchBtn = By.id("SearchBtn");

	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	public void setTripType() {
		driver.findElement(tripType).click();
	}

	public void setDepartFrom(String DepFrom) {
		driver.findElement(DepartFrom).clear();
		driver.findElement(DepartFrom).sendKeys(DepFrom);
	}

	public void setDepartTo(String departTo) {
		driver.findElement(DepartTo).clear();
		driver.findElement(DepartTo).sendKeys(departTo);
	}

	public void setDepartDate(String departDate) {
		driver.findElement(DepartDate).clear();
		driver.findElement(DepartDate).sendKeys(departDate);
	}

	public void setReturnDate(String returnDate) {
		driver.findElement(ReturnDate).clear();
		driver.findElement(ReturnDate).sendKeys(returnDate);
	}

	public void setSelectAdults(String selectAdults) {
		Select selAdults = new Select(driver.findElement(SelectAdults));
		selAdults.selectByValue(selectAdults);
	}


	public void setSelectChildren(String selectChildren) {
		Select selChildren = new Select(driver.findElement(SelectChildren));
		selChildren.selectByValue(selectChildren);
	}

	public void setSearchBtn() {
		driver.findElement(SearchBtn).click();
	}

	
}
