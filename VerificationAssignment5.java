package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationAssignment5 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		System.out.println("Title of the page: \n"+driver.getTitle());   
		System.out.println("URL of the page: \n"+driver.getCurrentUrl()); 
		System.out.println("Source of the page: \n"+driver.getPageSource());
		System.out.println("Select the Training Program:");
		boolean selected = driver.findElement(By.id("dropdown1")).isSelected();
		System.out.println("Using Index: \n"+selected);
		String tagName = driver.findElement(By.name("dropdown2")).getTagName();
		System.out.println("Using Name: \n"+tagName);
		Dimension size = driver.findElement(By.id("dropdown3")).getSize();	
		System.out.println("Using Size: \n"+size);
		Point location = driver.findElement(By.className("dropdown")).getLocation();
		System.out.println("Location: \n"+location);
	}

}
