import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//button[@name='proceed']")).click();
		Alert al= driver.switchTo().alert();
		String text=al.getText();
		System.out.println(text);
		Thread.sleep(2000);
		//al.accept();// click ok
		al.dismiss();// click cancel
		
		
	}

}
