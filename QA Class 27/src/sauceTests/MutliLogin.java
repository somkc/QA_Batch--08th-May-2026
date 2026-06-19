package sauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutliLogin {
	public void multilogintest(String uname, String pwd) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	   
	    driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		
		MutliLogin mul = new MutliLogin();
		mul.multilogintest("standard_user","secret_sauce");
		mul.multilogintest("locked_out_user","secret_sauce");
		mul.multilogintest("problem_user","secret_sauce");
		mul.multilogintest("performance_glitch_user","secret_sauce");
		mul.multilogintest("error_user","secret_sauce");
		mul.multilogintest("visual_user","secret_sauce");
		

	}

}
