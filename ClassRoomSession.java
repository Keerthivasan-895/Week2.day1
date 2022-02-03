package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomSession {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input [contains (@id,'pass')]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input [@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a [contains (text (),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a [text()='Leads']")).click();
		driver.findElement(By.xpath("//a [text()='Create Lead']")).click();
		driver.findElement(By.xpath("(//input [contains (@class,'input')])[3]")).sendKeys("Dhoni");
		driver.findElement(By.xpath("(//input[contains(@name,'last')])[3]")).sendKeys("MS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
		
	}

}
