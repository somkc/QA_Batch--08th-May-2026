package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testbase.TestBase;

public class HomeTest extends TestBase {
	
	@BeforeMethod
	public void init() throws IOException {
		intialization(); //launch browser/url
	}
	
	@Test
	public void addtocart() {
       LoginPage lo= new LoginPage();
		
		lo.login("standard_user", "secret_sauce");
		
		HomePage home= new HomePage();
		home.itemsToCart();
	}
	
	@Test
	public void removeFromcart() {
	       LoginPage lo= new LoginPage();
			
			lo.login("standard_user", "secret_sauce");
			
			HomePage home= new HomePage();
			home.removeItem();
		}
	 @AfterMethod
		public void teardown() throws InterruptedException {
		 Thread.sleep(2000);
		driver.quit();
		}
}
