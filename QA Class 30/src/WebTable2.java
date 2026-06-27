import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement table=driver.findElement(By.xpath("//table[@id='table1']"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		List<WebElement> header=rows.get(0).findElements(By.tagName("th"));
		String h1=header.get(0).getText();
		 String h2=header.get(1).getText();
		 String h3=header.get(2).getText();
		 System.out.println(h1+" | "+h2+" | " +h3);
		    for(int i=1;i<rows.size();i++) {
			List<WebElement> Row=rows.get(i).findElements(By.tagName("td"));
			
			String c1=Row.get(0).getText();
			String c2=Row.get(1).getText();
			String c3=Row.get(2).getText();
			 System.out.println(c1+" | "+c2+" | " +c3);
			}
	driver.quit();
	}
}
