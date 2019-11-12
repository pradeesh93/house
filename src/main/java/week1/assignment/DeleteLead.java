package week1.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DeleteLead {
@Test
@Parameters({"url","username","password"})
	public void runDeleteLead() {
	 
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
		loginButton.click();
		//driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("CRM/").click();
		 WebElement Leads = driver.findElementByXPath("//a[text()='Leads']");
	        Leads.click();
	        WebElement Findleads = driver.findElementByXPath("//a[text()='Find Leads']");
            Findleads.click();
            
	}	

}
