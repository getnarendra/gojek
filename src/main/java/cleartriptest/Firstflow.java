package cleartriptest;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cleartrip.actions.SelectFlight;

import junit.framework.Assert;

public class Firstflow {
	
	public static WebDriver driver=null;
	
	@BeforeClass
	private static void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");		
		driver = new ChromeDriver();
	}
	
	@Test
	public void testhomepage() throws IOException{
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		SelectFlight sf = new SelectFlight(driver);
		sf.BookRoundTrip();
	}
	
	@Test(enabled=false)
	public static void Booktrip(){

		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement trip_type = driver.findElement(By.id("RoundTrip"));
		trip_type.click();
		
		
		By FromTag = (By.id("FromTag"));
		driver.findElement(FromTag).clear();
		driver.findElement(FromTag).sendKeys("Bangalore");
		By ToTag = By.id("ToTag");
		driver.findElement(ToTag).clear();
		driver.findElement(ToTag).sendKeys("New Delhi");
		By DepartDate = By.id("DepartDate");
		driver.findElement(DepartDate).clear();
		driver.findElement(DepartDate).sendKeys("01/06/2017");
		
		By ReturnDate = By.id("ReturnDate");
		driver.findElement(ReturnDate).clear();
		driver.findElement(ReturnDate).sendKeys("01/07/2017");
		
		
		driver.findElement(ToTag).click();
		By Adults = By.id("Adults");
		By Children = By.id("Childrens");
		Select selAdults = new Select(driver.findElement(Adults));
		selAdults.selectByValue("2");
		
		Select selChildren = new Select(driver.findElement(Children));
		selChildren.selectByValue("2");
			
		driver.findElement(By.id("SearchBtn")).click();
		
/*		WebElement divElement = driver.findElement(By.className("truncate"));
		String str = divElement.toString();
		System.out.println("str : " +  str);
*/		
//		String divsummary = "//div[contains(@class,'searchSummary')]";
//		WebElement srchsumm = driver.findElement(By.xpath(divsummary));
//		System.out.println("searhc summary : " + srchsumm.toString());
		
		By modifySearchBtn = By.xpath("//a[@id='modifySearchLink']");
//		org.testng.Assert.assertEquals(driver.findElement(modifySearchBtn).isDisplayed(), true);

		
		
/*	     List<WebElement> number_of_displa_block = driver.findElements(By.cssSelector("div[style*='block']"));  
	     //Print total size display block webelements   
	     System.out.println("Display Block =: " + number_of_displa_block.size());  
	     System.out.println("========================================================");  
	     for (int i = 0; i < number_of_displa_block.size(); i++) {  
	       // Print all display block Webelements text   
	       if (!(number_of_displa_block.get(i).getText().trim().isEmpty())) {  
	         System.out.println("Displa Block Element = " + i + " " + number_of_displa_block.get(i).getAttribute("style").trim() + " " + number_of_displa_block.get(i).getText().trim());  
	       } else {  
	         System.out.println("Displa Block Element = " + i + " " + number_of_displa_block.get(i).getAttribute("style").trim());  
	       }  
	     }  
		
		
	     List<WebElement> number_of_hidden_input_Elements = driver.findElements(By.cssSelector("div[style*='block']"));  
	     //Print total size input hidden webelements   
	     System.out.println("\n\nInput Hidden Element =: " + number_of_hidden_input_Elements.size());  
	     System.out.println("========================================================");  
	     for (int i = 0; i < number_of_hidden_input_Elements.size(); i++) {  
	       // Print all hidden input webelements value   
	       if (number_of_hidden_input_Elements.get(i).getAttribute("type").trim().equalsIgnoreCase("submit")) {  
	         //Check empty text   
	         if (!(number_of_hidden_input_Elements.get(i).getAttribute("class").trim().isEmpty())) {  
	           //Print hidden Element texts   
	           System.out.println("Input Hidden Element = " + i + " " + number_of_hidden_input_Elements.get(i).getAttribute("class").trim());  
	           System.out.println("Input Hidden Element = " + i + " " + number_of_hidden_input_Elements.get(i).getText());  
	           
	           if ((number_of_hidden_input_Elements.get(i).getAttribute("class").trim()== "booking fRight")) {
	        	   number_of_hidden_input_Elements.get(i).click();
	        	   System.out.println("clicked on submit");
	           }
	           
	         }  
	       }  
	     }
		
*/		
		//Confirm flight page
//			new WebDriverWait(driver, 30)
//            .until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".booking.fRight"))));
//		
/*		WebElement element = driver.findElement(By.cssSelector(".booking.fRight"));
		JavascriptExecutor Executor = (JavascriptExecutor) driver;
		Executor.executeScript("arguments[0].setAttribute('style', 'visibility: visible;');", element);
*///		Executor.executeScript("arguments[0].click();", element);

//		driver.findElement(By.xpath("//button[@type=submit]")).click();

		WebElement element1 = driver.findElement(By.xpath("//button[@type='submit'][2]"));

		Actions actions1 = new Actions(driver);

		actions1.moveToElement(element1).click().perform();

		
//		driver.findElement(By.xpath("//*[@id=\"flightForm\"]/section[2]/div[3]/div[3]/button[@type=\"submit\"]")).click();
		
/*		System.out.println("1 = " + driver.findElement(By.xpath("//div[@class='col col3 actionCol']")).isDisplayed()) ;
		System.out.println("2 = " +	driver.findElement(By.cssSelector("button[class='.booking.fRight']")).isDisplayed());
		System.out.println("3 = " +	driver.findElement(By.cssSelector(".booking.fRight")).getAttribute("type"));
*/
/*		 WebElement invisibleelement= driver.findElement(By.cssSelector(".booking.fRight"));  
		 JavascriptExecutor executor = (JavascriptExecutor)driver;  
		 executor.executeScript("arguments[0].click();", invisibleelement);  
*/
		
//		driver.findElement(By.cssSelector(".booking.fRight")).click();
//		driver.findElement(By.cssSelector("button[type=submit]")).click();
		//confirm insurance
		driver.findElement(By.id("itineraryBtn")).click();

		driver.findElement(By.id("username")).sendKeys("abc@yahoo.com");

		WebElement element = driver.findElement(By.id("LoginContinueBtn_1"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).click().perform();
		
//		driver.findElement(By.id("LoginContinueBtn_1")).click();

//		driver.findElement(By.id("insurance_confirm")).click();
		
		//Enter Traveller Info
		int AdultsCount = 2;
		int ChildrenCount = 2;
		
		String AdultTitle[] = new String[AdultsCount];
		String ChildTitle[] = new String[ChildrenCount];

		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("AdultTitle1"))));

		
		for(int i=0;i<AdultsCount;i++){
			By selAdultTitle =  By.id("AdultTitle" + (i+1));
			Select title = new Select(driver.findElement(By.id("AdultTitle" + (i+1))));
			title.selectByIndex(i+1);
			
			driver.findElement(By.id("AdultFname" + (i+1))).sendKeys("FName");
			driver.findElement(By.id("AdultLname" + (i+1))).sendKeys("LName");
		}
		
		for(int i=0;i<ChildrenCount;i++){
			By selChildTitle =  By.id("ChildTitle" + (i+1));
			Select title = new Select(driver.findElement(selChildTitle));
			title.selectByIndex(i+1);
			
			driver.findElement(By.id("ChildFname" + (i+1))).sendKeys("ChildFName");
			driver.findElement(By.id("ChildLname" + (i+1))).sendKeys("ChidLName");
			
			By dob = By.id("ChildDobDay" + (i+1));
			Select selDay = new Select(driver.findElement(dob));
			selDay.selectByValue("4");
			
			By dom = By.id("ChildDobMonth" + (i+1));
			Select selMonth = new Select(driver.findElement(dom));
			selMonth.selectByIndex(4);
			
			By doy = By.id("ChildDobYear" + (i+1));
			Select selYear = new Select(driver.findElement(doy));
			selYear.selectByIndex(4);
			
		}
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9912345678");
		
		driver.findElement(By.id("travellerBtn")).click();

	}
	
	@AfterClass
	public static void teardown(){
//		driver.close();
	}
	
}
