
package BrowserMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://saucedemo.com");
	driver.manage().window().maximize();
	//driver.manage().window().minimize();
	String title=driver.getTitle();
	System.out.println(title);
	String pagesource=driver.getPageSource();
	System.out.println(pagesource);
	//driver.close();
	driver.quit();
	
	

	}

}
