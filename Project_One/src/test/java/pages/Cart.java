package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Cart {
	
	WebDriver driver;
	
	public Cart(WebDriver driver) {
		
		this.driver = driver;
		
		
		
	}
	
	
	
	
	By cart = By.cssSelector("[data-test=\"shopping-cart-link\"]");
	
	By Lastitem = By.cssSelector("[data-test=\"remove-sauce-labs-bolt-t-shirt\"]");
	
	By Priceitem3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	
	
	
	
	

	
	public void Checkout() {
		
		
		
		
		driver.findElement(cart).click();
//		Assert.assertEquals(ItemAdded.getText(), "2");
		driver.findElement(Lastitem).click();
//		Assert.assertEquals(ItemAdded.getText(), "3");
		
	}
	
	


}



