package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationAssignment1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		System.out.println("Title of the page: \n "+driver.getTitle());   
		System.out.println("URL of the page: \n  "+driver.getCurrentUrl()); 
		System.out.println("Source of the page: \n "+driver.getPageSource());
		String attribute = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println("Attribute value: \n "+attribute);
		boolean enabled = driver.findElement(By.name("username")).isEnabled();
		System.out.println("Username is Enabled: \n"+enabled);
	    boolean enabled2 = driver.findElement(By.id("email")).isEnabled();
	    System.out.println("Email ID is Enabled: \n "+enabled2);
	    boolean enabled3 = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following::input")).isEnabled();
	    System.out.println("Edit Field is Enabled: \n "+enabled3);
	    Thread.sleep(5000);
	    driver.close();
	}

}
