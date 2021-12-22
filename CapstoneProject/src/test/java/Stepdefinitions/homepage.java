package Stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homepage {
	@Given("user has opened Application")
	public void user_has_opened_application() {
	    
	}
	@When("user opens Home page")
	public void user_opens_home_page() {
		booking.driver.findElement(By.xpath("//a[@href='home']")).click();
	}
	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
	    
	}

}
