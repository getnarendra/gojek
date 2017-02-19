package com.cleartrip.actions;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.cleartrip.pages.ConfirmationPage;

public class ConfirmBooking {
	
	WebDriver driver;
	ConfirmationPage cp = new ConfirmationPage(driver);
	
	public ConfirmBooking(WebDriver driver){
		this.driver = driver;
	}
	
	public void Execute(Properties p){
		
		cp.clickBookItinerary();
		cp.setUseremail(p.getProperty("username"));
		cp.clickLoginContinueBtn();
		int AdultsCount = Integer.parseInt(p.getProperty("SelectAdults"));
		int ChildCount = Integer.parseInt(p.getProperty("SelectChildren"));
		
		for(int i=0;i<AdultsCount;i++){
			cp.setSelAdultTitle(i+1);
			cp.setAdultFName(p.getProperty("Adultfirstname"),i+1);
			cp.setAdultLName(p.getProperty("Adultlastname"),i+1);
		}

		for(int i=0;i<ChildCount;i++){
			cp.setSelChildTitle(i+1);
			cp.setChildFName(p.getProperty("Childfirstname"),i+1);
			cp.setChildLName(p.getProperty("Childfirstname"),i+1);
			cp.setDob(4 + i, i+1);
			cp.setDom(4 + i, i+1);
			cp.setDoy(5 + i, i+1);
		}
		
		cp.setMobilenumber(p.getProperty("mobilenumber"));
		cp.clicktravellerBtn();
		
		
	}
	
	public boolean returnPaymentPage(WebDriver driver){
		return cp.isPaymentDisplayed();
	}

}
