package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;







public class AddCart {
	
	WebDriver driver;
	
	public AddCart(WebDriver driver) {
		
		this.driver = driver;
		
		
		
	}
	
	
	
	
	By item1 = By.id("add-to-cart-sauce-labs-backpack");
	
	By item2 = By.id("add-to-cart-sauce-labs-bike-light");
	
	By item3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	
	By numb = By.cssSelector("[data-test=\"shopping-cart-badge\"]");
	
	
	

	
	public void AddItem() {
		

		driver.findElement(item1).click();
		WebElement ItemAdded = driver.findElement(By.cssSelector("[data-test=\"shopping-cart-badge\"]"));
		Assert.assertEquals(ItemAdded.getText(), "1");
		driver.findElement(item2).click();
		Assert.assertEquals(ItemAdded.getText(), "2");
		driver.findElement(item3).click();
		Assert.assertEquals(ItemAdded.getText(), "3");
		
		

		
	}
	
	


}



