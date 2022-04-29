package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setup browser property
		WebDriverManager.chromedriver().setup();

		// Launch ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("http://leafground.com/pages/Edit.html");

		// maximize the browser
		driver.manage().window().maximize();

		// enter email address
		driver.findElement(By.id("email")).sendKeys("gkpooja93@gmail.com");

		// append text
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("sample");
		// PRess tab in keyboard
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);

		// get default text
		String attribute = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");

		// print the value
		System.out.println("The default value is" + " " + attribute);

		// clear the text in textbox
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();

		// check if the textbox is disabled
		boolean enabled = driver
				.findElement(By.xpath(
						"//label[contains(text(),'Confirm that edit field is disabled')]/following-sibling::input"))
				.isEnabled();

		// if textbox is not enabled then print the following
		if (!enabled)
			System.out.println("textbox is disabled");

		// close the browser
		driver.close();

	}

}
