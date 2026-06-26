import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFrame {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://demo.automationtesting.in/Frames.html");
	        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	      Thread.sleep(3000);
	        WebElement mainFrame=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")); 
	       driver.switchTo().frame(mainFrame); 
	       WebElement childFrame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	      driver.switchTo().frame(childFrame);
	       Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test");


	}

}
