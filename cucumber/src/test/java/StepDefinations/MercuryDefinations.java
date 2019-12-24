package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercuryDefinations {
	@Given("Mercury website is launched")
	public void mercury_website_is_launched() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("code for Launching website");

	}

	@Given("user clicks on sign up button")
	public void user_clicks_on_sign_up_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("code for clicking signup button");
	}

	@When("user enters proper data")
	public void user_enters_proper_data() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("code for enterining data");
	}

	@Then("clicks on submit button for account creation")
	public void clicks_on_submit_button_for_account_creation() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("code for clicking on Submit button for acc. creation");
	}

	@Given("registered user clicks on signIn link")
	public void registered_user_clicks_on_signIn_link() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("code for clicking on signIn link");
	}

	@Then("he provies valid data for login input fields")
	public void he_provies_valid_data_for_login_input_fields() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("valid data for login input");
	}

	@Then("clicks on submit button for the login validation")
	public void clicks_on_submit_button_for_the_login_validation() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("code for submit button for Login validation");
	}

	@Given("uer verifies the flights available")
	public void uer_verifies_the_flights_available() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		System.out.println("code for Flights availability");
	}

	@Then("selects the desired flight")
	public void selects_the_desired_flight() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		System.out.println("code for selection of flights");
	}

	@When("user makes the payments")
	public void user_makes_the_payments() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("code for Payments");
	}

	@Then("Tickets are generated")
	public void tickets_are_generated() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("code for ticket generation");
	}



}
