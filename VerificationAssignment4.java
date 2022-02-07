package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationAssignment4 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		System.out.println("Title of the page: \n "+driver.getTitle());   
		System.out.println("URL of the page: \n "+driver.getCurrentUrl()); 
		System.out.println("Source of the page: \n "+driver.getPageSource());
		boolean img = driver.findElement (By.xpath("//label[contains(@for,position)]")).isDisplayed();
	    System.out.println("Image Displayed: \n "+img);
	    String text = driver.findElement (By.xpath("//label[contains(@for,position)]")).getText();
	    System.out.println("Image located: \n "+text);
	    driver.findElement (By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
	    System.out.println("Title of the page: \n "+driver.getTitle());   
		System.out.println("URL of the page: \n "+driver.getCurrentUrl()); 
	}

}
