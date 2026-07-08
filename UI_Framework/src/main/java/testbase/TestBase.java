package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	Properties prop;
	FileInputStream fis; 
	public static WebDriver driver;
	
	public void intialization() throws IOException {
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		int timeout=Integer.parseInt(prop.getProperty("timeout"));
		
		switch(browser) {
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser");
			
		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		driver.get(url);
		
		
	}

}
