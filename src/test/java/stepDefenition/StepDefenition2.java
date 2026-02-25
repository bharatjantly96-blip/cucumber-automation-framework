package stepDefenition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageRepository.LoginPage;
import utilities.BaseClass;

public class StepDefenition2 extends BaseClass {
	
	WebDriver driver = initialiseDriver();
	LoginPage obj = new LoginPage(driver);
	
	@Given("user opens the application")
	public void user_opens_the_application() {
		
		getTitle();

	}

	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String username) {
	   
		obj.enterUserName(username);
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
	 
		obj.enterPassword(password);
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	
		obj.clickLogin();

	}

	@Then("user navigated to the homepage")
	public void user_navigated_to_the_homepage() {
        
	}
}
