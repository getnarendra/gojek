package com.cleartrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage {
	
	WebDriver driver;
	
	By bookItineraary = By.id("itineraryBtn");

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
	
}
