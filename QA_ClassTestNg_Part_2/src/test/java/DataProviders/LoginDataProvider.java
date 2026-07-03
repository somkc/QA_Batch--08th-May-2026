package DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {
	
	@DataProvider(name="loginData")
	public String[][] data() {
		String[][] cred= new String[3][2];
		cred[0][0]="standard_user";
		cred[0][1]="secret_sauce";
		
		cred[1][0]="locked_out_user";
		cred[1][1]="secret_sauce";
		
		cred[2][0]="error_user";
		cred[2][1]="secret_sauce";
		
		return cred;
	}
	
	
	@Test(dataProvider="loginData")
	public void login(String username, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	     driver.quit();

	}
	
	

}
