import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFilling {
	
	public static int randomID() {
		int id=(int) (Math.random()*1000);
		System.out.println(id);
		return id;
	}
	

	public static void main(String[] args) {
         String uname="John"+randomID();
         System.out.println(uname);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("wick");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("21 baker street");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Newyork");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("NSW");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("2147");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("65432167");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("345345345");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		
	}

}
