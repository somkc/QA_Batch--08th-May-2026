import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardFunctions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("John");
         driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("John123@gmail.com");
         driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("24 avenue street");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
         Thread.sleep(1000);
         driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
         Thread.sleep(1000);
         driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Keys.TAB);
         Thread.sleep(1000);
         driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
         driver.quit();
	     
	}
	

}
