package com.test.steps;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Steps  {
	
	@Given("user enter url")
	public void user_enter_url() {
	   System.out.println("******** user enters url *********");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		  System.out.println("******** user enters username and password *********"); 
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		  System.out.println("******** user clicks on login button *********");
	}

	@Then("user account will direct to home page")
	public void user_account_will_direct_to_home_page() {
		  System.out.println("******** user account will redirect to home page *********");
	}


	
}



