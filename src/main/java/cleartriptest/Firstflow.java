package cleartriptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Firstflow {
	
	public static WebDriver driver=null;
	
	@BeforeClass
	private static void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");		
		driver = new ChromeDriver();
	}
	
	@Test
	public static void Booktrip(){

		driver.get("http://www.cleartrip.com");
		By FromTag = (By.id("FromTag"));
		driver.findElement(FromTag).clear();
		driver.findElement(FromTag).sendKeys("Bangalore");
		By ToTag = By.id("ToTag");
		driver.findElement(ToTag).clear();
		driver.findElement(ToTag).sendKeys("New Delhi");
		By DepartDate = By.id("DepartDate");
		driver.findElement(DepartDate).clear();
		driver.findElement(DepartDate).sendKeys("01/06/2017");
		
		driver.findElement(ToTag).click();
		By Adults = By.id("Adults");
		By Children = By.id("Childrens");
		Select selAdults = new Select(driver.findElement(Adults));
		selAdults.selectByValue("2");
		
		Select selChildren = new Select(driver.findElement(Children));
		selChildren.selectByValue("2");
			
		driver.findElement(By.id("SearchBtn")).click();
		
		By modifySearchBtn = By.id("modifySearchLink");
		org.testng.Assert.assertEquals(driver.findElement(modifySearchBtn).isDisplayed(), true);
		driver.close();
		
	}
	
}
