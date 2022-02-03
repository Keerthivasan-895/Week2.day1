package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthivasan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/30/22");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select d1=new Select(source);
		d1.selectByIndex(1);
		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select d2=new Select(market);
		d2.selectByValue("DEMO_MKTG_CAMP");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select d3=new Select(industry);
		d3.selectByVisibleText("Computer Software");
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select d4=new Select(ownership);
		d4.selectByVisibleText("Public Corporation");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kee");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Manual Tester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("525");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("234");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automate");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Created Information");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("24");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("987654321");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("43");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Friends");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kee@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("httpsTestLeaf.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ravikumar");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No:24/18 Flat 1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("T Nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select d5=new Select(state);
		d5.selectByIndex(1);
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603001");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select d6=new Select(country);
		d6.selectByValue("IND");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("11");
		driver.findElement(By.className("smallSubmit")).click();
	}
	
}
