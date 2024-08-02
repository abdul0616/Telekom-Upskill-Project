package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	
	
	By UserName = By.id("user-name");
	
	By Password = By.id("password");
	
	By Login_button = By.id("login-button");
	


	public void Login_in(String username, String password) {
		
		driver.findElement(UserName).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(Login_button).click();
		


		
	}
	
	


}



