import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
        WebElement dropdown=driver.findElement(By.xpath("//select[@name='dropdown']"));
        Select sel= new Select(dropdown);
        Thread.sleep(2000);
        sel.selectByIndex(4);
        Thread.sleep(2000);
        sel.selectByValue("ddperformance");
        Thread.sleep(2000);
        sel.selectByContainsVisibleText("Manual Testing");
        
        int len=sel.getOptions().size();
        System.out.println("********************");
        System.out.println(len);
        for(int i=0;i<len;i++) {
        	String val=sel.getOptions().get(i).getText();
        	System.out.println(val);
        	
        }
        
        driver.quit();
      
	}

}
