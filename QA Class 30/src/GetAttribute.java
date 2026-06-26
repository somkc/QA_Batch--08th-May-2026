import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String placeholder=driver.findElement(By.xpath("//input[@id='user-name']")).getAttribute("placeholder");
		String classValue=driver.findElement(By.xpath("//input[@id='user-name']")).getAttribute("class");
		String type=driver.findElement(By.xpath("//input[@id='user-name']")).getAttribute("type");
		
		System.out.println(placeholder);
		System.out.println(classValue);
		System.out.println(type);
		driver.quit();
	}

}
