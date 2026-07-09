package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import testbase.TestBase;
import testutil.TestUtil;

public class LoginTest extends TestBase {
	
	@BeforeMethod
	public void init() throws IOException {
		intialization(); //launch browser/url
	}
	
	@Test
	public void validLoginTest() throws IOException {
		
		LoginPage lo= new LoginPage();
		try {
		lo.login("standard_user", "secret_sauce");
		}
		catch(Exception e) {
		TestUtil.Screenshot();
		}
			
	}
	
	@Test
	public void invalidLoginTest() throws IOException {
		
		LoginPage lo= new LoginPage();
		
		lo.login("wrongusername", "secret_sauce");
		TestUtil.Screenshot();
			
	}
   @AfterMethod
	public void teardown() {
		driver.quit();
	}
}
