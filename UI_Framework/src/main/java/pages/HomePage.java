package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testbase.TestBase;
import testutil.TestUtil;

public class HomePage extends TestBase {
	
	 @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	 public WebElement addToCart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	public WebElement cart;
	
   @FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
   public WebElement removeButton;
   
   @FindBy(xpath="//select[@class='product_sort_container']")
   public WebElement filter;
   
    public HomePage() {
    	PageFactory.initElements(driver, this);
    	
    }
    
	public void itemsToCart() {
		addToCart.click();
		cart.click();
	}
	
	public void removeItem() {
		addToCart.click();
		removeButton.click();
		//driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
		
	}
	public void sort(int index) {
		TestUtil.selectByIndex(filter, index);
	}
	
}
