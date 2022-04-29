package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		// click on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		// click on create lead tab
		driver.findElement(By.linkText("Create Lead")).click();
		
		// enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MAC");
		
		// enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pooja");
		
		// enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("GK");
		
		// click on create lead button
		driver.findElement(By.name("submitButton")).click();
		
		// get title
		String title = driver.getTitle();
		
		// print the title in console
		System.out.println("The title of the page is" + " " + title);
		
		// close the browser
		driver.close();

	}

}
