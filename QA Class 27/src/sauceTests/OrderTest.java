package sauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderTest {
	public void order() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	    Thread.sleep(3000);
	    driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
