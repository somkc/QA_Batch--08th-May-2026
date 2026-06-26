import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement table=driver.findElement(By.xpath("//table[@id='table1']"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		List<WebElement> header=rows.get(0).findElements(By.tagName("th"));
		List<WebElement> firstRow=rows.get(1).findElements(By.tagName("td"));
		List<WebElement> secondRow=rows.get(2).findElements(By.tagName("td"));
		List<WebElement> thirdRow=rows.get(3).findElements(By.tagName("td"));
		List<WebElement> fourthRow=rows.get(4).findElements(By.tagName("td"));
		
		System.out.println("headers-> "+header.size());
		System.out.println("first row -> "+firstRow.size());
		System.out.println("*****************************");
		 String h1=header.get(0).getText();
		 String h2=header.get(1).getText();
		 String h3=header.get(2).getText();
		 System.out.println(h1+" | "+h2+" | " +h3);
		 
		 String c1=firstRow.get(0).getText();
		 String c2=firstRow.get(1).getText();
		 String c3=firstRow.get(2).getText();
		 System.out.println(c1+" | "+c2+" | " +c3);
		 
		 
		 String c11=secondRow.get(0).getText();
		 String c12=secondRow.get(1).getText();
		 String c13=secondRow.get(2).getText();
		 System.out.println(c11+" | "+c12+" | " +c13);
		 
		 String c21=thirdRow.get(0).getText();
		 String c22=thirdRow.get(1).getText();
		 String c23=thirdRow.get(2).getText();
		 System.out.println(c21+" | "+c22+" | " +c23);
		 
		 String c31=fourthRow.get(0).getText();
		 String c32=fourthRow.get(1).getText();
		 String c33=fourthRow.get(2).getText();
		 System.out.println(c31+" | "+c32+" | " +c33);
		
	
        driver.quit();
	}

}
