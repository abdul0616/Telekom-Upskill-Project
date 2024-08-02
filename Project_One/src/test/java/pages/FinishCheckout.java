package pages;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class FinishCheckout {
	
	WebDriver driver;
	
	public FinishCheckout(WebDriver driver) {
		
		this.driver = driver;
		
		
		
	}
	
	
	
	

	
	By checkout_button = By.cssSelector("[data-test=\"checkout\"]");
	
	By UserName = By.id("first-name");
	
	By LastName = By.cssSelector("[data-test=\"lastName\"]");
	
	By Code = By.cssSelector("[data-test=\"postalCode\"]");
	
	By continue_button = By.cssSelector("[data-test=\"continue\"]");
	
	By finish_button = By.cssSelector("[data-test=\"finish\"]");
	
	By item_prices = By.cssSelector("[data-test=\"inventory-item-price\"]");
	
	
	
	  public void getItemPrices() {
		  WebElement subtotal = driver.findElement(By.cssSelector(" [data-test=\"subtotal-label\"]"));
		  String totalAmount = subtotal.getText().split("\\$")[1];
		  
		  List<WebElement> Elements = driver.findElements(item_prices);
		  float total = 0;
		  
		  for(WebElement element: Elements) {
			  String Element = element.getText().split("\\$")[1];
			  total += Float.parseFloat(Element);
			  System.out.println(Element);
		  }
		  Assert.assertEquals(total, Float.parseFloat(totalAmount));
	       System.out.println(total);
//	       System.out.println(elements);
	    }
	


	
	public void TaxAndTotalSum() {
		WebElement subtotal = driver.findElement(By.cssSelector(" [data-test=\"subtotal-label\"]"));
		WebElement tax = driver.findElement(By.cssSelector(" [data-test=\"tax-label\"]"));
		WebElement itemTotal = driver.findElement(By.cssSelector(" [data-test=\"total-label\"]"));
		
		
		String[] subAmount = subtotal.getText().split("\\$");
		
		String[] taxAmount = tax.getText().split("\\$");
		
		String totalAmount = itemTotal.getText().split("\\$")[1];
		float total = Float.parseFloat(subAmount[1]) + Float.parseFloat(taxAmount[1]);
		Assert.assertEquals(total, Float.parseFloat(totalAmount));
		


	}
	
	
	public void Success_message() {
		
		 driver.findElement(finish_button).click();
		WebElement successMessage = driver.findElement(By.cssSelector("[data-test=\"complete-header\"]"));
		
		Assert.assertEquals(successMessage.getText(), "Thank you for your order!");

		
	}
	

	

	


}



