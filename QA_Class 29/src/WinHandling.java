



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> wins=driver.getWindowHandles();
		System.out.println(wins.size());
		Iterator<String> it = wins.iterator();
		String win1=it.next();
		String win2=it.next();
		System.out.println(win1);
		System.out.println(win2);
		driver.switchTo().window(win2);
		driver.findElement(By.xpath("//a[normalize-space()='See Privacy Statement']")).click();
	//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username");
	
		
	}

}
