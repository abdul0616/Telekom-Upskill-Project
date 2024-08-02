package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.qameta.allure.Step;
import pages.AddCart;
import pages.Cart;
import pages.Checkout;
import pages.FinishCheckout;
import pages.Login;

public class TestMethods {

	WebDriver driver ;
	
	@BeforeTest
	public void beforeTest() {
		
		driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	

	@Step("Test case 001")
	@Test(priority = 1)
	public void Shopping(){
		Login form = new Login(driver);
		form.Login_in("standard_user","secret_sauce");
	
	}
	
	@Step("Test case 002")
	@Test(priority = 2)
	public void AddingItems() {
		AddCart add = new AddCart(driver);
		add.AddItem();
		
	}
	@Step("Test case 003")
	@Test(priority = 3)
	public void Cart() {
		Cart cart = new Cart(driver);
		cart.Checkout();
	}
	
	@Step("Test case 004")
	@Test(priority =4)
	public void checkout(){
		Checkout check = new Checkout(driver);
		check.verifyCheckoutFormValidation();
		check.Fillform();
		
	}
	
	@Step("Test case 005")
	@Test(priority = 5)
	public void Finish() {
		FinishCheckout finish = new FinishCheckout(driver);
		finish.getItemPrices();
		finish.TaxAndTotalSum();
		finish.Success_message();
	}
	

}

