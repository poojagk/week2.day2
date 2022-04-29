package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setup browser property
		WebDriverManager.chromedriver().setup();

		// Launch ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("http://leafground.com/pages/Link.html");

		// maximize the browser
		driver.manage().window().maximize();

		// click on homepage link
		driver.findElement(By.xpath("(//a[contains(text(),'Go to Home Page')])[1]")).click();

		// back to main page
		driver.findElement(By.xpath("//h5[contains(text(),'HyperLink')]")).click();

		// Find where the link has to go without clicking
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
				.getAttribute("href");

		// print the attribute value
		System.out.println(attribute);

		// verify broken link
		driver.findElement(By.linkText("Verify am I broken?")).click();

		// get title of the page
		String title = driver.getTitle();

		// store the title in a string variable
		String title1 = "404 Not Found";

		// use if condition to verify
		if (title.equals(title1))
			System.out.println("Link is broken");
		else
			System.out.println("link not broken");

		// navigate back to link page
		driver.navigate().back();

		// interact with same link
		String attribute2 = driver.findElement(By.xpath("//a[contains(text(),'Go to Home Page')]"))
				.getAttribute("href");

		String attribute3 = driver.findElement(By.xpath("(//a[contains(text(),'Go to Home Page')])[2]"))
				.getAttribute("href");
		// verify if the links are same
		if (attribute2.equals(attribute3)) {
			driver.navigate().to(attribute2);
			System.out.println("same link");
		} else
			System.out.println("different links");

		// find the number of links in the page
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		// get the count
		int size = findElements.size();

		// print the count
		System.out.println("the number of links are" + " " + size);
		
		//close the browser
		driver.close();
	}

}
