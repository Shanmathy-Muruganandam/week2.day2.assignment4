package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationAssignment6 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		System.out.println("Title of the page: \n  "+driver.getTitle());   
		System.out.println("URL of the pages: \n "+driver.getCurrentUrl()); 
		System.out.println("Source of the page: \n"+driver.getPageSource());
		boolean sel = driver.findElement(By.xpath("//label[@for='java']")).isSelected();
		System.out.println("Is Java selected: \n "+sel);
		boolean sel1 = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		System.out.println("Selenium checked: \n "+sel1);
		boolean sel2 = driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).isSelected();
		System.out.println("Am I Selected?: \n "+sel2);
				
	}


}
