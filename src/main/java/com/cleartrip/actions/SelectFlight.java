package com.cleartrip.actions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.cleartrip.pages.HomePage;
import com.cleartrip.utils.BaseUtils;

public class SelectFlight {
	WebDriver driver;
	
	public SelectFlight(WebDriver driver){
		this.driver = driver;
	}
	
	public void BookRoundTrip() throws IOException{
		HomePage homepage = new HomePage(driver);
		Properties data = new BaseUtils().Readproperties();
		System.out.println("In Book");
		homepage.setTripType();
		homepage.setReturnDate(data.getProperty("ReturnDate"));
		homepage.setDepartDate(data.getProperty("DepartDate", "01/06/2017"));
		homepage.setDepartFrom(data.getProperty("DepartFrom"));
		homepage.setDepartTo(data.getProperty("DepartTo"));
		homepage.setSelectAdults(data.getProperty("SelectAdults"));
		homepage.setSelectChildren(data.getProperty("SelectChildren"));
		homepage.setDepartFrom(data.getProperty("DepartFrom"));
		homepage.setSearchBtn();
	}
}
