package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsFindAccount {

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
		
		// click on find accounts tab
		driver.findElement(By.linkText("Find Accounts")).click();
		
		// enter account name
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		
		// click on find accounts button
		driver.findElement(By.xpath("//button[contains(text(),'Find Accounts')]")).click();
		
		// clicking on credit limited account link
		driver.findElement(By.xpath("//a[contains(text(),'Credit')][1]")).click();
		
		// click on edit button
		driver.findElement(By.xpath("//a[contains(text(),'Edit')][1]")).click();
		
		// get account name
		String attribute = driver.findElement(By.id("accountName")).getAttribute("value");
		
		//Compare if the account name equals Credit Limited Account value
		if (attribute.equalsIgnoreCase("Credit Limited Account"))
			System.out.println("Matches"); //Print if it matches
		
		// get the description value
		driver.findElement(By.name("description")).getText();
		
		// get title of the page
		String title = driver.getTitle();
		
		//verify if the title matches
		if (title.equals("Edit Account | opentaps CRM"))
			System.out.println("title matches"); //Print if the title matches

        //close the browser
		 driver.close();

	}

}
