package week2.day1.session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LanchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jagan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("I");
		
		WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select sec = new Select(sourcedd);
		
		sec.selectByIndex(4);
		
		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select sec1 = new Select(market);
		
		sec1.selectByVisibleText("Automobile");
		
		WebElement corp = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select sec2 = new Select(corp);
		
		sec2.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title); 

		
		
	}

}

//driver.get("https://login.salesforce.com/");
//driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
//driver.findElement(By.name("pw")).sendKeys("Leaf@1234");
//driver.findElement(By.name("Login")).click();
//
//String title = driver.getTitle();
//System.out.println(title); 

//driver.get("https://www.facebook.com/");
//driver.findElement(By.name("email")).sendKeys("demouser");
//driver.findElement(By.id("pass")).sendKeys("demouser");
//driver.findElement(By.name("login")).click();
