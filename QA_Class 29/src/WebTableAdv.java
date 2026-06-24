import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAdv {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement table=driver.findElement(By.xpath("//table[@id='table1']"));
        List<WebElement> rows=table.findElements(By.tagName("tr")); 
        System.out.println("total rows-->"+rows.size());
        
        List<WebElement> row0=rows.get(0).findElements(By.tagName("th"));
        System.out.println("total columns in the first row-> "+row0.size());
        System.out.print(row0.get(0).getText()+" | ");
        System.out.print(row0.get(1).getText()+" | ");
        System.out.println(row0.get(2).getText()+" | ");
        
        for(int i=1;i<rows.size();i++) {
        	 List<WebElement> row=rows.get(i).findElements(By.tagName("td"));
        	 System.out.print(row.get(0).getText()+" | ");
             System.out.print(row.get(1).getText()+" | ");
             System.out.println(row.get(2).getText()+" | ");
        }
        driver.quit();
	}

}
