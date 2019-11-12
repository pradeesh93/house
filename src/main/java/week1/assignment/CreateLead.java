package week1.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateLead {

	@Test
	@Parameters({"url","username","password"})
	
	
	public void runCreateLead() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("uName");
		driver.findElementById("password").sendKeys("password");
		WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
		loginButton.click();
		//driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("CRM/").click();
	
		
		
		
        WebElement Leads = driver.findElementByXPath("//a[text()='Leads']");
        Leads.click();
	WebElement CreateLead = driver.findElementByXPath("//a[text()='Create Lead']");
			CreateLead.click();
			
		driver.findElementById("createLeadForm_companyName").sendKeys("testleaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("pradeesh");
		driver.findElementById("createLeadForm_lastName").sendKeys("t");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("ab");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("c");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd = new Select(source);
		dd.selectByVisibleText("Employee");
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("work");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("1000000");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select(industry);
		dd1.selectByVisibleText("Finance");
		WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown = new Select(Ownership);
		dropdown.selectByVisibleText("Partnership");
		
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("tpp");
		
		driver.findElementById("createLeadForm_description").sendKeys("todowork");
		driver.findElementById("createLeadForm_importantNote").sendKeys("mnop");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("33");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("21");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("91");
		driver.findElementById("createLeadForm_departmentName").sendKeys("bank");
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		
		Select drop = new Select(currency);
		drop.selectByVisibleText("USD - American Dollar");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("15");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("prem");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.facebook.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("karthi");
		driver.findElementByXPath("//input[@name='generalAddress1']").sendKeys("richard street");
		driver.findElementByXPath("//input[@name='generalAddress2']").sendKeys("nggo colony");
		driver.findElementById("createLeadForm_generalCity").sendKeys("coimbatore");
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select down = new Select(country);
		down.selectByVisibleText("American Samoa");
				
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("641022");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("23");
		WebElement campaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select ab = new Select(campaign);
		ab.selectByVisibleText("Affiliate Sites");
		
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9786399169");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("pradeeshht93@gmail.com");
		WebElement CreateLead2 = driver.findElementByXPath("//input[@value='Create Lead']");
		CreateLead2.click();
		
		 WebElement firstName = driver.findElementByXPath("//span[text()='pradeesh']");
		 String value = firstName.getText();
		 boolean compare = value.equals("pradeesh");
		 System.out.println(compare);
		
		
		
		 
		
		
		
		}

}
