package pages;



//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {
	
	WebDriver driver;
	
	public Checkout(WebDriver driver) {
		
		this.driver = driver;
		
		
		
	}
	
	
	
	

	
	By checkout_button = By.cssSelector("[data-test=\"checkout\"]");
	
	By UserName = By.id("first-name");
	
	By LastName = By.cssSelector("[data-test=\"lastName\"]");
	
	By Code = By.cssSelector("[data-test=\"postalCode\"]");
	
	By continue_button = By.cssSelector("[data-test=\"continue\"]");
	
	
	
	com.github.javafaker.Faker Faker = new com.github.javafaker.Faker();
	
    String firstName = Faker.name().firstName();
    String lastName = Faker.name().lastName();
    String post = Faker.address().fullAddress();
    
    
 
	
	public void Fillform() {
		
		driver.findElement(UserName).sendKeys(firstName);
		driver.findElement(LastName).sendKeys(firstName);
		driver.findElement(Code).sendKeys(post);
		driver.findElement(continue_button).click();

		

		
	}
	
	   
	public void verifyCheckoutFormValidation() {
		
		driver.findElement(checkout_button).click();
		driver.findElement(UserName).sendKeys(firstName);
		driver.findElement(continue_button).click();
		WebElement erorr = driver.findElement(By.cssSelector(" [data-test=\"error\"]"));
		
		Assert.assertEquals(erorr.getText(), "Error: Last Name is required");
	        

	    }

	
	


}



