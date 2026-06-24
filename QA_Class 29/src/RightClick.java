import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Actions action = new Actions(driver);
		WebElement button=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		Thread.sleep(2000);
		action.contextClick(button).build().perform();//right click
	
	}

}
