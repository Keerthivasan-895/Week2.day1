package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassSession {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement d1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select emp=new Select(d1);
		emp.selectByVisibleText("Employee");
		WebElement d2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select fin=new Select(d2);
		fin.selectByValue("IND_FINANCE");
		WebElement d3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own=new Select(d3);
		own.selectByIndex(2);
	}

}
