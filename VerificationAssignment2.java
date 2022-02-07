package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationAssignment2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");		
		driver.manage().window().maximize();
		System.out.println("Title of the page: \n  "+driver.getTitle());   
		System.out.println("URL of the page: \n "+driver.getCurrentUrl()); 
		System.out.println("Source of the page: \n "+driver.getPageSource());
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("Attribute: \n "+attribute);
		driver.get("http://leafground.com/pages/Button.html");
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Background colour in rgba: \n "+cssValue);
		String text = driver.findElement(By.id("size")).getText();
		System.out.println("Text: \n "+text);
		Dimension size = driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize();
		System.out.println("Size: \n "+size);
		Point where = driver.findElement(By.id("position")).getLocation();
		System.out.println("Location: \n"+where);
		int x = driver.findElement(By.id("position")).getLocation().getX();
		System.out.println("Location of X: \n "+x);
		int y = driver.findElement(By.id("position")).getLocation().getY();
		System.out.println("Location of Y: \n "+y);
		String tagName = driver.findElement(By.id("size")).getTagName();
		System.out.println("TagName: \n "+tagName);
		boolean displayed = driver.findElement(By.id("position")).isDisplayed();
		System.out.println("Word Displayed(true/false): \n "+displayed);
		Thread.sleep(9000);
		driver.close();
	}

}
