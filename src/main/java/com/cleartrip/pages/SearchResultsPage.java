package com.cleartrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
	WebDriver driver;
	
	By BookFlight = By.xpath("//button[@type='submit'][2]");
	
	public SearchResultsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickBookFlight(){
		driver.findElement(BookFlight).click();
	}
}
