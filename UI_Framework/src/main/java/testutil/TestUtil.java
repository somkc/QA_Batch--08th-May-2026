package testutil;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pages.LoginPage;
import testbase.TestBase;


public class TestUtil extends TestBase {
	static Select select;
	
	public static String DateTime() {
		LocalDateTime myDateObj = LocalDateTime.now();
		   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    return formattedDate;
		
	}

	public static void Screenshot() throws IOException {
		String name=driver.getTitle()+"_"+DateTime();
		TakesScreenshot scrShot= ((TakesScreenshot)driver);
		
		File ScrFile= scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile= new File(System.getProperty("user.dir")+"\\screenshots\\"+name+".jpeg");
		
		FileUtils.copyFile(ScrFile, DestFile);
	}
	
	public static void selectByIndex(WebElement dropdown,int index) {
		select= new Select(dropdown);
		select.selectByIndex(index);
		
	}
	public static void selectByValue(WebElement dropdown,String value) {
		select= new Select(dropdown);
		select.selectByValue(value);
		
	}
	public static void selectByVisibleText(WebElement dropdown,String text) {
		select= new Select(dropdown);
		select.selectByVisibleText(text);
		
	}
	
	public static void handleAlert() {
		Alert al=driver.switchTo().alert();
		al.accept();
		
	}
	
	public static void login() {
		  LoginPage lo= new LoginPage();
			
			lo.login("standard_user", "secret_sauce");
			
	}
	public static void main(String[] args) {
		DateTime();
	}
}
