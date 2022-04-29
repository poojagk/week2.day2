package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// setup browser property
		WebDriverManager.chromedriver().setup();

		// Launch chrome driver
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();
        
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Input the opencart url
		driver.get("https://www.opencart.com/index.php?route=account/register");

		// select the country from dropdown using sendkeys
		driver.findElement(By.xpath("//select[@id='input-country']")).sendKeys("Austria");

		// close the browser
		driver.close();
	}

}
