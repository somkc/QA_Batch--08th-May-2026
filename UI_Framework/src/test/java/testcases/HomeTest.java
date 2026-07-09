package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testbase.TestBase;
import testutil.TestUtil;

public class HomeTest extends TestBase {
	
	@BeforeMethod
	public void init() throws IOException {
		intialization(); //launch browser/url
		 TestUtil.login();
	}
	
	@Test
	public void addtocart() {
     	
		HomePage home= new HomePage();
		home.itemsToCart();
	}
	
	@Test
	public void removeFromcart() {
	      
			
			HomePage home= new HomePage();
			home.removeItem();
		}
	
	@Test
	public void sorting() throws InterruptedException {
		  
			HomePage home= new HomePage();
			Thread.sleep(2000);
			home.sort(2);
		
	}
	 @AfterMethod
		public void teardown() throws InterruptedException {
		 Thread.sleep(2000);
		driver.quit();
		}
}
