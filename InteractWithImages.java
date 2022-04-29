package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setup browser property
		WebDriverManager.chromedriver().setup();

		// Launch ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("http://leafground.com/pages/Image.html");

		// maximize the browser
		driver.manage().window().maximize();

		// click on the page
		driver.findElement(
				By.xpath("//label[contains(text(),'Click on this image to go home page')]/following-sibling::img"))
				.click();

		// getback to Image page
		driver.findElement(By.xpath("//h5[contains(text(),'Image')]")).click();

		// check if image is broken
		String attribute = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following::img[1]"))
				.getAttribute("naturalWidth");
		System.out.println(attribute);

		if (attribute != null)
			System.out.println("this image is broken");
		else
			System.out.println("image is not broken");

		// click using keyboard
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following::img")).click();
		System.out.println("clicked using keyboard");

		// getback to Image page
		driver.findElement(By.xpath("//h5[contains(text(),'Image')]")).click();

		// click using mouse
		WebElement findElement = driver
				.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following::img"));
		Actions action = new Actions(driver);
		action.moveToElement(findElement).click().build().perform();
		System.out.println("clicked using mouse");

		// getback to Image page
		driver.findElement(By.xpath("//h5[contains(text(),'Image')]")).click();

		// close the browser
		driver.close();
	}

}
