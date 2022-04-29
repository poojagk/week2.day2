package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Setup browser property
		WebDriverManager.chromedriver().setup();
		
		//Launch ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		 // Load the URL
		driver.get("https://acme-test.uipath.com/login");
		
		// maximize the browser window
		driver.manage().window().maximize(); 
		
		// input the email id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com"); 
		
		// input the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12"); 
		
		// click the login button
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click(); 
		
		// get the title of the webpage
		String title = driver.getTitle(); 
		
		// Print the title on the console
		System.out.println("Title of the page is" + " " + title); 
		
		// click on the logout button
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click(); 
		
		 // close the browser
		driver.close();

	}

}
