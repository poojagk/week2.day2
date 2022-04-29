package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsCreateAccount {

	public static void main(String[] args) {
		
		// setup browser property
		WebDriverManager.chromedriver().setup();
		
		// Launch chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		// get the leaftaps url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// maximize the browser window
		driver.manage().window().maximize();
		
		// input the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		// input the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// click on Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		// click on create account tab
		driver.findElement(By.linkText("Create Account")).click();
		
		// enter the account name
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		
		// enter the description value
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		// enter the local name
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Pooja");
		
		// enter the site name
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
		
		// enter the annual revenue
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("45");
		
		// click on create account button
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		// close the browser
		driver.close();

	}

}
