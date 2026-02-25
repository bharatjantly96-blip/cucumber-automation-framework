package stepDefenition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageRepository.LoginPage;
import pageRepository.NewCustomerPage;
import utilities.BaseClass;

public class StepDefenition2 extends BaseClass {
	
	WebDriver driver = initialiseDriver();
	LoginPage obj = new LoginPage(driver);
	NewCustomerPage obj1 = new NewCustomerPage(driver);
	
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
		
		String URL = getCurrentURL();
		if (URL.contains("homepage"))
		{
			System.out.println("User is navigated to the home page");
		}
		else
		{
			throw new NullPointerException("Page navigation is not successful");
		}       
	}
	
	@Given("user is on the home page of the application")
	public void user_is_on_the_home_page_of_the_application() {
		getTitle();
	}

	@Given("user clicks on the New Customer link")
	public void user_clicks_on_the_new_customer_link() {
        obj1.clickOnNewCustLink();
	}

	@Given("user enters the customer name as {string}")
	public void user_enters_the_customer_name_as(String cust_name) {
        obj1.enterCustomerName(cust_name);
	}
	
	@Given("user selects a gender")
	public void user_selects_a_gender() {
	 obj1.selectGender();
	}
	
	@Given("user enters address as {string}")
	public void user_enters_address_as(String address) {
	   obj1.enterAddress(address);
	}
	
	@Given("user enters a date of birth as {string}")
	public void user_enters_a_date_of_birth_as(String dob) {
	obj1.enterDOB(dob);
	}

	@Given("user enters city name as {string}")
	public void user_enters_city_name_as(String city) {
	obj1.enterCity(city);
	}

	@Given("user enters phone number as {string}")
	public void user_enters_phone_number_as(String phone) {
	obj1.enterMobile(phone);
	}

	

	@Given("user enters state as {string}")
	public void user_enters_state_as(String state) {
	   obj1.enterState(state);
	}
	
	@Given("user enters pin as {string}")
	public void user_enters_pin_as(String pin) {
	   obj1.enterPIN(pin);
	}
	
	@Given("user enters email as {string}")
	public void user_enters_email_as(String email) {
	  obj1.enterEmail(email);
	}




	@Then("user a new customer is created")
	public void user_a_new_customer_is_created() {

	}

	@Then("user captures the cust_id")
	public void user_captures_the_cust_id() {
      
	}
	








	
	@When("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
	  obj1.clickSubmit();
	}
	




}
