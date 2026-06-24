import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAllSelection {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropdown=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
       Select sel= new Select(dropdown);
       int size=sel.getOptions().size();
       System.out.println(size);
       for(int i=0;i<size;i++) {
    	 String value=sel.getOptions().get(i).getText();
    	 System.out.println(value);
    	 sel.selectByVisibleText(value);
       }
		
	}

}
