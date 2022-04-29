package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Setup browser property
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
		
		// click create account tab
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		
		// select prefered currency as Indian rupee using select class
		WebElement selElement = driver.findElement(By.id("currencyUomId"));
		
		// use select class to select value from dropdown
		Select sel = new Select(selElement);
		
		// use selectByValue to select a value from dropdown
		sel.selectByValue("INR");
		
		// enter value in description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		
		// enter local name field
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Pooja");
		
		// enter sitename field
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
		
		// enter annual revenue value
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("45");
		
		// enter create account button
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		// get the error message title displayed on the screen
		String text = driver.findElement(By.xpath("//div[@class='errorMessageHeader']")).getText();
		
		// get the error msg content
		String errorMsg = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		
		//print the error title and message
		System.out.println("Error message is" + " " + text + " " + errorMsg);
		
		// close the browser
		driver.close();
	}

}
