package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.NovemberProject.BaseclassForAdactin;
import com.Runner.AdactinRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepDefinition extends BaseclassForAdactin{
	
	public static WebDriver dr = AdactinRunner.dr;
	//public static LoginPage l = new LoginPage(dr);
	
	@Given("^User can able to launch the URL$")
	public void user_can_able_to_launch_the_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^User can able to enter the username in textbox$")
	public void user_can_able_to_enter_the_username_in_textbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^User can able to enter the password in password field$")
	public void user_can_able_to_enter_the_password_in_password_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^User can able to click login button and it is navigate to home page$")
	public void user_can_able_to_click_login_button_and_it_is_navigate_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}
