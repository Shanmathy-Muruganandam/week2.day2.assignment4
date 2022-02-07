package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationAssignment3 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		System.out.println("Title of the page: \n "+driver.getTitle());   
		System.out.println("URL of the page: \n "+driver.getCurrentUrl()); 
		System.out.println("Source of the page: \n "+driver.getPageSource());
		boolean link = driver.findElement (By.xpath("(//div[@class='row']//div)[3]")).isEnabled();
	    System.out.println("Link Enabled: \n "+link);
	    String text = driver.findElement (By.xpath("(//div[@class='row']//div)[3]")).getText();
	    System.out.println("Link texted as: \n "+text);
		
	}

}
