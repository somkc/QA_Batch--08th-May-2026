package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLoc {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(null).sendKeys("standard_user");

	}

}
