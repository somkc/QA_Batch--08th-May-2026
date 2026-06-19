package sauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@class='title']"));
	   
	    System.out.println("LOGIN IS SUCCESSFUL");
		}
		catch(Exception e) {
			String error=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
			System.out.println("LOGIN FAILED");
			System.out.println(error);
		}
	   
	    driver.quit();

	}

}
