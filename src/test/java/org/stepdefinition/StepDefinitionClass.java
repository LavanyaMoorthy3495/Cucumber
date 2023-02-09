package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass {
	
	
	
	@Given("User have to enter fb login page")
	public void user_have_to_enter_fb_login_page() {
	  
		System.out.println("FB App =====> Login");
	}

	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
	    
		System.out.println("Email Add & Password ");
	}
	
	@When("User have to click login button")
	public void user_have_to_click_login_button() {
		
		System.out.println("Login Button");
	}
	     
	@Then("User have to be in invalid credentials page")
	public void user_have_to_be_in_invalid_credentials_page() {
	   
		System.out.println("Error Page");
	
	}

}
