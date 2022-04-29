package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setup browser property
		WebDriverManager.chromedriver().setup();

		// Launch ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("http://leafground.com/pages/checkbox.html");

		// maximize the browser
		driver.manage().window().maximize();

		// select the languages known
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		// to check if selenium is checked or not
		boolean selected = driver
				.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();

		// use if condition to see if its true or not
		if (selected)
			System.out.println("Selected");
		else
			System.out.println("not selected");

		// deselect selected checkbox
		List<WebElement> findElements = driver
				.findElements(By.xpath("//label[text()='DeSelect only checked']/following::input"));
		for (int i = 0; i < findElements.size(); i++) {
			if (findElements.get(i).isSelected()) {
				findElements.get(i).click();
			}
		}

		// select all checkboxes
		List<WebElement> findElements2 = driver
				.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
		for (int i = 0; i < findElements2.size(); i++)
			findElements2.get(i).click();

		// close the browser
		driver.close();

	}
}
