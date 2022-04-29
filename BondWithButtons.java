package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Setup browser property
		WebDriverManager.chromedriver().setup();
		
		//Launch ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leafground.com/pages/Button.html");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//click on the go to homepage button
		driver.findElement(By.id("home")).click();
		
		//getback to button page
		driver.findElement(By.xpath("//h5[contains(text(),'Button')]")).click();
		
		//get position of x,y button
		Point location = driver.findElement(By.id("position")).getLocation();
		
		//get position of x
		int x=location.getX();
		
		//print location of x
		System.out.println("location of x"+" "+x);
		
		//get position of y
		int y=location .getY();
		
		//print location of y
		System.out.println("location of y"+" "+y);
		
		//get color of the button
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		
		//print the color
		System.out.println("Color of the button is"+" "+cssValue);
		
		//get the size of the button
		Dimension size = driver.findElement(By.id("size")).getSize();
		
		//get height
		System.out.println("Height is"+" "+size.getHeight());
		
		//get width
		System.out.println("Width is"+" "+size.getWidth());
		
		//close browser
		driver.close();
		
	}

}
