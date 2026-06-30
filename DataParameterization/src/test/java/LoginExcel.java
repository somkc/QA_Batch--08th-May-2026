import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExcel {

	public static void main(String[] args) throws InterruptedException {
		Xls_Reader xls= new Xls_Reader("S:\\STUDY\\JANBASK\\QA Batch - 08th May 2026\\DataParameterization\\src\\test\\java\\TestData\\SAUCE_LOGIN.xlsx");
		int rows=xls.getRowCount("SAUCE");
		System.out.println(rows);
		for(int i=2;i<=rows;i++) {
		String username=xls.getCellData("SAUCE", "USERNAME", i);
		String password=xls.getCellData("SAUCE", "PASSWORD", i);
		
		System.out.println(username+"| "+password);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    Thread.sleep(3000);
	    driver.quit();

	}
	}

}
