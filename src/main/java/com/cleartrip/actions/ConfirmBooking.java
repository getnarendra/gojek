package com.cleartrip.actions;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.cleartrip.pages.ConfirmationPage;

public class ConfirmBooking {
	
	WebDriver driver;
	
	public ConfirmBooking(WebDriver driver){
		this.driver = driver;
	}
	
	public void Execute(Properties p){
		ConfirmationPage cp = new ConfirmationPage(driver);
		
		cp.clickBookItinerary();
		cp.setUseremail(p.getProperty("username"));
		cp.clickLoginContinueBtn();
		int AdultsCount = Integer.parseInt(p.getProperty(""));
		int ChildCount = Integer.parseInt(p.getProperty(""));
		
		for(int i=0;i<AdultsCount;i++){
			cp.setSelAdultTitle(i+1);
			cp.setAdultFName("",i+1);
			cp.setAdultLName("",i+1);
		}

		for(int i=0;i<ChildCount;i++){
			cp.setSelChildTitle(i+1);
			cp.setChildFName("",i+1);
			cp.setChildLName("",i+1);
			cp.setDob(4 + i);
			cp.setDom(4 + i);
			cp.setDoy(5 + i);
		}
		
		cp.setMobilenumber("");
		cp.clicktravellerBtn();
	}

}
